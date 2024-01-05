package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Client;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Creatures;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.ClientRepository;

@RestController
@RequestMapping(path= "/api/clients")
public class ClientController {

    private Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Autowired
    private ClientRepository clientRepository;


    @GetMapping(path="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<Client> getClients(){
        logger.info("Sending all Clients");

        return clientRepository.findAll();

    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Client saveClient(@RequestBody Client client) {
        Client savedClient = clientRepository.save(client);
        logger.info("Saving client with id " + savedClient.getCliId());

        return savedClient;
    }


    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public Client ids(@RequestParam (name= "cliId") int id){
        logger.info("Sending client with id:" + id);
        return clientRepository.findByCliId(id);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByClientId(@RequestParam(name = "cliId") int id) {
        logger.info("Attempting to delete client with id: " + id);

        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            logger.info("Deleted client with id:" + id);
            return ResponseEntity.ok("Client with id " + id + " was successfully deleted.");
        } else {
            logger.info("Client with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Client with id " + id + " not found.");
        }

    }
}
