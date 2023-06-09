package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentChannel;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int newCurrentVolume) {
       if (newCurrentVolume < 0) {
           return;
       }
       if (newCurrentVolume > 100) {
           return;
       }
        currentVolume = newCurrentVolume;
    }

    public  int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < 0) {
            return;
        }
        if (newCurrentChannel > 9) {
        return;
        }
        currentChannel = newCurrentChannel;
    }

    public void setNextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        } else {
            currentChannel = 0;
        }
    }

    public void setPrevChannel() {
        if (currentChannel > 0) {
            currentChannel = currentChannel - 1;
        } else {
            currentChannel = 9;
        }
    }

    public void setPlusVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void setMinusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
