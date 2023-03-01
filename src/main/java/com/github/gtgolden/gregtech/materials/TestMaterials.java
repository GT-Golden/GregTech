package com.github.gtgolden.gregtech.materials;

import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import net.minecraft.item.ItemBase;

import java.awt.*;

public class TestMaterials {
    public static void init() {
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
                .color(new Color(0xd33b2b))
                .states("ingot")
                .build();
    }
}
