package Wasserman.Zachary.Project2ATM;

/**
 * Created by zacharywasserman on 9/16/16.
 */
public class User {
    private static int PINcounter = 1001;
    private int PIN;
    private String userName;

    public User(String userName){
        this.userName = userName;
        this.PIN = PINcounter++;
    }
    public int getPIN(){
        return PIN;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }


}
