package com.github.gtgolden.gregtech;

import com.github.gtgolden.gtgoldencore.item.MetaItem;
import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.modificationstation.stationapi.api.util.Null;

import java.awt.*;

public class GregTech {
    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        // state registry
        new MetaItem(MOD_ID.id("ingot"));
        new MetaItem(MOD_ID.id("dust"));

        // material registry
        new GTMaterial.Builder("iron")
                .setItem("ingot", ItemBase.ironIngot)
                .color(new Color(0xA19D94))
                .states("dust")
                .build();
        new GTMaterial.Builder("gold")
                .setItem("ingot", ItemBase.goldIngot)
                .color(new Color(0xE8CD67))
                .states("dust")
                .build();
        new GTMaterial.Builder("redstone")
                .setItem("dust", ItemBase.redstoneDust)
                .color(new Color(0xE8CD67))
                .states("ingot")
                .build();
    }
}
