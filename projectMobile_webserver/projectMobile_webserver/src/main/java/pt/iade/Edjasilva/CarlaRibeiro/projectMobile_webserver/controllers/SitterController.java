package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.SitterRepository;


@RestController
@RequestMapping(path= "/api/sitter")
public class SitterController {

    private Logger logger = LoggerFactory.getLogger(SitterController.class);

    @Autowired
    private SitterRepository sitterRepository;

}
