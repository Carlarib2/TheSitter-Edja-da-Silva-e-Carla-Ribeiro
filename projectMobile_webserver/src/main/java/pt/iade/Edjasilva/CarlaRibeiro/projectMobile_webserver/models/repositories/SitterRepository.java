package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Sitter;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.SitterRating;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;

public interface SitterRepository extends CrudRepository<Sitter, Integer> {
    //Iterable<Sitter> findBySitId(int sitId);
    Sitter findBySitId(int id);

    Sitter findBySitUserId(int userId);
}
