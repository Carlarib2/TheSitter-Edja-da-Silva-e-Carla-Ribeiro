package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserRepository;



@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;


    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getUsers(){
        logger.info("Sending all Users");
        return userRepository.findAll();
    }

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public User ids(@RequestParam (name= "userId") int id){
        logger.info("Sending user with id:" + id);
        return userRepository.findByUserId(id);
    }

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestParam(name = "userEmail") String email,
                      @RequestParam(name = "userPassword") String password){
        logger.info("sending user with email:"+email);
        return userRepository.findByUserEmailAndUserPassword(email, password);

    }

    @GetMapping(path="/name", produces=MediaType.APPLICATION_JSON_VALUE)
    public User names (@RequestParam(name= "userName") String name){
        logger.info("Sending user with name:" + name);
        return userRepository.findByUserName(name);
    }



    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        logger.info("Saving user with id " + savedUser.getUserId());
        return savedUser;


    /*@DeleteMapping(path = "/{id:[0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response deleteUser(@PathVariable int UserId) {
        logger.info("Deleting user with id " + UserId);

        userRepository.deleteById(UserId);
        return new Response("Deleted user with id " + UserId, null);
    }

    /*@GetMapping(path = "/{text:[^0-9]+}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getUser(@PathVariable(value = "text") String text) {
        logger.info("User with name like " + text);
        return userRepository.findByUserNameContaining(text);
    }*/






        // Extrai os IDs


        /*int userId = user.getUserId();
        LocalDate userBdate = user.getUserBdate();
        byte[] userUpload = user.getUserUpload();
        String userAddress = user.getUserAddress();
        String userMobile = user.getUserMobile();
        String userEmail = user.getUserEmail();
        String userPassword = user.getUserPassword();
        String userName = user.getUserName();
        String userGender=user.getUserGender();
        */



    }


}
