package ro.cozmanca.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class LazyService {
    public LazyService() {
        System.out.println("LazyService created");
    }
}
