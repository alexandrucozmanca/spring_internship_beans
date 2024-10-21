package ro.cozmanca.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import ro.cozmanca.models.Invoice;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class ModifiedAmountLoggingAspect {
    Logger logger = Logger.getLogger(ModifiedAmountLoggingAspect.class.getName());


    @Around("execution(ro.cozmanca.models.Invoice ro.cozmanca.services.ModifiedInvoiceQuantityService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                " will execute");

        Invoice modifiedInvoice = new Invoice(10, 20);
        Object[] modifiedArgs = {modifiedInvoice};
        Object returnValue = joinPoint.proceed(modifiedArgs);

        logger.info("Method executed and returned " + returnValue);
        return returnValue;
    }
}
