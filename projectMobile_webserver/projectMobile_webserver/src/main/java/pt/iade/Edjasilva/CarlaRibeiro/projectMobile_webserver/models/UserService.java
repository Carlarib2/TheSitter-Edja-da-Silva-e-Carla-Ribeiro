package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.AccessRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.PlaceRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.UserRepository;

import java.time.LocalDate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AccessRepository accessRepository;
    @Autowired
    private PlaceRepository placeRepository;

    public User createUser(int userId, LocalDate userBdate, byte[] userUpload, String userAddress, String userMobile, String userEmail, String userPassword, String userName, int userAcId, int userPlaId, String userGender) {
        Access access = accessRepository.findById(userAcId)
                .orElseGet(this::createDefaultAccess);

        Place place = placeRepository.findById(userPlaId)
                .orElseGet(this::createDefaultPlace);

        User user = new User();
        // Configuração dos atributos do usuário
        // ...

        user.setAccess(access);
        user.setPlace(place);

        return userRepository.save(user);
    }

    private Access createDefaultAccess() {
        Access defaultAccess = new Access();
        // Configuração padrão de Access
        // Por exemplo: defaultAccess.setSomeProperty(someValue);

        return defaultAccess;
    }

    private Place createDefaultPlace() {
        Place defaultPlace = new Place();
        // Configuração padrão de Place
        // Por exemplo: defaultPlace.setSomeProperty(someValue);
        return defaultPlace;
    }

    // Outros métodos da classe UserService
}
