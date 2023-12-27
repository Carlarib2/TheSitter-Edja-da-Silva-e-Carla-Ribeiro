package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.Family_memberRepository;

public class Family_memberController {


    private Logger logger = LoggerFactory.getLogger(Family_memberController.class);

    @Autowired
    private Family_memberRepository family_memberRepository;
}
