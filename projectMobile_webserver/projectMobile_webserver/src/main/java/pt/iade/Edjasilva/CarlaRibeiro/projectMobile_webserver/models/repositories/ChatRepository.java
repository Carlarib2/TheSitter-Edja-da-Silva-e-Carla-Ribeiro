package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Chat;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Client;

public interface ChatRepository extends CrudRepository<Chat, Integer> {
    //Iterable<Chat> findByChatId(int chaId);
    Chat findByChatId(int id);
}
