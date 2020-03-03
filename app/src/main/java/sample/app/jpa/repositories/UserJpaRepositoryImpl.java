package sample.app.jpa.repositories;

import static org.jooq.impl.DSL.count;
import static sample.model.entities.sample.tables.User.USER;

import java.sql.Timestamp;
import java.time.Instant;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserJpaRepositoryImpl implements UserJpaRepositoryCustom {

  private final DSLContext dslContext;

  @Autowired
  public UserJpaRepositoryImpl(DSLContext dslContext) {
    this.dslContext = dslContext;
  }

  @Override
  @Transactional(readOnly = true)
  public Long countAll() {
    return dslContext.select(count(USER.ID)).from(USER).fetchOne(0, Long.class);
  }

  @Override
  @Transactional(readOnly = true)
  public Long countCreateDateLessThan(Instant createDate) {
    return dslContext
        .select(count(USER.ID))
        .from(USER)
        .where(USER.CREATE_DATE.lessThan(Timestamp.from(createDate)))
        .fetchOne(0, Long.class);
  }
}
