package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int radioStationQuantity = 10;
    private int maxVolume = 100;




    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation >= radioStationQuantity) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void nextRadioStation() {
        int newCurrentRadioStation = currentRadioStation + 1;
        if (newCurrentRadioStation >= radioStationQuantity) {
            newCurrentRadioStation = 0;
        }
        this.currentRadioStation = newCurrentRadioStation;

    }

    public void prevRadioStation() {
        int newCurrentRadioStation = currentRadioStation - 1;
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = radioStationQuantity - 1;
        }
        this.currentRadioStation = newCurrentRadioStation;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
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
