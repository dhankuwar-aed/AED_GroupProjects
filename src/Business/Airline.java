/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author dhankuwarsisodiya
 */
public class Airline {
    private String airlineName;
    private String airlinerName;
    private int seats;
    private int airlineNo;
    
    public Airline(String airlinerName,String airlineName, int airlineNo, int seats) {
        this.airlinerName = airlinerName;
        this.airlineName = airlineName;
        this.airlineNo = airlineNo;
        this.seats = seats;
    }
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAirlineNo() {
        return airlineNo;
    }

    public void setAirlineNo(int airlineNo) {
        this.airlineNo = airlineNo;
    }
    
}
