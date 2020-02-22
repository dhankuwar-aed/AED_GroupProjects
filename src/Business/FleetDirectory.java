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
public class FleetDirectory {
    class fleet{
        String airlinerName;
        ArrayList<Airline> airlines = new ArrayList<Airline>();
    }
    
    private ArrayList<fleet> fleetObjectList;
    
    public FleetDirectory(ArrayList<Airline> airlineDirectory, ArrayList<Airliner> airlinerDirectory){
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

    public ArrayList<fleet> getFleetObjectList() {
        return fleetObjectList;
    }

    public void setFleetObjectList(ArrayList<fleet> fleet) {
        this.fleetObjectList = fleet;
    }
//    private ArrayList<Fleet> fleetDirectory;
//
//   public FleetDirectory(){
//   fleetDirectory = new ArrayList<Fleet>();
//   }
//   
//   public ArrayList<Fleet> getFleetDirectory() {
//        return fleetDirectory;
//    }
//
//    public void setFleetDirectory(ArrayList<Fleet> fleetDirectory) {
//        this.fleetDirectory = fleetDirectory;
//    }
//    
//    public Fleet addFleet(Fleet a){
//    Fleet ft=a;
//    fleetDirectory.add(ft);
//    return ft;
//    }
//    
//    public void deleteFleet(Fleet fleet){
//    fleetDirectory.remove(fleet);
//    }
    
//    public Fleet searchAccount (String name){
//    for(Fleet fleet : this.fleetDirectory){
////    if(fleet.getModel().equalsIgnoreCase(name)){
////        return fleet;
////    }
//    }
//    return null;
//    }
}
