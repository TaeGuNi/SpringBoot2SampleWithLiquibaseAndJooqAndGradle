package sample.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DisplayName("When App class Test")
@ExtendWith(SpringExtension.class)
@Nested
@SpringBootTest
class AppTest {

  @DisplayName("Should be success to load Context")
  @Test
  void contextLoads() {}

  @DisplayName("Should be success to run Context")
  @Test
  void contextTest() {
    App.main(new String[] {});
  }
}
