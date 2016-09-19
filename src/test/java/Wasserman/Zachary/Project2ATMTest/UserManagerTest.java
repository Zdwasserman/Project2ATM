package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.UserManager;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import Wasserman.Zachary.Project2ATM.User;


public class UserManagerTest {

    @Test
    public void createUserTest() {
        ArrayList<User> userList = new ArrayList<>();
        UserManager manager = new UserManager();
        manager.createUser("bob");
        int actual = userList.size();
        int expected = 1;
        assertEquals(expected, actual);

    }

//    @Test
//    public void userLoginTest() {
//
//        UserManager manager = new UserManager();
//        User bob = new User("bob");
//        User bill = new User("bill");
//        User ben = new User("ben");
//        manager.userList.add(bob);
//        manager.userList.add(bill);
//        manager.userList.add(ben);
//
//        User expected = ben;
//        User actual = manager.userList.get(2);
//        assertEquals(expected, actual);
//    }
}
