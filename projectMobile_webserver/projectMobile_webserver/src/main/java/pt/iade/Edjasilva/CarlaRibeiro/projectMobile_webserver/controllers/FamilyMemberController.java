package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.FamilyMember;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.familyMemberRepository;

@RestController
@RequestMapping(path="/api/familyMember")
public class FamilyMemberController {


    private Logger logger = LoggerFactory.getLogger(FamilyMemberController.class);

    @Autowired
    private familyMemberRepository familyMemberRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    Iterable<FamilyMember> getFamilyMembers(){
        logger.info("Sending all family members");
        return familyMemberRepository.findAll();
    }
}
