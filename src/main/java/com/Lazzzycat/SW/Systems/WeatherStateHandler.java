package com.Lazzzycat.SW.Systems;

import net.minecraft.world.World;

public class WeatherStateHandler {

    public WeatherState CurrentWeatherState;

    public enum WeatherState {
        CLEAR,
        RAIN,
        THUNDERSTORM,
        SNOW
    }

    public void CurrentWeatherState() {
        this.CurrentWeatherState = WeatherState.CLEAR;
    }
}
