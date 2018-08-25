package com.SpringBoot;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.SpringBoot.Entities.Ticket;
import com.SpringBoot.Services.TicketBookingServices;

/*@Configuration*/
@SpringBootApplication
/*@ComponentScan(basePackages ={"com.SpringBoot","com.SpringBoot.Services"})*/
public class SpringBootCurdRestJpaApplication /*implements CommandLineRunner*/
{

	/*@Autowired
	private TicketBookingServices ticketBookingServices;
	
	@Autowired
	private DataSource dataSource;*/
	
	public static void main(String[] args) {
		/*ConfigurableApplicationContext applicationContext =*/ 
		
		SpringApplication.run(SpringBootCurdRestJpaApplication.class, args);
	
		
	
	/*	Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named
		check Service class name ticketBookingService I changed ticketBookingServices*/
		
		/*TicketBookingServices ticketBookingService = applicationContext.getBean("ticketBookingServices",TicketBookingServices.class);*/
		

	}
	/*@Override
	public void run(String... arg0) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setPassengerName("sai");
		ticket.setDestination("pune");
		ticket.setSourceStation("renigunta");
		ticket.setEmail("sai@gmail.com");
		ticketBookingServices.createTicket(ticket);
		System.out.println("DataSource : "+dataSource);
		
	}*/
}
