package com.therealm18studios.gregifiedmetals;

import com.therealm18studios.gregifiedmetals.api.registries.GMRegistration;
import com.therealm18studios.gregifiedmetals.config.GMConfigHolder;
import com.therealm18studios.gregifiedmetals.data.GMDataGen;
import com.therealm18studios.gregifiedmetals.registry.GMBuckets;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(GM.MOD_ID)
public class GM {
    public static final String
            MOD_ID = "tr18sgm",
            NAME = "Gregified Metals";
    public GM() {
        GM.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
    }

    public static void init() {
        GMBuckets.init();
        GMConfigHolder.init();

        GMDataGen.init();

        GMRegistration.REGISTRATE.registerRegistrate();
    }
}