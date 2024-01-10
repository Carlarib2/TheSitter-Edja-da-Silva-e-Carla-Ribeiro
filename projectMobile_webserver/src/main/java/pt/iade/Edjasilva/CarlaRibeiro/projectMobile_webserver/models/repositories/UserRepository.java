package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;


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
