package br.com.drogaria;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class Configuracao {

	/*
	*	Me'todo main do spring, para chamar suas respectivas dependências e chamar o container(tomcat)  
	*/
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

	/*
	*	Bean para persistência dos dados, já que não implementei o arquivo application.properties 
	*/
	@Bean
	public DataSource data() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/drogaria");
		data.setUsername("root");
		data.setPassword("220132");
		return data;
	}
}
