package com.SpringBoot.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ticket")
public class Ticket 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;
	
	@Column(name="passanger_name",nullable=false)
	private String passengerName;
	
	@Temporal(TemporalType.DATE)// with using  "bookingDate": 1535169502608,, with use"bookingDate": "2018-08-25",
	@Column(name="booking_date")
	private Date bookingDate;
	
	@Column(name="dest_station")
	private String destination;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="email")
	private String email;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	
	
}
