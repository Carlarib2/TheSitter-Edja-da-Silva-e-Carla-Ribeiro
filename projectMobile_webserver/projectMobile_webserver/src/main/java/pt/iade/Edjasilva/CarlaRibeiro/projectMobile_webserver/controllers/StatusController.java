package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.StatusRepository;

import java.util.List;

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

    @GetMapping(path="/name", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Status> names (@RequestParam(name= "staName") String name){
        logger.info("Sending status with name:" + name);
        return statusRepository.findByStaName( name);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByUserId(@RequestParam(name = "staId") int id) {
        logger.info("Attempting to delete status with id: " + id);

        if (statusRepository.existsById(id)) {
            statusRepository.deleteById(id);
            logger.info("Deleted status with id:" + id);
            return ResponseEntity.ok("Status with id " + id + " was successfully deleted.");
        } else {
            logger.info("User with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Status with id " + id + " not found.");
        }

        }
    }




