package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.repositories.SingletonRepository;

@Service
public class ServiceWithDependencies2 {
    private final SingletonRepository  repository;

    public ServiceWithDependencies2(SingletonRepository repository) {
        this.repository = repository;
    }

    public SingletonRepository getRepository() {
        return repository;
    }
}
