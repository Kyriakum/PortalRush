package com.bloobon.portalrush.portalrush.events;

import com.bloobon.portalrush.portalrush.managers.game.GameManager;
import com.bloobon.portalrush.portalrush.tasks.Countdown;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public class CountdownFinishedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    @Getter
    private final GameManager gameManager;
    @Getter
    private final Countdown countdown;
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
