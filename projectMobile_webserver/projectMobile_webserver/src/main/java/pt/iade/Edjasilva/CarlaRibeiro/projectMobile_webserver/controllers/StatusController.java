package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.UserChat;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.StatusRepository;

@RestController
@RequestMapping(path="/api/status")
public class StatusController {

    private Logger logger= LoggerFactory.getLogger(StatusController.class);

    @Autowired
    private StatusRepository statusRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
        public Iterable<Status> getStatus(){
        logger.info("sending all status");
        return statusRepository.findAll();
    }


    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Status saveStatus(@RequestBody Status status){
        Status savedStatus = statusRepository.save(status);
        logger.info("Saving status with id " + savedStatus.getStaId());

        return savedStatus;
    }
}
