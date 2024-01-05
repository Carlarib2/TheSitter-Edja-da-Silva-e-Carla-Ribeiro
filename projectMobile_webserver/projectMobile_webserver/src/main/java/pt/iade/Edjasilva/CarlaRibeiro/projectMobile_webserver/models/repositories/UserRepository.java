package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.responses.Response;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {


    Iterable<User> findByUserNameContaining(String text);

    //Optional<User> findByUserId(int userId);
    User findByUserEmailAndUserPassword(String email, String password);
    User findByUserName( String name);
    User findByUserId(int id);
    boolean existsByUserName(String name);
    @Transactional
    void deleteByUserName(String name);






}
