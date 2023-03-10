package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetStationCorrect() {
        Radio fmstation = new Radio();

        fmstation.setStation(8);

        int expected = 8;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationIncorrectLess0() {
        Radio fmstation = new Radio(30);

        fmstation.setStation(-1);

        int expected = 0;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationIncorrectMoreMaximum() {
        Radio fmstation = new Radio(30);

        fmstation.setStation(32);

        int expected = 0;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNextStationMiddle() {
        Radio fmstation = new Radio(30);

        fmstation.setStation(25);
        fmstation.nextStation();

        int expected = 26;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNextStationEdge() {
        Radio fmstation = new Radio(30);

        fmstation.setStation(29);
        fmstation.nextStation();

        int expected = 0;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBePrevStationMiddle() {
        Radio fmstation = new Radio(30);

        fmstation.setStation(25);
        fmstation.prevStation();

        int expected = 24;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBePrevStationEdge() {
        Radio fmstation = new Radio(30);

        fmstation.setStation(0);
        fmstation.prevStation();

        int expected = 29;
        int actual = fmstation.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNextVolume() {
        Radio fmstation = new Radio(30);

        fmstation.setCurrentVolume(50);
        fmstation.increaseVolume();

        int expected = 51;
        int actual = fmstation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBePrevVolume() {
        Radio fmstation = new Radio(30);

        fmstation.setCurrentVolume(50);
        fmstation.decreaseVolume();

        int expected = 49;
        int actual = fmstation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBeNextVolumeEdge100() {
        Radio fmstation = new Radio(30);

        fmstation.setCurrentVolume(100);
        fmstation.increaseVolume();

        int expected = 100;
        int actual = fmstation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBePrevVolumeEdge0() {
        Radio fmstation = new Radio(30);

        fmstation.setCurrentVolume(0);
        fmstation.decreaseVolume();

        int expected = 0;
        int actual = fmstation.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}