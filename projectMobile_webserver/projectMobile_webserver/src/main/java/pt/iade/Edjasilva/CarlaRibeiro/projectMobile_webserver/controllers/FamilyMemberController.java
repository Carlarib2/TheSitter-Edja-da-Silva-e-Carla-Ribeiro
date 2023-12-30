package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.familyMemberRepository;

@RestController
@RequestMapping(path="/api/familyMember")
public class FamilyMemberController {


    private Logger logger = LoggerFactory.getLogger(FamilyMemberController.class);

    @Autowired
    private familyMemberRepository familyMemberRepository;
}
