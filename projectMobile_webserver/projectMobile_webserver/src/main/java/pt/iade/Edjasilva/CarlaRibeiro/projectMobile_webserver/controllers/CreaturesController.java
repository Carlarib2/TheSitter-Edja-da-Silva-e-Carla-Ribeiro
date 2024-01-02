package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Creatures;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.CreaturesRepository;

@RestController
@RequestMapping(path="/api/creatures")

public class CreaturesController {

    private Logger logger = LoggerFactory.getLogger(CreaturesController.class);

    @Autowired
    private CreaturesRepository creaturesRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    Iterable<Creatures> getCreatures(){
        logger.info("sending all creatures");
        return creaturesRepository.findAll();
    }
}
