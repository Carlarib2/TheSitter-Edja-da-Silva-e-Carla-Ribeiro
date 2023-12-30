package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.User;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.UserChat;

public interface UserChatRepository extends CrudRepository<UserChat, Integer> {
    Iterable<UserChat> findByUsatId(int usatId);

}
