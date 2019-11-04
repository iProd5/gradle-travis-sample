package io.turntabl;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RegisterTest {
    @Test
    public void getNamesOfGoldClients() {
        Register register = new Register(Arrays.asList(
                new Client("John Smith", 100,Level.Gold),
                new Client("Eva Queen", 101,Level.Premium),
                new Client("Sarah Reeves", 102,Level.Gold),
                new Client("Edith Simer", 103,Level.Platinum),
                new Client("Esther Cemeron", 104,Level.Gold)

        ));

        assertEquals(Arrays.asList("John Smith", "Sarah Reeves", "Esther Cemeron"), register.getNamesOfGoldClients());
    }

    @Test
    public void getClientNameById() {
        Register register = new Register(Arrays.asList(
                new Client("John Smith", 100,Level.Gold),
                new Client("Eva Queen", 101,Level.Premium),
                new Client("Sarah Reeves", 102,Level.Gold),
                new Client("Edith Simer", 103,Level.Platinum),
                new Client("Esther Cemeron", 104,Level.Gold)

        ));

        assertEquals("No Client with Such Id", register.getClientNameById(10));
    }

    @Test
    public void countClientsAtEveryServiceLevel(){
        Register register = new Register(Arrays.asList(
                new Client("John Smith", 100,Level.Gold),
                new Client("Eva Queen", 101,Level.Premium),
                new Client("Sarah Reeves", 102,Level.Gold),
                new Client("Edith Simer", 103,Level.Platinum),
                new Client("Esther Cemeron", 104,Level.Gold)

        ));

        assertEquals(5, register.countClientsAtEveryServiceLevel());
    }

}
