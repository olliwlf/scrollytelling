package services.implementations;

import entities.EducationDirection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.IEducationDirectionRepository;
import services.IEducationDirectionService;

import java.util.List;

@Service
public class EducationDirectionService implements IEducationDirectionService {
    @Autowired
    private IEducationDirectionRepository educationDirectionRepository;

    @Override
    public List<EducationDirection> getAll() { return educationDirectionRepository.findAll(); }
}
