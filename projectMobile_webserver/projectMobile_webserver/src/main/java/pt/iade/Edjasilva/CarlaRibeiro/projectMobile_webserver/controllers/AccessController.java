package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Access;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.AccessRepository;

@RestController
@RequestMapping(path ="/api/access")
public class AccessController {

    private Logger logger= LoggerFactory.getLogger(AccessController.class);

    @Autowired
    private AccessRepository accessRepository;

    @GetMapping(path="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<Access>  getAccess(){
        logger.info("Sending all access");
        return accessRepository.findAll();
    }
}
