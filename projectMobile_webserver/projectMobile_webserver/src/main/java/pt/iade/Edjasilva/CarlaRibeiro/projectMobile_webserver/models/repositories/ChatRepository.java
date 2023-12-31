package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Chat;

public interface ChatRepository extends CrudRepository<Chat, Integer> {
    Iterable<Chat> findByChatId(int chaId);
}
