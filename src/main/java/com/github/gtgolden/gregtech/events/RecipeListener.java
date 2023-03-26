package com.github.gtgolden.gregtech.events;

import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import com.github.gtgolden.gtgoldencore.material.Materials;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;

public class RecipeListener {
    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        if (event.recipeId.equals(RecipeRegisterEvent.Vanilla.SMELTING.type())) {
            GTMaterial[] all = Materials.allMaterials();
            GTMaterial thatOne = all[all.length-1];
            String thatOneState = thatOne.states().get(0);
            for(GTMaterial material: all) {
                String state;
                if (material.states().size() > 0)
                    state = material.states().get(0);
                else
                    state = "missing";
                SmeltingRegistry.addSmeltingRecipe(material.as(state), thatOne.as(thatOneState));
                thatOne = material;
                thatOneState = state;
            }
//            SmeltingRegistry.addSmeltingRecipe(Materials.get("iron").as("dust"), Materials.get("iron").as("ingot"));
//            SmeltingRegistry.addSmeltingRecipe(Materials.get("iron").as("ingot"), Materials.get("iron").as("dust"));
//            SmeltingRegistry.addSmeltingRecipe(Materials.get("gold").as("dust"), Materials.get("gold").as("ingot"));
//            SmeltingRegistry.addSmeltingRecipe(Materials.get("gold").as("ingot"), Materials.get("gold").as("dust"));
//            SmeltingRegistry.addSmeltingRecipe(Materials.get("redstone").as("dust"), Materials.get("redstone").as("ingot"));
//            SmeltingRegistry.addSmeltingRecipe(Materials.get("redstone").as("ingot"), Materials.get("redstone").as("dust"));
        } else if (event.recipeId.equals(RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type())) {}
    }
}
