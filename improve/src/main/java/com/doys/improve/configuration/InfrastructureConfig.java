//package com.doys.improve.configuration;
//
//import java.util.Properties;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableJpaRepositories(basePackages = "com.doys.improve.dao")
//@EnableTransactionManagement
//@PropertySource({ "classpath:persistence-h2.properties" })
//@EntityScan(basePackages = {"com.doys.improve.model"})
//public class InfrastructureConfig {
//
//  @Autowired
//  private Environment env;
//
//  @Autowired
//  private DataSource dataSource;
//
//  public InfrastructureConfig(){super();}
//
//  @Bean
//  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//    final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//    em.setDataSource(dataSource());
//    em.setPackagesToScan("com.doys.improve");
//    final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//    em.setJpaVendorAdapter(vendorAdapter);
//    em.setJpaProperties(additionalProperties());
//    return em;
//  }
//  @Bean
//  public DataSource dataSource() {
//    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
//    dataSource.setUrl(env.getProperty("jdbc.url"));
//    dataSource.setUsername(env.getProperty("jdbc.username"));
//    dataSource.setPassword(env.getProperty("jdbc.password"));
//    return dataSource;
//  }
//
//  @Bean
//  public JpaTransactionManager transactionManager() {
//    final JpaTransactionManager transactionManager = new JpaTransactionManager();
//    transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//    return transactionManager;
//  }
//
//  @Bean
//  public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//    return new PersistenceExceptionTranslationPostProcessor();
//  }
//
//  //
//
//  final Properties additionalProperties() {
//    final Properties hibernateProperties = new Properties();
//    hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//    hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
//    return hibernateProperties;
//  }
//}
