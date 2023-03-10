package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio () {
        this.maxStation = 9;
    }

    public Radio (int numberChannels)
    { this.maxStation = numberChannels - 1;
            }
    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation)
        {
            currentStation++;
        } else currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 0)
         {
            currentStation--;
        } else currentStation = maxStation;
    }

    public void setStation(int newCurrentStation) {
        if (newCurrentStation < 0) { return; }
        if (newCurrentStation > maxStation) { return; }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
