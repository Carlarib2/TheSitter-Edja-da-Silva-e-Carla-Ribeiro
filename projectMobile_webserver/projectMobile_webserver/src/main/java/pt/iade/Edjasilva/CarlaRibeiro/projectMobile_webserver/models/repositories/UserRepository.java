package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    Iterable<User> findByNameContaining(String text);
}
