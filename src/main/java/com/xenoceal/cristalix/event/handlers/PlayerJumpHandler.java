/*
 * Decompiled with CFR 0.150.
 */
package com.xenoceal.cristalix.event.handlers;

import com.xenoceal.cristalix.event.EventHandler;
import com.xenoceal.cristalix.event.EventType;

public interface PlayerJumpHandler
extends EventHandler {
    @Override
    default public EventType type() {
        return EventType.PLAYER_JUMP;
    }
}

