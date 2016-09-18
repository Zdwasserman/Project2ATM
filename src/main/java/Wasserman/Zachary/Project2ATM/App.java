package Wasserman.Zachary.Project2ATM;
import Wasserman.Zachary.Project2ATM.UserManager;
/**
 * Created by zacharywasserman on 9/16/16.
 */
public class App {
    public static void main(String[] args) {
        userInterface prompt = new userInterface();
        boolean isOn = true;
        while(isOn == true) {
            System.out.println("|||||||||||||||||||||");
            System.out.println("|||||||| ATM ||||||||");
            System.out.println("|||||||||||||||||||||");
            prompt.menu();
        }


    }
}
