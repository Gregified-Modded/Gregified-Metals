package com.therealm18studios.gregifiedmetals.api.registries;

import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.registrate.CompassSection;
import com.lowdragmc.lowdraglib.gui.texture.ItemStackTexture;
import com.therealm18studios.gregifiedmetals.registry.GMBuckets;

public class GMCompassSections {

    private static int priority = 0;

    static {
        GTRegistries.COMPASS_SECTIONS.unfreeze();
    }

    public final static CompassSection BUCKETS = CompassSection.create("misc")
            .icon(() -> new ItemStackTexture(GMBuckets.COPPER_BUCKET.asStack()))
            .priority(priority++)
            .register();
}
