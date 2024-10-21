package ro.cozmanca.services;

import org.springframework.stereotype.Service;
import ro.cozmanca.repositories.StereotypeRepository;

@Service
public class StereotypeService {

    private final StereotypeRepository stereotypeRepository;
    public StereotypeService(StereotypeRepository stereotypeRepository) {
        this.stereotypeRepository = stereotypeRepository;
    }

    public StereotypeRepository getStereotypeRepository() {
        return stereotypeRepository;
    }
}
