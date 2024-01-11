package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Client;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Sitter;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserRepository;


@RestController
@RequestMapping(path= "/api/sitters")

public class SitterController {

    private Logger logger = LoggerFactory.getLogger(SitterController.class);

    @Autowired
    private SitterRepository sitterRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path= "/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Sitter> getSitters(){
        logger.info("Sending all the Sitters");
        return sitterRepository.findAll();

    }

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public Sitter ids(@RequestParam (name= "sitId") int id){
        logger.info("Sending sitter with id:" + id);
        return sitterRepository.findBySitId(id);
    }

    @GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
    public Sitter login(@RequestParam(name = "userEmail") String email,
                        @RequestParam(name = "userPassword") String password){
        logger.info("sending user with email:"+email);

        User user = userRepository.findByUserEmailAndUserPassword(email, password);
        return sitterRepository.findByUser(user);
    }


/*
    @GetMapping(path = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Sitter getByUserId(@PathVariable int userId) {
        logger.info("Sending sitter with userId="+userId);
        return sitterRepository.findBySitUserId(userId);
    }

 */

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Sitter saveSitter(@RequestBody Sitter sitter){
        sitter.setUser(userRepository.save(sitter.getUser()));

        Sitter savedSitter = sitterRepository.save(sitter);
        logger.info("Saving sitter with id " + savedSitter.getSitId());

        return savedSitter;
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteBysitterId(@RequestParam(name = "sitId") int id) {
        logger.info("Attempting to delete Sitter with id: " + id);

        if (sitterRepository.existsById(id)) {
            sitterRepository.deleteById(id);
            logger.info("Deleted sitter Rating with id:" + id);
            return ResponseEntity.ok("Sitter with id " + id + " was successfully deleted.");
        } else {
            logger.info("Sitter Rating with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sitter with id " + id + " not found.");
        }

    }


    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateSitter(@PathVariable("id") int id, @RequestBody Sitter updatedSitter) {
        logger.info("Attempting to update Sitter with id: " + id);

        if (sitterRepository.existsById(id)) {
            Sitter existingSitter = sitterRepository.findById(id).get();

            existingSitter.setSitAboutMe(updatedSitter.getSitAboutMe());
            existingSitter.setSitEducation(updatedSitter.getSitEducation());
            existingSitter.setSitExperience(updatedSitter.getSitExperience());
            existingSitter.setSitReliability(updatedSitter.getSitReliability());
            existingSitter.setSitResponseRate(updatedSitter.getSitResponseRate());


            sitterRepository.save(existingSitter);

            logger.info("Updated Sitter with id: " + id);
            return ResponseEntity.ok(existingSitter);
        } else {
            logger.info("Sitter with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sitter with id " + id + " not found.");
        }
    }

}
