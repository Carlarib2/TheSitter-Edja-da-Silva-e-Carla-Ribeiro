package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.ChatRepository;

@RestController
@RequestMapping(path= "/api/chat")

public class ChatController {

    private Logger logger= LoggerFactory.getLogger(ChatController.class);

    @Autowired
    private ChatRepository chatRepository;
}
