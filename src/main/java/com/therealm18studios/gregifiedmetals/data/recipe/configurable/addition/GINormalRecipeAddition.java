package com.therealm18studios.gregifiedmetals.data.recipe.configurable.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.therealm18studios.gregifiedmetals.config.GMConfigHolder;
import com.therealm18studios.gregifiedmetals.registry.GMBuckets;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class GINormalRecipeAddition {

    public static void init(Consumer<FinishedRecipe> provider) {
        Buckets(provider);
        if (GMConfigHolder.INSTANCE.chooseDifficulty.normal.Buckets) Buckets(provider);
    }

    private static void Buckets(Consumer<FinishedRecipe> provider) {

        boolean nerfed = GMConfigHolder.INSTANCE.chooseDifficulty.normal.Buckets;
        if (nerfed) {
//            VanillaRecipeHelper.addShapedRecipe(provider, "tr18s/buckets/copper", new ItemStack(GMBuckets.COPPER_BUCKET), "I I"," I ", 'I', new UnificationEntry(TagPrefix.plate, GTMaterials.Copper));
        } else {

        }
    }
}