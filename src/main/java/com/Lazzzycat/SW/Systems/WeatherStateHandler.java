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

    public void Update(World world) {
        if (world.isRaining()) {
            if (world.isThundering()) {
                this.CurrentWeatherState = WeatherState.THUNDERSTORM;
            } else {
                this.CurrentWeatherState = WeatherState.RAIN;
            }
        } else {
            this.CurrentWeatherState = WeatherState.CLEAR;
        }
    }
}
