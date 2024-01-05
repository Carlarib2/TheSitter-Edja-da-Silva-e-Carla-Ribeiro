package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Booking;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.responses.Response;


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



    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByUserId(@RequestParam(name = "userId") int id) {
        logger.info("Attempting to delete user with id: " + id);

        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            logger.info("Deleted user with id:" + id);
            return ResponseEntity.ok("User with id " + id + " was successfully deleted.");
        } else {
            logger.info("User with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with id " + id + " not found.");
        }
    }

    @DeleteMapping(path="/name" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByUserName(@RequestParam(name = "userName") String name) {
        logger.info("Attempting to delete user with name: " + name);

        if (userRepository.existsByUserName(name)) {
            userRepository.deleteByUserName(name);
            logger.info("Deleted user with name:" + name);
            return ResponseEntity.ok("User with name " + name + " was successfully deleted.");
        } else {
            logger.info("User with name " + name + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with name " + name + " not found.");
        }
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


    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody User updatedUser) {
        logger.info("Attempting to update Booking with id: " + id);

        if (userRepository.existsById(id)) {
            User existingUser = userRepository.findById(id).get();

            existingUser.setUserBdate(updatedUser.getUserBdate());
            existingUser.setUserUpload(updatedUser.getUserUpload());
            existingUser.setUserAddress(updatedUser.getUserAddress());
            existingUser.setUserMobile(updatedUser.getUserMobile());
            existingUser.setUserEmail(updatedUser.getUserEmail());
            existingUser.setUserPassword(updatedUser.getUserPassword());
            existingUser.setUserGender(updatedUser.getUserGender());

            userRepository.save(existingUser);

            logger.info("Updated user with id: " + id);
            return ResponseEntity.ok(existingUser);
        } else {
            logger.info("User with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with id " + id + " not found.");
        }
    }
}