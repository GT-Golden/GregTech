package com.github.gtgolden.gregtech.events;

import com.github.gtgolden.gregtech.materials.*;
import com.github.gtgolden.gtgoldencore.item.MetaItem;
import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import com.github.gtgolden.gtgoldencore.material.Materials;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;

import static com.github.gtgolden.gregtech.GregTech.MOD_ID;

public class ItemListener {
    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        // state registry
        new MetaItem(MOD_ID.id("ingot"));
        new MetaItem(MOD_ID.id("dust"));
        new MetaItem(MOD_ID.id("ore"));
        new MetaItem(MOD_ID.id("gem"));
        // new MetaItem(MOD_ID.id(""));

        // temp implementation todo proper handling for each
        new MetaItem(MOD_ID.id("fluid"));
        new MetaItem(MOD_ID.id("plasma"));

        Materials.useModID(MOD_ID);

        // material registry
        ElementMaterials.register();

        FirstDegreeMaterials.register();

        OrganicChemistryMaterials.register();

//        UnknownCompositionMaterials.register();
//
//        SecondDegreeMaterials.register();
//
//        HigherDegreeMaterials.register();
//
//        MaterialFlagAddition.register();

//        printMaterialLang();
    }

    private void printMaterialLang() {
        for(GTMaterial gtMaterial: Materials.allMaterials()) {
            String out = "material."+gtMaterial.getName()+".name=";
            for(String word: gtMaterial.getName().split("_")) {
                out += word.substring(0, 1).toUpperCase();
                out += word.substring(1).toLowerCase();
                out += " ";
            }
            System.out.println(out.trim());
        }
    }
}
