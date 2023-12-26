package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.User_chatRepository;

public class User_chatController {

    private Logger logger= LoggerFactory.getLogger(User_chatController.class);

    @Autowired
    private User_chatRepository user_chatRepository;
}
