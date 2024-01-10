package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.SitterRating;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRatingRepository;

@RestController
@RequestMapping(path="/api/sitterRatings")

public class SitterRatingController {


    private Logger logger= LoggerFactory.getLogger(SitterRatingController.class);

    @Autowired
    private SitterRatingRepository sitterRatingRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<SitterRating> getSitterRating(){
        logger.info("Sending the rating off all the sitters");
        return sitterRatingRepository.findAll();

    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public SitterRating saveSitterRating(@RequestBody SitterRating sitterRating){
        SitterRating savedSitterRating = sitterRatingRepository.save(sitterRating);
        logger.info("Saving Sitter Rating with id " + savedSitterRating.getRaId());

        return savedSitterRating;
    }

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public SitterRating ids(@RequestParam (name= "RaId") int id){
        logger.info("Sending sitter rating with id:" + id);
        return sitterRatingRepository.findByRaId(id);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteBysitterRatingId(@RequestParam(name = "RaId") int id) {
        logger.info("Attempting to delete Sitter Rating with id: " + id);

        if (sitterRatingRepository.existsById(id)) {
            sitterRatingRepository.deleteById(id);
            logger.info("Deleted sitter Rating with id:" + id);
            return ResponseEntity.ok("Sitter Rating with id " + id + " was successfully deleted.");
        } else {
            logger.info("Sitter Rating with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sitter Rating with id " + id + " not found.");
        }

    }

}
