package com.dto;

import org.pojomatic.annotations.AutoProperty;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@AutoProperty
public class FlightTicketRequest {

    private Long itineraryId;
    private Integer passengerAge;
    private String passengerName;
    private String originCity;
    private String destinationCity;
    private Date departureDate;
    private Date arrivalDate;
    private Timestamp departureTime;
    private Timestamp arrivalTime;
    private Boolean hasLuggageStorage;
    private Float price;

    public Long getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(final Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public Integer getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(final Integer passengerAge) {
        this.passengerAge = passengerAge;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(final String passengerName) {
        this.passengerName = passengerName;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(final String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(final String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(final Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(final Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(final Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(final Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Boolean getHasLuggageStorage() {
        return hasLuggageStorage;
    }

    public void setHasLuggageStorage(final Boolean hasLuggageStorage) {
        this.hasLuggageStorage = hasLuggageStorage;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(final Float price) {
        this.price = price;
    }
}
