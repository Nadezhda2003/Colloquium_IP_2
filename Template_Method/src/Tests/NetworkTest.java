package Tests;

import org.junit.jupiter.api.Test;
import Network.*;

import static org.junit.jupiter.api.Assertions.*;

class NetworkTest {

    @Test
    void postTrue() {
        IRunner main = new IRunner("","");
        boolean result =  main.sendData("message".getBytes());
        assertEquals(true, result);
    }
}