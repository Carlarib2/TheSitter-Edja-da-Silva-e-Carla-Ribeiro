package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Status;

import java.util.List;

public interface StatusRepository extends CrudRepository<Status, Integer> {
    Iterable<Status> findByStaNameContaining(String text);
    //Status findByStaName (String staName);
    List<Status> findByStaName(String name);
}
