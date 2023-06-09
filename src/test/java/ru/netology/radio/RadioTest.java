package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(55);
        int expected = 55;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(7);
        int expected = 7;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChannelMax() {
        Radio rad = new Radio();
        rad.setCurrentChannel(9);
        int expected = 9;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetChannelMin() {
        Radio rad = new Radio();
        rad.setCurrentChannel(1);
        int expected = 1;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetVolumeAboveZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetVolumeAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetChannelAboveMax() {
        Radio rad = new Radio();
        rad.setCurrentChannel(10);
        int expected = 0;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetChannelAboveZero() {
        Radio rad = new Radio();
        rad.setCurrentChannel(0);
        int expected = 0;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNoSetChannelAboveMin() {
        Radio rad = new Radio();
        rad.setCurrentChannel(-1);
        int expected = 0;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(4);
        rad.setNextChannel();
        int expected = 5;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetZeroChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(9);
        rad.setNextChannel();
        int expected = 0;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(3);
        rad.setPrevChannel();
        int expected = 2;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSet9Channel() {
        Radio rad = new Radio();
        rad.setCurrentChannel(0);
        rad.setPrevChannel();
        int expected = 9;
        int actual = rad.getCurrentChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPlusVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(77);
        rad.setPlusVolume();
        int expected = 78;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setPlusVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinusVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(77);
        rad.setMinusVolume();
        int expected = 76;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setMinusVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
