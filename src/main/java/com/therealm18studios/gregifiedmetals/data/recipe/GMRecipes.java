package com.therealm18studios.gregifiedmetals.data.recipe;

import com.lowdragmc.lowdraglib.Platform;
import com.therealm18studios.gregifiedmetals.data.recipe.configurable.addition.*;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class GMRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {

        if (Platform.isModLoaded("gtceu")) GINormalRecipeAddition.init(provider);
    }
}