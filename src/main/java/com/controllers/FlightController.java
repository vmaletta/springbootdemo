package com.controllers;


import com.domains.FlightTicket;
import com.dto.FlightTicketRequest;
import com.services.FlightTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class FlightController {

	@Autowired
	private FlightTicketService flightTicketService;

	@RequestMapping(value = "/flightTickets", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Long> createFlightTickets(@RequestBody final FlightTicketRequest dto) {
		final Long itineraryID;
		try {
			itineraryID = this.flightTicketService.createFlightTicket(dto);
			return new ResponseEntity<>(itineraryID, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/{itineraryId}/flighTicket", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<FlightTicket> getFlightTicket(
		@PathVariable final Long itineraryId
	) {

		final FlightTicket flighTicket;
		try {
			flighTicket = this.flightTicketService.getFlightTicket(itineraryId);
			return new ResponseEntity<>(flighTicket, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}