package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Sitter;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
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

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserChat saveUserchat(@RequestBody UserChat userChat){
        UserChat savedUserChat = userChatRepository.save(userChat);
        logger.info("Saving user chat with id " + savedUserChat.getUsatId());

        return savedUserChat;
    }
    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public UserChat chatId(@RequestParam (name= "usatId") int id){
        logger.info("Sending user chat with id:" + id);
        return userChatRepository.findByUsatId(id);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByUserChatId(@RequestParam(name = "usatId") int id) {
        logger.info("Attempting to delete chat with id: " + id);

        if (userChatRepository.existsById(id)) {
            userChatRepository.deleteById(id);
            logger.info("Deleted chat with id:" + id);
            return ResponseEntity.ok("Chat with id " + id + " was successfully deleted.");
        } else {
            logger.info("Chat with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Chat with id " + id + " not found.");
        }
    }

}
