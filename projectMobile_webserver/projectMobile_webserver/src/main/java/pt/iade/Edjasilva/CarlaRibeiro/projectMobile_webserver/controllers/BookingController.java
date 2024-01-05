package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path="/id", produces=MediaType.APPLICATION_JSON_VALUE)
    public Booking ids(@RequestParam (name= "booId") int id){
        logger.info("Sending booking with id:" + id);
        return bookingRepository.findByBooId(id);
    }

    @DeleteMapping(path="/id" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteByBookingId(@RequestParam(name = "booId") int id) {
        logger.info("Attempting to delete Chat with id: " + id);

        if (bookingRepository.existsById(id)) {
            bookingRepository.deleteById(id);
            logger.info("Deleted Booking with id:" + id);
            return ResponseEntity.ok("Booking with id " + id + " was successfully deleted.");
        } else {
            logger.info("Booking with id " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking with id " + id + " not found.");
        }

    }


        @PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<?> updateBooking(@PathVariable("id") int id, @RequestBody Booking updatedBooking) {
            logger.info("Attempting to update Booking with id: " + id);

            if (bookingRepository.existsById(id)) {
                Booking existingBooking = bookingRepository.findById(id).get();

                existingBooking.setBooData(updatedBooking.getBooData());
                existingBooking.setBooEndTime(updatedBooking.getBooEndTime());
                existingBooking.setBooStartTime(updatedBooking.getBooStartTime());

                bookingRepository.save(existingBooking);

                logger.info("Updated Booking with id: " + id);
                return ResponseEntity.ok(existingBooking);
            } else {
                logger.info("Booking with id " + id + " not found.");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking with id " + id + " not found.");
            }
        }
    }




