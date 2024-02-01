package com.therealm18studios.gregifiedmetals.data;

import com.gregtechceu.gtceu.data.lang.LangHandler;
import com.gregtechceu.gtceu.data.tags.BlockTagLoader;
import com.therealm18studios.gregifiedmetals.api.registries.GMRegistration;
import com.tterrag.registrate.providers.ProviderType;

public class GMDataGen {
    public static void init() {
        //GCyRRegistries.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, TagsHandler::initItem);
        GMRegistration.REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, BlockTagLoader::init);
//        GIRegistries.REGISTRATE.addDataGenerator(ProviderType.FLUID_TAGS, FluidTagLoader::init);
        GMRegistration.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
