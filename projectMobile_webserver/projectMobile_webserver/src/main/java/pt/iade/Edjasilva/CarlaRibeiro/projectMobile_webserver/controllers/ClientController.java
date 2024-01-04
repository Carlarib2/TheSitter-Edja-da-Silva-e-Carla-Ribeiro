package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Client;
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
}
