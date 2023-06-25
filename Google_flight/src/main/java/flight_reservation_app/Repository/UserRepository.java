package flight_reservation_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import flight_reservation_app.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailid);

}
