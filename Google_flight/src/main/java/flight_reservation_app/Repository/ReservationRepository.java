package flight_reservation_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_reservation_app.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
