package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Chat;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Creatures;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.ChatRepository;

@RestController
@RequestMapping(path= "/api/chats")

public class ChatController {

    private Logger logger= LoggerFactory.getLogger(ChatController.class);

    @Autowired
    private ChatRepository chatRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    Iterable<Chat> getChats(){

        logger.info("Sending all chats");
        return chatRepository.findAll();
    }

    @PostMapping(path= "", produces=MediaType.APPLICATION_JSON_VALUE)
    public Chat saveChat(@RequestBody Chat chat){

        Chat savedChat = chatRepository.save(chat);
        logger.info("Saving chat with id " + savedChat.getChatId());

        return savedChat;
    }
}
