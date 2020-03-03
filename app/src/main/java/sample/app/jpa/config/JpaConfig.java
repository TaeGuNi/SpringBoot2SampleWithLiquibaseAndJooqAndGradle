package sample.app.jpa.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan({"sample"})
@Configuration
@EnableJpaRepositories(basePackages = "sample.app.jpa.repositories")
@EnableTransactionManagement
@EntityScan(basePackages = "sample.model.entities")
public class JpaConfig {}
