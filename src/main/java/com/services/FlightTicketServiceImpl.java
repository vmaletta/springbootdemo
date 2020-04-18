package com.services;

import com.domains.FlightTicket;
import com.dto.FlightTicketRequest;
import com.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class FlightTicketServiceImpl implements FlightTicketService {

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public Long createFlightTicket(FlightTicketRequest reservationRequest) throws Exception {
		FlightTicket flightTicket = new FlightTicket();
		flightTicket.setArrivalDate(reservationRequest.getArrivalDate());
		flightTicket.setArrivalTime(reservationRequest.getArrivalTime());
		flightTicket.setDepartureDate(reservationRequest.getDepartureDate());
		flightTicket.setDepartureTime(reservationRequest.getDepartureTime());
		flightTicket.setDestinationCity(reservationRequest.getDestinationCity());
		flightTicket.setHasLuggageStorage(reservationRequest.getHasLuggageStorage());
		flightTicket.setOriginCity(reservationRequest.getOriginCity());
		flightTicket.setPassengerAge(reservationRequest.getPassengerAge());
		flightTicket.setPassengerName(reservationRequest.getPassengerName());
		flightTicket.setPrice(reservationRequest.getPrice());

		return flightRepository.saveAndFlush(flightTicket).getItineraryId();

	}

    @Override
    public FlightTicket getFlightTicket(final Long itineraryId) throws Exception {
        return flightRepository.findOne(itineraryId);
    }

}
