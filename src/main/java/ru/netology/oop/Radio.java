package ru.netology.oop;

public class Radio {

    public int maxCurrentStationNumber = 9;
    public int minCurrentStationNumber = 0;
    public int currentStationNumber = minCurrentStationNumber;
    public int maxSoundVolume = 100;
    public int minSoundVolume = 0;
    public int soundVolume = minSoundVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getMaxCurrentStationNumber() {
        return maxCurrentStationNumber;
    }

    public int getMinCurrentStationNumber() {
        return minCurrentStationNumber;
    }

    public Radio() {
    }

    public Radio(int sizeStation) {
        maxCurrentStationNumber = minCurrentStationNumber + sizeStation;
        maxSoundVolume = minSoundVolume + sizeStation;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > maxCurrentStationNumber) {
            return;
        }
        if (newCurrentStationNumber < minCurrentStationNumber) {
            newCurrentStationNumber = maxCurrentStationNumber;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void maxCurrentStationNumber() {
        currentStationNumber = maxCurrentStationNumber - 1;
    }

    public void nextStationNumber() {
        if (currentStationNumber >= maxCurrentStationNumber) {
            currentStationNumber = minCurrentStationNumber;
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void prevStationNumber() {
        if (currentStationNumber <= minCurrentStationNumber) {
            currentStationNumber = maxCurrentStationNumber;
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume > maxSoundVolume) {
            newSoundVolume = maxSoundVolume;
        }
        if (newSoundVolume < minSoundVolume) {
            newSoundVolume = minSoundVolume;
        }
        soundVolume = newSoundVolume;
    }

    public void maxSoundVolume() {
        soundVolume = maxSoundVolume;
    }

    public void moreSound() {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = soundVolume;
        }
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
    }

    public void lessSound() {
        if (soundVolume <= minSoundVolume) {
            soundVolume = soundVolume;
        }
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        }
    }


}
