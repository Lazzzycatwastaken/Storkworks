package com.Lazzzycat.SW.Systems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class WeatherStateUpdater {

    private static final WeatherStateHandler weatherStateHandler = new WeatherStateHandler();

    private int tickCounter = 0;

    private static int TICK_INTERVAL = 20;

    @SubscribeEvent
    public void onWorldTick(TickEvent.WorldTickEvent event) {
        if (!event.world.isRemote) {
            if (event.phase == TickEvent.Phase.START) {
                tickCounter++;
                if (tickCounter >= TICK_INTERVAL) {
                    tickCounter = 0;
                    weatherStateHandler.GetState(event.world);
                }
            }
        }
    }
}
