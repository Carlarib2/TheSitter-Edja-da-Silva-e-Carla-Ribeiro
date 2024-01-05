package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Creatures;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.FamilyMember;

public interface CreaturesRepository extends CrudRepository<Creatures, Integer> {
    Iterable<Creatures> findByCreType(String creType);
    Creatures findByCreId(int id);
}
