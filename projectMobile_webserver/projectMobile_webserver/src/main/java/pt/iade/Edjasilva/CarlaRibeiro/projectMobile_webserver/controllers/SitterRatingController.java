package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.SitterRating;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRatingRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRepository;

@RestController
@RequestMapping(path="/api/sitterRating")

public class SitterRatingController {


    private Logger logger= LoggerFactory.getLogger(SitterRatingController.class);

    @Autowired
    private SitterRatingRepository sitterRatingRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    private Iterable<SitterRating> getSitterRating(){
        logger.info("Sending the rating off all the sitters");
        return sitterRatingRepository.findAll();

    }
}
