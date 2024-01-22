package Diaaland.ma.demo;

import Diaaland.ma.demo.entity.Experiences;
import Diaaland.ma.demo.entity.UsersRegistrationDto;
import Diaaland.ma.demo.entity.UsersRepository;
import Diaaland.ma.demo.entity.UsersService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Service
	public class UsersServiceImpl implements UsersService {
		private final UsersRepository usersRepository;
		private final PasswordEncoder passwordEncoder;

		@Autowired
		public UsersServiceImpl(UsersRepository usersRepository, PasswordEncoder passwordEncoder) {
			this.usersRepository = usersRepository;
			this.passwordEncoder = passwordEncoder;
		}

		@Override
		public Users save(UsersRegistrationDto registrationDto) {
			Users user = new Users();
			user.setUsername(registrationDto.getUsername());
			user.setEmail(registrationDto.getEmail());
			user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
			return usersRepository.save(user);
		}

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username);
			if (user == null) {
				throw new UsernameNotFoundException("Invalid username or password.");
			}
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), new ArrayList<>());
		}
	}
	@Controller
	public class LoginController {
		private final UsersService userService;

		@Autowired
		public LoginController(UsersService userService) {
			this.usersService = userService;
		}

		@GetMapping("/login")
		public String showLoginForm(Model model) {
			model.addAttribute("user", new UsersRegistrationDto());
			return "login";
		}

		@PostMapping("/login")
		public String processLoginForm(@ModelAttribute("user") @Valid UsersRegistrationDto userDto, BindingResult result, @RequestParam("acceptTerms") boolean acceptTerms) {
			if (!acceptTerms) {
				result.rejectValue("acceptTerms", "error.user", "You must accept the terms of use.");
			}

			if (result.hasErrors()) {
				return "login";
			}

			if (!userDto.getPassword().equals(userDto.getConfirmPassword())) {
				result.rejectValue("confirmPassword", "error.user", "Password and Confirm Password do not match.");
				return "login";
			}

			userService.save(userDto);

			return "redirect:/welcome";
		}
	}
	@RestController
	@RequestMapping("/experiences")
	public class ExperiencesController {
		private final ExperiencesService experienceService;

		public ExperiencesController(ExperiencesService experienceService) {
			this.experienceService = experienceService;
		}

		@GetMapping
		public List<Experiences> getAllExperiences() {
			return experienceService.getAllExperiences();
		}

		@GetMapping("/{id}")
		public Experiences getExperienceById(@PathVariable Long id) {
			return experienceService.getExperienceById(id);
		}

		@PostMapping
		public Experiences createExperience(@RequestBody Experience experience) {
			return experienceService.saveExperience(experience);
		}

		@PutMapping("/{id}")
		public Experiences updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
			Experiences existingExperience = experienceService.getExperienceById(id);
			existingExperience.setTitle(experience.getTitle());
			existingExperience.setDescription(experience.getDescription());
			existingExperience.setLocation(experience.getLocation());
			return experienceService.saveExperience(existingExperience);
		}

		@DeleteMapping("/{id}")
		public ResponseEntity<String> deleteExperience(@PathVariable Long id) {
			experienceService.deleteExperience(id);
			return ResponseEntity.ok("Expérience supprimée avec succès.");
		}
	}

			}


