package com.SpringBoot.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Entities.Ticket;
import com.SpringBoot.dao.TicketBookingDao;

/*@Service("/yourownname")*/
@Service//name it takes as class name starting with small --> ticketBookingServices
public class TicketBookingServices {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) 
	{
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		
		return ticketBookingDao.findAll();
	}

	public void delete(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) 
	{
		Ticket ticketFromDB = ticketBookingDao.findOne(ticketId);
		ticketFromDB.setEmail(newEmail);
		Ticket updatedTicket = ticketBookingDao.save(ticketFromDB);
		return updatedTicket;
	}
	
	
}
