package org.pavan.springbootutil;

import javax.validation.constraints.NotNull;

//@Configuration
//@ConfigurationProperties("spring.datasource")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@EnableJpaRepositories(basePackages ={"org.pavan.springbootutil"},entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "transactionManager")
public class FinanceConfiguration {

	@NotNull
	private String username;

	@NotNull
	private String password;

	@NotNull
	private String url;
	
	public FinanceConfiguration() {
		System.out.println("These properties "+this.url);
	}

	public void setUsername(String username) {
		
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		System.out.println("System URL is "+url);
		this.url = url;
	}
/*
	@Bean
	DataSource dataSource() throws SQLException {

		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setURL(url);
		//dataSource.setImplicitCachingEnabled(true);
		dataSource.setFastConnectionFailoverEnabled(true);
		return dataSource;
	}

	@Bean
	  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = null; 
		try{
	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    vendorAdapter.setGenerateDdl(false);

	    factory = new LocalContainerEntityManagerFactoryBean();
	    factory.setJpaVendorAdapter(vendorAdapter);
	    factory.setPackagesToScan("org.pavan.springbootutil.bean");
	    factory.setDataSource(dataSource());
		 } catch (SQLException e) {
			e.printStackTrace();
		}
		 finally
		 {
			 
		 }
		 
	    
		return factory;
	  }
	
	   @Bean
	   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(emf);
	 
	      return transactionManager;
	   }*/

}
