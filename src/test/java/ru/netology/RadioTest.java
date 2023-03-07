package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio fmstation = new Radio();

        fmstation.setStation(7);

        int expected = 7;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}