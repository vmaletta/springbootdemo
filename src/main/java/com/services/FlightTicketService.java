package com.services;

import com.domains.FlightTicket;
import com.dto.FlightTicketRequest;

public interface FlightTicketService {
    Long createFlightTicket(FlightTicketRequest reservationRequest) throws Exception;

    FlightTicket getFlightTicket(Long itineraryId) throws Exception;
}
