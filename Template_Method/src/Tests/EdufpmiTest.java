package Tests;

import Network.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdufpmiTest {

    @Test
    void logIn() {
        String name="nadia";
        String pass="123";
        Edufpmi main = new Edufpmi(name, pass);
        Assertions.assertEquals(true, main.logIn(name, pass));
    }

    @Test
    void sendData() {
        String mess="Hello";
        Edufpmi main = new Edufpmi("", "");
        assertEquals(true, main.sendData(mess.getBytes()));
    }
}