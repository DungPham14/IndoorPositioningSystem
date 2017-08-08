/*
 *
 */
package com.example.cpu0131.sdk.sharelocation.channel;

import com.indooratlas.android.sdk.IALocation;

/**
 * Data object that gets sent to channel.
 */
public class LocationEvent {

    /**
     * Origin of this location event.
     */
    public final LocationSource source;

    /**
     * Actual location shared.
     */
    public final IALocation location;

    public LocationEvent(LocationSource source, IALocation location) {
        this.source = source;
        this.location = location;
    }
}
