package com.therealm18studios.gregifiedmetals.registry;

import com.therealm18studios.gregifiedmetals.api.registries.GMCompassSections;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.gregtechceu.gtceu.common.data.GTItems.compassNodeExist;
import static com.therealm18studios.gregifiedmetals.api.registries.GMRegistration.REGISTRATE;

public class GMBuckets {

    public static void init() {

    }
    public static ItemEntry<Item> COPPER_BUCKET = REGISTRATE
            .item("copper_bucket", Item::new)
            .lang("Copper Bucket")
            .onRegister(compassNodeExist(GMCompassSections.BUCKETS, "bucket"))
            .register();
}