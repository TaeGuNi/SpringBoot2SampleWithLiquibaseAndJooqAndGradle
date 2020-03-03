package sample.app.http.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.app.http.dtos.IndexDto;

@RestController
@RequestMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
public class IndexRestController {

  @GetMapping
  public IndexDto index() {
    return IndexDto.builder().build();
  }
}
