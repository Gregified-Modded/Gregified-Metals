package com.therealm18studios.gregifiedmetals;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.therealm18studios.gregifiedmetals.api.registries.GMRegistration;
import com.therealm18studios.gregifiedmetals.data.recipe.GMRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

@GTAddon
public class GMGTAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return GMRegistration.REGISTRATE;
    }

    @Override
    public void initializeAddon() {

    }

    @Override
    public String addonModId() {
        return GM.MOD_ID;
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        GMRecipes.newInit(provider);
    }
}