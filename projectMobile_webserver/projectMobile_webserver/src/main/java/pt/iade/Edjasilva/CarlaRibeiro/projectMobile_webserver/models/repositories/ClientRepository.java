package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Client;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Creatures;

public interface ClientRepository extends CrudRepository<Client, Integer> {


   // Iterable<Client> findByCliId(int cliId);
    Client findByCliId(int id);

    Client findByCliUserId(int userId);
}
