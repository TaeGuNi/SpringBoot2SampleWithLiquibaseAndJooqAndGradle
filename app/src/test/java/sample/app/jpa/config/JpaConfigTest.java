package sample.app.jpa.config;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DisplayName("When JpaConfig class Test")
@ExtendWith(SpringExtension.class)
@Nested
@SpringBootTest
class JpaConfigTest {

  @Autowired private JpaConfig jpaConfig;

  @DisplayName("Should be success to load Context")
  @Test
  void contextLoads() {
    assertNotNull(jpaConfig);
  }
}
