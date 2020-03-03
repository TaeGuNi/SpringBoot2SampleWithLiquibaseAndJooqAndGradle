package sample.app.jpa.repositories;

import java.time.Instant;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.model.entities.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, UUID>, UserJpaRepositoryCustom {

  Long countByCreateDateLessThan(Instant createDate);
}
