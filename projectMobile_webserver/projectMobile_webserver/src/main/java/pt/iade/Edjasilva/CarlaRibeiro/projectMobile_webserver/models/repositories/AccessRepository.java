package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Access;

public interface AccessRepository extends CrudRepository<Access, Integer> {

    Iterable<Access> findByAcId(int acId);
}
