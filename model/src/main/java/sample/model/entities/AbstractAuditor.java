package sample.model.entities;

import java.time.Instant;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/** AbstractAuditor */
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass
public abstract class AbstractAuditor {

  private static final long serialVersionUID = 1L;

  @Id @GeneratedValue private UUID id;

  @CreatedDate
  @Column(nullable = false, updatable = false)
  private Instant createDate;

  @LastModifiedDate private Instant updateDate;
}
