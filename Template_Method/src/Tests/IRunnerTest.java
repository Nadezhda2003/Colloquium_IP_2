package Tests;

import Network.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IRunnerTest {

    @Test
    void logIn() {
        String name="nadia";
        String pass="123";
        IRunner main = new IRunner(name, pass);
        Assertions.assertEquals(true, main.logIn(name, pass));
    }

    @Test
    void sendData() {
        String mess="Hello";
        IRunner main = new IRunner("", "");
        assertEquals(true, main.sendData(mess.getBytes()));
    }
}