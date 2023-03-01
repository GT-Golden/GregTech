package com.github.gtgolden.gregtech.events;

import com.github.gtgolden.gregtech.materials.TestMaterials;
import com.github.gtgolden.gtgoldencore.item.MetaItem;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;

import static com.github.gtgolden.gregtech.GregTech.MOD_ID;

public class ItemListener {
    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        // state registry
        new MetaItem(MOD_ID.id("ingot"));
        new MetaItem(MOD_ID.id("dust"));

        // material registry
        TestMaterials.init();
    }
}
