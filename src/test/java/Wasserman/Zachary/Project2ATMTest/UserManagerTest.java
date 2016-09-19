package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.UserManager;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import Wasserman.Zachary.Project2ATM.User;


public class UserManagerTest {

    @Test
    public void createUserTest() {
        UserManager manager = new UserManager();
        manager.createUser("bob");
        int actual = manager.userList.size();
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void userLoginTest() {
        UserManager manager = new UserManager();
        manager.createUser("bob");
        User expected = manager.userList.get(0);
        User actual = manager.getUser(1001);
        assertEquals(expected, actual);
    }
}
