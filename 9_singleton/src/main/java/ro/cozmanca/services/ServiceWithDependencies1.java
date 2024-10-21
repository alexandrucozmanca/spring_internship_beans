package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.repositories.SingletonRepository;

@Service
public class ServiceWithDependencies1 {
    private final SingletonRepository  repository;

    public ServiceWithDependencies1(SingletonRepository repository) {
        this.repository = repository;
    }

    public SingletonRepository getRepository() {
        return repository;
    }
}
