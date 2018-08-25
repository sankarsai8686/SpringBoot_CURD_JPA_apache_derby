package com.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Entities.Ticket;
import com.SpringBoot.Services.TicketBookingServices;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {

	@Autowired
	TicketBookingServices ticketBookingService;
						  
	@PostMapping(value="/createticket")
	public Ticket createTicket(@RequestBody Ticket ticket)
	{
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketId}")
	//@RequestMapping(value="/ticket/{ticketId}",method=RequestMethod.GET)
	public Ticket getTicketById(@PathVariable Integer ticketId)
	{
		return ticketBookingService.getTicketById(ticketId);
	}
	
	@GetMapping("/ticket/alltickets")
	public Iterable<Ticket> getAllBookedTickets()
	{
		return ticketBookingService.getAllBookedTickets();
	}
	
	@DeleteMapping(value="/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		ticketBookingService.delete(ticketId);
	}
	
	@PutMapping(value="/ticket/{ticketId}/{newEmail:.+}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("newEmail") String newEmail)
	{
		return ticketBookingService.updateTicket(ticketId,newEmail);
	}

}
