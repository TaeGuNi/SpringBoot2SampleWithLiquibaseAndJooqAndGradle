package sample.app.jpa.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Instant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.jooq.AutoConfigureJooq;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import sample.app.jpa.config.JpaConfig;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@AutoConfigureJooq
@DisplayName("When UserJpaRepository class Test")
@DataJpaTest
@Import({JpaConfig.class})
class UserJpaRepositoryTest {

  @Autowired private UserJpaRepository userJpaRepository;

  @DisplayName("Should be success to load Context")
  @Test
  void contextLoads() {
    assertNotNull(userJpaRepository);
  }

  @DisplayName("When use jpa count by createDate less than query return 0")
  @Test
  void countByCreateDateLessThan() {
    final Long count = userJpaRepository.countByCreateDateLessThan(Instant.now());
    assertEquals(count, 0L);
  }

  @DisplayName("When select count all query return 0")
  @Test
  void countAll() {
    final Long count = userJpaRepository.countAll();
    assertEquals(count, 0L);
  }

  @DisplayName("When select count createDate less than parameter query return 0")
  @Test
  void countCreateDateLessThan() {
    final Long count = userJpaRepository.countCreateDateLessThan(Instant.now());
    assertEquals(count, 0L);
  }
}
