package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.Sitter_ratingRepository;

public class Sitter_ratingController {


    private Logger logger= LoggerFactory.getLogger(Sitter_ratingController.class);

    @Autowired
    private Sitter_ratingRepository sitterRatingRepository;
}
