package ExampleServices.ExamplesAutomatedServices.repository;

import ExampleServices.ExamplesAutomatedServices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM users U WHERE U.email = ?", nativeQuery = true)
    User findByEmail(String email);
}
