package com.eureka.client.contribuyentes.conexion;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@RefreshScope
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "catastroEntityManager", transactionManagerRef = "catastroTransactionManager", basePackages = {
		"com.eureka.client.contribuyentes.repository" })
public class DataBaseSource {

	// https://github.com/Xndy/catastro-microservices

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String userName;

	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation}")
	private String nonContextualCreation;
	
	@Autowired
	private DataSource dataSource;

	@Bean(name = "catastroEntityManager")
	public LocalContainerEntityManagerFactoryBean catastroEntityManager(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(dataSource).packages("com.eureka.client.contribuyentes.entities")
				.persistenceUnit("catastro").build();
	}

	@Bean(name = "catastroTransactionManager")
	public PlatformTransactionManager transactionManager(@Qualifier("catastroEntityManager") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}

}
