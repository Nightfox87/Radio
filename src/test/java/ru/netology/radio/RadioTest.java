package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
    Radio radio = new Radio();
    @Test
    void setBelowLimitRadioStation() {
        radio.setCurrentRadioStation(-1);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLowRadioStation() {
        radio.setCurrentRadioStation(0);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMiddleRadioStation() {
        radio.setCurrentRadioStation(5);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHighRadioStation() {
        radio.setCurrentRadioStation(9);

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setOverLimitRadioStation() {
        radio.setCurrentRadioStation(10);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextLowRadioStation() {
        radio.setCurrentRadioStation(0);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextMiddleRadioStation() {
        radio.setCurrentRadioStation(4);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextHighRadioStation() {
        radio.setCurrentRadioStation(9);

        radio.nextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevLowRadioStation() {
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevMiddleRadioStation() {
        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevHighRadioStation() {
        radio.setCurrentRadioStation(9);

        radio.prevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setBelowLimitVolume() {
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setLowVolume() {
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setMiddleVolume() {
        radio.setCurrentVolume(50);

        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setHighVolume() {
        radio.setCurrentVolume(100);

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setOverLimitVolume() {
        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void incLowVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void incMiddleVolume() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 51;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void incHighVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decLowVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decMiddleVolume() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 49;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decHighVolume() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationQuantity() {
        int actual = radio.getRadioStationQuantity();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}
