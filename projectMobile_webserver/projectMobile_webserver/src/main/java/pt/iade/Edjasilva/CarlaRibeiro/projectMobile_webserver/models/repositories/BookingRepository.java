package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Booking;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Client;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

    //Iterable<Booking> findByBooId(int booId);
    Booking findByBooId(int id);
}
