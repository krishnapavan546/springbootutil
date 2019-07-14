package org.pavan.springbootutil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableAutoConfiguration()
//@EnableTransactionManagement
public class FinanceBootService //implements CommandLineRunner 
{
	public static void main(String[] args) {
		try {
			
			SpringApplication.run(FinanceBootService.class, args);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Starting the Initlization phase");
	//	System.out.println("DATASOURCE = " + datasource);
		
	}*/
}
