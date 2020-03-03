package sample.model.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/** User */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "user")
@ToString(callSuper = true)
public class User extends AbstractAuditor implements Serializable {

  private static final long serialVersionUID = 1L;

  private String userName;

  private String password;
}
