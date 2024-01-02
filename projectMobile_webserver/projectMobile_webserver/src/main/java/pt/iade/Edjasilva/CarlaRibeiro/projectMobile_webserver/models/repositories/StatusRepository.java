package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;

public interface StatusRepository extends CrudRepository<Status, Integer> {
    Iterable<Status> findByStaNameContaining(String text);
}
