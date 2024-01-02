package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Sitter;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRepository;


@RestController
@RequestMapping(path= "/api/sitter")

public class SitterController {

    private Logger logger = LoggerFactory.getLogger(SitterController.class);

    @Autowired
    private SitterRepository sitterRepository;

    @GetMapping(path= "/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Sitter> getSitters(){
        logger.info("Sending all the Sitters");
        return sitterRepository.findAll();

    }

}
