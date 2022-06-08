package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        int newCurrentRadioStation = currentRadioStation + 1;
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        this.currentRadioStation = newCurrentRadioStation;

    }

    public void prevRadioStation() {
        int newCurrentRadioStation = currentRadioStation - 1;
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        this.currentRadioStation = newCurrentRadioStation;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        int newCurrentVolume = currentVolume + 1;
        setCurrentVolume(newCurrentVolume);
    }

    public void decreaseVolume() {
        int newCurrentVolume = currentVolume - 1;
        setCurrentVolume(newCurrentVolume);
    }


}
