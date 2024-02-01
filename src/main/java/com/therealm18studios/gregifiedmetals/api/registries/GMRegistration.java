package com.therealm18studios.gregifiedmetals.api.registries;

import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.therealm18studios.gregifiedmetals.GM;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

public class GMRegistration {

    public static final GTRegistrate REGISTRATE = GTRegistrate.create(GM.MOD_ID);
    static {
        GMRegistration.REGISTRATE.defaultCreativeTab((ResourceKey<CreativeModeTab>) null);
    }

    private GMRegistration() {/**/}


}