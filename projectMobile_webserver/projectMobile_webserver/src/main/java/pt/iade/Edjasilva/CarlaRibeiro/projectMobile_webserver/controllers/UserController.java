package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.exceptions.NotFoundException;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.responses.Response;

import java.util.Optional;


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

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public User login(@RequestParam(name = "userEmail") String email,
                      @RequestParam(name = "userPassword") String password){
        logger.info("sending user with email:"+email);
        return userRepository.findByUserEmailAndUserPassword(email, password);

    }


    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        logger.info("Saving user with id " + savedUser.getUserId());
        return savedUser;
    }

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


}
