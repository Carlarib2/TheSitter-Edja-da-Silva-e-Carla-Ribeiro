package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Booking;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.Chat;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models.repositories.BookingRepository;

@RestController
@RequestMapping(path ="/api/bookings")
public class BookingController {

    private Logger logger= LoggerFactory.getLogger(BookingController.class);

    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping(path="/all", produces= MediaType.APPLICATION_JSON_VALUE)
    Iterable<Booking> getBookings(){

        logger.info("Sending all chats");
        return bookingRepository.findAll();
    }
    @PostMapping(path= "", produces=MediaType.APPLICATION_JSON_VALUE)
    public Booking saveBooking(@RequestBody Booking booking){

        Booking savedBooking = bookingRepository.save(booking);
        logger.info("Saving booking with id " + savedBooking.getBooId());

        return savedBooking;
    }
}
