/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Girija Dhawale
 */
public class Airliner {
    private String airlinerName;
   //private FlightDetailsDirectory flightDetailsDir;
   
   
//   public Airliner(){
//        flightDetailsDir= new FlightDetailsDirectory();
//    }
//
//   
//    public FlightDetailsDirectory getFlightDetailsDir() {
//        return flightDetailsDir;
//    }
//
//    public void setFlightDetailsDir(FlightDetailsDirectory flightDetailsDir) {
//        this.flightDetailsDir = flightDetailsDir;
//    }
    
    
    public Airliner(String name){
        this.airlinerName = name;
    }
    public String getAirlineName() {
        return airlinerName;
    }

    public void setAirlineName(String airlineName) {
        this.airlinerName = airlineName;
    } 
   
}
