package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.repositories.StereotypeRepository;

@Service
public class SecondStereotypeService {

    private final StereotypeRepository stereotypeRepository;
    public SecondStereotypeService(StereotypeRepository stereotypeRepository) {
        this.stereotypeRepository = stereotypeRepository;
    }

    public StereotypeRepository getStereotypeRepository() {
        return stereotypeRepository;
    }
}
