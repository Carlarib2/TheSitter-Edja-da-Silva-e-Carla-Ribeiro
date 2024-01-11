package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.FamilyMember;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.FamilyMemberRepository;

@RestController
@RequestMapping(path="/api/familyMembers")
public class FamilyMemberController {


    private Logger logger = LoggerFactory.getLogger(FamilyMemberController.class);

    @Autowired
    private FamilyMemberRepository familyMemberRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    Iterable<FamilyMember> getFamilyMembers(){
        logger.info("Sending all family members");
        return familyMemberRepository.findAll();
    }

    /*
    @GetMapping(path="/idCli/{cliId}", produces=MediaType.APPLICATION_JSON_VALUE)
    Iterable<FamilyMember> getByParentId(@PathVariable int cliId ){
        logger.info("Sending all family member");
        return familyMemberRepository.findByFaCliId(cliId);

    }

     */

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public FamilyMember saveFamilyMember(@RequestBody FamilyMember familyMember){
        FamilyMember savedFamilyMember = familyMemberRepository.save(familyMember);
        logger.info("Saving Family Member with id " + savedFamilyMember.getFaId());

        return savedFamilyMember;
    }

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public FamilyMember ids(@RequestParam (name= "FaId") int id){
        logger.info("Sending family member with id:" + id);
        return familyMemberRepository.findByFaId(id);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByfamilymemberId(@RequestParam(name = "faId") int id) {
        logger.info("Attempting to delete Sitter with id: " + id);

        if (familyMemberRepository.existsById(id)) {
            familyMemberRepository.deleteById(id);
            logger.info("Deleted Family member with id:" + id);
            return ResponseEntity.ok("Sitter with id " + id + " was successfully deleted.");
        } else {
            logger.info("Family member with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Family member with id " + id + " not found.");
        }

    }



    @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateFamilyMember(@PathVariable("id") int id, @RequestBody FamilyMember updatedFamilyMember) {
        logger.info("Attempting to update Family Member with id: " + id);

        if (familyMemberRepository.existsById(id)) {
            FamilyMember existingFamilyMember = familyMemberRepository.findById(id).get();

            existingFamilyMember.setFaAboutMe(updatedFamilyMember.getFaAboutMe());
            existingFamilyMember.setFaAllergies(updatedFamilyMember.getFaAllergies());
            existingFamilyMember.setFaBdate(updatedFamilyMember.getFaBdate());
            existingFamilyMember.setFaGender(updatedFamilyMember.getFaGender());
            existingFamilyMember.setFaSchool(updatedFamilyMember.getFaSchool());

            familyMemberRepository.save(existingFamilyMember);

            logger.info("Updated Family member with id: " + id);
            return ResponseEntity.ok(existingFamilyMember);
        } else {
            logger.info("Family member with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Family member with id " + id + " not found.");
        }
    }

}
