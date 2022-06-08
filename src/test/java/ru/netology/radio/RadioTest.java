package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    void setBelowLimitRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLowRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMiddleRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHighRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setOverLimitRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextLowRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextMiddleRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextHighRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevLowRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevMiddleRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevHighRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setBelowLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int actual = radio.getCurrentVolume();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHighVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setOverLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void incLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void incMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void incHighVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decHighVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
}
