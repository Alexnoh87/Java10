package ru.netology.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    public int maxCurrentStationNumber = 9;
    public int minCurrentStationNumber = 0;
    public int currentStationNumber = minCurrentStationNumber;
    public int maxSoundVolume = 100;
    public int minSoundVolume = 0;
    public int soundVolume = minSoundVolume;

}
