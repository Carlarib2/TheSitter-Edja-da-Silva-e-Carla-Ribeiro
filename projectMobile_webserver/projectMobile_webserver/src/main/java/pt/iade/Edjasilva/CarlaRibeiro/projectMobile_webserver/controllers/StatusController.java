package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.StatusRepository;

public class StatusController {

    private Logger logger= LoggerFactory.getLogger(StatusController.class);

    @Autowired
    private StatusRepository statusRepository;
}
