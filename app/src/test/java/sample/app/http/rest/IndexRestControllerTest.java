package sample.app.http.rest;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import sample.app.http.dtos.IndexDto;

@DisplayName("When IndexRestController class Test")
@Nested
@WebMvcTest
class IndexRestControllerTest {

  @Autowired private MockMvc mvc;

  @DisplayName("Should be success call \"/\" by using get method with rest client")
  @Test
  void index() throws Exception {
    final String json = new ObjectMapper().writeValueAsString(IndexDto.builder().build());
    mvc.perform(get("/").header(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE))
        .andExpect(status().isOk())
        .andExpect(content().json(json));
  }
}
