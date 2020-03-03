package sample.app.http.dtos;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class IndexDto implements Serializable {

  private static final long serialVersionUID = 1L;

  @Default private String title = "Spring Boot 2 with Liquibase and Jooq and Gradle Sample";
}
