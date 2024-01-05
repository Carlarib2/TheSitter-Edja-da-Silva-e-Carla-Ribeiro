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
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.SitterRating;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRepository;


@RestController
@RequestMapping(path= "/api/sitters")

public class SitterController {

    private Logger logger = LoggerFactory.getLogger(SitterController.class);

    @Autowired
    private SitterRepository sitterRepository;

    @GetMapping(path= "/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Sitter> getSitters(){
        logger.info("Sending all the Sitters");
        return sitterRepository.findAll();

    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Sitter saveSitter(@RequestBody Sitter sitter){
        Sitter savedSitter = sitterRepository.save(sitter);
        logger.info("Saving sitter with id " + savedSitter.getSitId());

        return savedSitter;
    }

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public Sitter ids(@RequestParam (name= "sitId") int id){
        logger.info("Sending sitter with id:" + id);
        return sitterRepository.findBySitId(id);
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

}
