package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.responses.Response;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.UserService;

import java.time.LocalDate;


@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getUsers(){
        logger.info("Sending all Users");
        return userRepository.findAll();
    }

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestParam(name = "userEmail") String email,
                      @RequestParam(name = "userPassword") String password){
        logger.info("sending user with email:"+email);
        return userRepository.findByUserEmailAndUserPassword(email, password);

    }


    /*@PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        logger.info("Saving user with id " + savedUser.getUserId());
        return savedUser;
    }*/

    @DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteUser(@PathVariable int id) {
        logger.info("Deleting user with id " + id);
        // No verification to see if it exists
        userRepository.deleteById(id);
        return new Response("Deleted user with id " + id, null);
    }

    @GetMapping(path = "/{text:[^0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getUser(@PathVariable(value = "text") String text) {
        logger.info("User with name like " + text);
        return userRepository.findByUserNameContaining(text);
    }




    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        // Verifica se Access e Place estão presentes e têm IDs válidos
        Integer userAcId = user.getAccess() != null ? user.getAccess().getAcId() : null;
        Integer userPlaId = user.getPlace() != null ? user.getPlace().getPlaId() : null;

        if (userAcId == null || userPlaId == null) {
            // Retorna um erro ou cria IDs padrão, dependendo da sua lógica de negócios
            return ResponseEntity.badRequest().body("Access ID and Place ID must be provided");
        }

        // Extrai os IDs


        int userId = user.getUserId();
        LocalDate userBdate = user.getUserBdate();
        byte[] userUpload = user.getUserUpload();
        String userAddress = user.getUserAddress();
        String userMobile = user.getUserMobile();
        String userEmail = user.getUserEmail();
        String userPassword = user.getUserPassword();
        String userName = user.getUserName();
        String userGender=user.getUserGender();

        // Demais atributos do User
        // ... (mantenha o código existente aqui para extrair os outros atributos do User)

        // Criando um novo usuário
        User savedUser = userService.createUser(userId, userBdate, userUpload, userAddress,
                userMobile, userEmail, userPassword,
                userName, userAcId, userPlaId, userGender);
        logger.info("Saving user with id " + savedUser.getUserId());
        return ResponseEntity.ok(savedUser);
    }


}
