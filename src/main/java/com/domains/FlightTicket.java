package com.domains;

import org.hibernate.annotations.Type;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "flight_ticket")
public class FlightTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itinerary_id")
    private Long itineraryId;

    @Basic(optional = false)
    @Column(name = "passenger_age")
    private Integer passengerAge;

    @Basic(optional = false)
    @Column(name = "passenger_name")
    private String passengerName;

    @Basic(optional = false)
    @Column(name = "origin_city")
    private String originCity;

    @Basic(optional = false)
    @Column(name = "destination_city")
    private String destinationCity;

    @Basic(optional = false)
    @Column(name = "departure_date")
    private Date departureDate;

    @Basic(optional = false)
    @Column(name = "arrival_date")
    private Date arrivalDate;

    @Basic(optional = false)
    @Column(name = "departure_time")
    private Timestamp departureTime;

    @Basic(optional = false)
    @Column(name = "arrival_time")
    private Timestamp arrivalTime;

    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Basic(optional = false)
    @Column(name = "has_luggage_storage", columnDefinition = "TINYINT")
    private Boolean hasLuggageStorage;

    @Basic(optional = false)
    @Column(name = "price")
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
