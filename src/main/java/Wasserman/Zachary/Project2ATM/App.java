package Wasserman.Zachary.Project2ATM;
import Wasserman.Zachary.Project2ATM.UserManager;
/**
 * Created by zacharywasserman on 9/16/16.
 */
public class App {


    public static void main(String[] args) {
        userInterface prompt = new userInterface();
        boolean isOn = true;
        // creates a loop that keeps the atm running
        while(isOn == true) {
            System.out.println("|||||||||||||||||||||");
            System.out.println("|||||||| ATM ||||||||");
            System.out.println("|||||||||||||||||||||");
            //calls the menu allowing the user to log in
            prompt.menu();
        }


    }
}
