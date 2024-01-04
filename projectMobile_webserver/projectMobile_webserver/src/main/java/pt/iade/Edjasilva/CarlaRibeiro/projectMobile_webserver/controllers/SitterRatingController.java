package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.SitterRating;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRatingRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRepository;

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
}
