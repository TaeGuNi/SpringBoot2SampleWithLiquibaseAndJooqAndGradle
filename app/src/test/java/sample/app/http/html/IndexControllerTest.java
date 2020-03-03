package sample.app.http.html;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@DisplayName("When IndexController class Test")
@Nested
@WebMvcTest(IndexController.class)
class IndexControllerTest {

  @Autowired private MockMvc mvc;

  @DisplayName("Should be success call \"/\" by using get method")
  @Test
  void index() throws Exception {
    mvc.perform(get("/")).andExpect(status().isOk());
  }
}
