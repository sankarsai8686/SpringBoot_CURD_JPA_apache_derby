package com.SpringBoot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Entities.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
