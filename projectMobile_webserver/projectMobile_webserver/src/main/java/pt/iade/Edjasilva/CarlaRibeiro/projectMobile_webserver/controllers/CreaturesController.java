package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.CreaturesRepository;

public class CreaturesController {

    private Logger logger = LoggerFactory.getLogger(CreaturesController.class);

    @Autowired
    private CreaturesRepository creaturesRepository;
}
