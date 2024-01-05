package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Creatures;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.FamilyMember;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;
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

    @PostMapping(path= "", produces=MediaType.APPLICATION_JSON_VALUE)
    public Creatures saveCreatures(@RequestBody Creatures creatures){

        Creatures savedCreatures = creaturesRepository.save(creatures);
        logger.info("Saving creatures with id " + savedCreatures.getCreId());

        return savedCreatures;
    }

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public Creatures ids(@RequestParam (name= "CreId") int id){
        logger.info("Sending creatures with id:" + id);
        return creaturesRepository.findByCreId(id);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByCreaturesId(@RequestParam(name = "creId") int id) {
        logger.info("Attempting to delete creatures with id: " + id);

        if (creaturesRepository.existsById(id)) {
            creaturesRepository.deleteById(id);
            logger.info("Deleted creatures with id:" + id);
            return ResponseEntity.ok("Creatures with id " + id + " was successfully deleted.");
        } else {
            logger.info("Creatures with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Creatures with id " + id + " not found.");
        }

    }

    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateCreatures(@PathVariable("id") int id, @RequestBody Creatures updatedCreatures) {
        logger.info("Attempting to update Creatures with id: " + id);

        if (creaturesRepository.existsById(id)) {
            Creatures existingCreatures = creaturesRepository.findById(id).get();

            existingCreatures.setCreType(updatedCreatures.getCreType());
            existingCreatures.setCreInfo(updatedCreatures.getCreInfo());


            creaturesRepository.save(existingCreatures);

            logger.info("Updated Creatures with id: " + id);
            return ResponseEntity.ok(existingCreatures);
        } else {
            logger.info("Creatures with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Creatures with id " + id + " not found.");
        }
    }
}
