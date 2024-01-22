package Diaaland.ma.demo.entity;

@Service
public class ExperiencesService {
    private final ExperiencesRepository experienceRepository;

    public ExperiencesService(ExperiencesRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }

    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    public Experiences getExperienceById(Long id) {
        return experienceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expérience non trouvée avec l'ID : " + id));
    }

    public Experiences saveExperience(Experiences experience) {
        return experienceRepository.save(experience);
    }

    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

}

