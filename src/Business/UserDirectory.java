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
public class UserDirectory {
    private ArrayList<User> userDirectory;
    
    public UserDirectory(){
        userDirectory = new ArrayList<User>();
        User admin = new User("John Alise","Admin","admin@123","john@gmail.com");
        User user1 = new User("Mary Jane","user01","user1@123","mary.j@gmail.com");
        User user2 = new User("Frank Goldberg","user02","user2@123","frank.g@gmail.com");
        userDirectory.add(admin);
        userDirectory.add(user1);
        userDirectory.add(user2);
    }
    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }
    
}
