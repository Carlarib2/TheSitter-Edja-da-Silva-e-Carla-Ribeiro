package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.StatusRepository;

@RestController
@RequestMapping(path="/api/status")
public class StatusController {

    private Logger logger= LoggerFactory.getLogger(StatusController.class);

    @Autowired
    private StatusRepository statusRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
        private Iterable<Status> getStatus(){
        logger.info("sending all status");
        return statusRepository.findAll();
    }
}
