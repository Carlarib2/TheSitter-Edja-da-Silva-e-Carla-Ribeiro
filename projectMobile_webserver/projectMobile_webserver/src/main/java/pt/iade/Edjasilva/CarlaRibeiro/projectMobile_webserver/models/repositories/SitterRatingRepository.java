package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.SitterRating;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;

public interface SitterRatingRepository extends CrudRepository<SitterRating, Integer> {

    //Iterable<SitterRating> findByRaId(int raId);
    SitterRating findByRaId(int id);
}
