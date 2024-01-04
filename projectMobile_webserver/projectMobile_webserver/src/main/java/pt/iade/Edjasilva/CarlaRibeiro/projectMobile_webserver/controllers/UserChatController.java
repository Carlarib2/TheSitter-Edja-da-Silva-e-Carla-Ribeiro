package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.UserChat;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserChatRepository;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@RestController
@RequestMapping(path="/api/userChats")
public class UserChatController {

    private Logger logger= LoggerFactory.getLogger(UserChatController.class);

    @Autowired
    private UserChatRepository userChatRepository;

    @GetMapping(path="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserChat>  getUserChat(){
        logger.info("sending all users chat");
        return userChatRepository.findAll();

    }

}
