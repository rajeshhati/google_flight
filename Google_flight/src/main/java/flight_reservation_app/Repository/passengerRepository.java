package flight_reservation_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_reservation_app.Entity.Passenger;

public interface passengerRepository extends JpaRepository<Passenger, Long> {

}
