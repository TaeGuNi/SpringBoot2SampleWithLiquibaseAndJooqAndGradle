package sample.app.jpa.repositories;

import java.time.Instant;

public interface UserJpaRepositoryCustom {

  Long countAll();

  Long countCreateDateLessThan(Instant createDate);
}
