/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Girija Dhawale
 */
public class Fleet {
    class fleet{
        String airlinerName;
        ArrayList<Airline> airlines = new ArrayList<Airline>();
    }
    
    private ArrayList<fleet> fleetObjectList;
    
    public Fleet(ArrayList<Airline> airlineDirectory, ArrayList<Airliner> airlinerDirectory){
        fleetObjectList = new ArrayList<fleet>();
        for(Airliner a: airlinerDirectory){
           fleet fleetObject = new fleet();
           fleetObject.airlinerName = a.getAirlineName();
           fleetObjectList.add(fleetObject);
        }
        for(Airline a: airlineDirectory){
            for(fleet b: fleetObjectList){
                if((a.getAirlinerName()).equalsIgnoreCase(b.airlinerName)){
                    b.airlines.add(a);
                }
            }
        }
    }

    public ArrayList<fleet> getAirplaneDirectory() {
        return fleetObjectList;
    }

    public void setAirplaneDirectory(ArrayList<fleet> fleet) {
        this.fleetObjectList = fleet;
    }
}
