/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author dhankuwarsisodiya
 */
public class AirlinerDirectory {
    private static ArrayList<Airliner> airlinerDirectory;

    public AirlinerDirectory(){
        airlinerDirectory = new ArrayList<Airliner>();
        Airliner Airliner1 = new Airliner("Qatar");
        Airliner Airliner2 = new Airliner("Emirates");
        Airliner Airliner3 = new Airliner("American Airlines");
        airlinerDirectory.add(Airliner1);
        airlinerDirectory.add(Airliner2);
        airlinerDirectory.add(Airliner3);
    }
    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    public static void addAirliner(Airliner airliner){
        airlinerDirectory.add(airliner);
    }
    public Airliner getAirlinerIndex(int row){
        return airlinerDirectory.get(row);
    }
    
    public void removeAirliner(int row){
        airlinerDirectory.remove(row);
    }
    public Airliner getAirliner(String name){
        for(int i =0; i<airlinerDirectory.size();i++){
            if(airlinerDirectory.get(i).getAirlineName() == name)
                return airlinerDirectory.get(i);
        }
        return null;
    }
}
