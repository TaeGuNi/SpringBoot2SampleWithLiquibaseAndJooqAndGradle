package sample.model.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** JpaAuditingConfig */
@AllArgsConstructor
@Configuration
@EnableJpaAuditing
public class JpaAuditingConfig {}
