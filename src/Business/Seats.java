/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author cnakhare
 */
public class Seats {
    private ArrayList<Integer> seatsTaken;
    private ArrayList<Integer> totalSeatsTaken;
    
    public Seats(){
        seatsTaken = new ArrayList<Integer>();
        totalSeatsTaken = new ArrayList<Integer>();
    }
    public void setSeats(int seatCount){
        for(int i=1; i<seatCount;i++){
            totalSeatsTaken.add(i);
        }
    }
    public ArrayList<Integer> getSeatsTaken() {
        return seatsTaken;
    }
    
    public void bookSeats(int seatNo){
        seatsTaken.add(seatNo);
    }
    public void setSeatsTaken(ArrayList<Integer> seatsTaken) {
        this.seatsTaken = seatsTaken;
    }
    
}
