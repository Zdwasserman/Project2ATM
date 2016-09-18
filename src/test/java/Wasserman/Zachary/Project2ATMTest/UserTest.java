package Wasserman.Zachary.Project2ATMTest;

import Wasserman.Zachary.Project2ATM.User;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zacharywasserman on 9/16/16.
 */
public class UserTest {
    @Test
    public void setConstructerTest(){
        User squirtle = new User("squirtle");
        User bulbasaur = new User("bulbasaur");
        int expected = 1002;
        int actual = bulbasaur.getPIN();
        assertEquals("PIN shoud be 1002", expected, actual);
    }
}
