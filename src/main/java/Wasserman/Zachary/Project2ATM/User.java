package Wasserman.Zachary.Project2ATM;

import java.util.ArrayList;

/**
 * Created by zacharywasserman on 9/16/16.
 */
public class User {
    private static int PINcounter = 1001;
    private int PIN;
    private String userName;

    // a constructor that for User objects
    public User(String userName){
        this.userName = userName;
        this.PIN = PINcounter++;
    }
    // returns user PIN
    public int getPIN(){
        return PIN;
    }
    // returns User names
    public String getUserName(){
        return userName;
    }
    // sets User name
    public void setUserName(String userName){
        this.userName = userName;
    }


}
