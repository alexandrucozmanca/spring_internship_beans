package ro.cozmanca.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggingAspect {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Around(value = "@annotation(ro.cozmanca.annotations.ToLog)")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("Logging Aspect: Method executed and returned " +
                returnedValue);
        return returnedValue;
    }
}
