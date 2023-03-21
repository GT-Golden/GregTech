package com.github.gtgolden.gregtech.materials;


import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import com.github.gtgolden.gtgoldencore.material.chemistry.Elements;

import static com.github.gtgolden.gtgoldencore.material.chemistry.Elements.*;

public class FirstDegreeMaterials {

    public static void register() {
        new GTMaterial.Builder("almandine")
                .states("gem", "ore") // (1)(3, 1)
                .color(0xFF0000)
                .components("Al2Fe3Si3O12")
                .build();

        new GTMaterial.Builder("andradite")
                .states("gem") // (1)
                .color(0x967800) // .iconSet(RUBY)
                .components("Ca3Fe2Si3O12")
                .build();

        new GTMaterial.Builder("annealed_copper")
                .states("ingot", "fluid") // ()()
                .color(0xFF8D3B) // .iconSet(BRIGHT)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_FINE_WIRE)
                .element(Cu)
                // .cableProperties(GTValues.V[2], 1, 1)
                // .fluidTemp(1358)
                .build();
//        Cu.getProperty(PropertyKey.INGOT).setArcSmeltingInto(AnnealedCopper); todo arc smelting into

        new GTMaterial.Builder("asbestos")
                .states("dust", "ore") // (1)(3, 1)
                .color(0xE6E6E6)
                .components("Mg3Si2H4O9")
                .build();

        new GTMaterial.Builder("ash")
                .states("dust") // (1)
                .color(0x969696)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C")
                .build();

        new GTMaterial.Builder("banded_iron")
                .states("dust", "ore") // ()()
                .color(0x915A5A)
                .components("Fe2O3")
                .build();

        new GTMaterial.Builder("battery_alloy")
                .states("ingot", "fluid") // (1)()
                .color(0x9C7CA0)
                // .flags(EXT_METAL)
                .components("Pb4Sb")
                // .fluidTemp(660)
                .build();

        new GTMaterial.Builder("blue_topaz")
                .states("gem", "ore") // (3)(2, 1)
                .color(0x7B96DC) // .iconSet(GEM_HORIZONTAL)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components("Al2SiF2H2O6")
                .build();

        new GTMaterial.Builder("bone")
                .states("dust") // (1)
                .color(0xFAFAFA)
                // .flags(MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES)
                .components("Ca")
                .build();

        new GTMaterial.Builder("brass")
                .states("ingot", "fluid") // (1)()
                .color(0xFFB400) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE)
                .components("ZnCu3")
                // .rotorStats(8.0f, 3.0f, 152)
                // .itemPipeProperties(2048, 1)
                // .fluidTemp(1160)
                .build();

        new GTMaterial.Builder("bronze")
                .states("ingot", "fluid") // ()()
                .color(0xFF8000) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_FRAME, GENERATE_SMALL_GEAR, GENERATE_FOIL, GENERATE_GEAR)
                .components("SnCu3")
                .toolProperty(2, 192, 3.0F, 2)
//                        .enchantability(18).build())
                // .rotorStats(6.0f, 2.5f, 192)
                // .fluidPipeProperties(1696, 20, true)
                // .fluidTemp(1357)
                .build();

        new GTMaterial.Builder("brown_limonite")
                .states("dust", "ore") // (1)()
                .color(0xC86400) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, BLAST_FURNACE_CALCITE_TRIPLE)
                .components("FeHO2")
                .build();

        new GTMaterial.Builder("calcite")
                .states("dust", "ore") // (1)()
                .color(0xFAE6DC)
                .components("CaCO3")
                .build();

        new GTMaterial.Builder("cassiterite")
                .states("dust", "ore") // (1)(2, 1)
                .color(0xDCDCDC) // .iconSet(METALLIC)
                .components("SnO2")
                .build();

        new GTMaterial.Builder("cassiterite_sand")
                .states("dust", "ore") // (1)(2, 1)
                .color(0xDCDCDC) // .iconSet(SAND)
                .components("SnO2")
                .build();

        new GTMaterial.Builder("chalcopyrite")
                .states("dust", "ore") // (1)()
                .color(0xA07828)
                .components("CuFeS2")
                .build();

        new GTMaterial.Builder("charcoal")
                .states("gem") // (1, 1600) //default charcoal burn time in vanilla
                .color(0x644646) // .iconSet(FINE)
                // .flags(FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE)
                .components("C")
                .build();

        new GTMaterial.Builder("chromite")
                .states("dust", "ore") // (1)()
                .color(0x23140F) // .iconSet(METALLIC)
                .components("FeCrO4")
                .build();

        new GTMaterial.Builder("cinnabar")
                .states("gem", "ore") // (1)()
                .color(0x960000) // .iconSet(EMERALD)
                // .flags(CRYSTALLIZABLE, DECOMPOSITION_BY_CENTRIFUGING)
                .components("HgS")
                .build();

        new GTMaterial.Builder("water")
                .states("fluid") // ()
                .color(0x0000FF)
                // .flags(DISABLE_DECOMPOSITION)
                .components("H2O")
                // .fluidTemp(300)
                .build();

        new GTMaterial.Builder("liquid_oxygen")
                .states("fluid") // ()
                .color(0x6688DD)
                // .flags(DISABLE_DECOMPOSITION)
                .components("O")
                // .fluidTemp(85)
                .build();

        new GTMaterial.Builder("coal")
                .states("gem", "ore") // (1, 1600)(2, 1) //default coal burn time in vanilla
                .color(0x464646) // .iconSet(LIGNITE)
                // .flags(FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, DISABLE_DECOMPOSITION)
                .components("C")
                .build();

        new GTMaterial.Builder("cobaltite")
                .states("dust", "ore") // (1)()
                .color(0x5050FA) // .iconSet(METALLIC)
                .components("CoAsS")
                .build();

        new GTMaterial.Builder("cooperite")
                .states("dust", "ore") // (1)()
                .color(0xFFFFC8) // .iconSet(METALLIC)
                .components("Pt3NiSPa")
                .build();

        new GTMaterial.Builder("cupronickel")
                .states("ingot", "fluid") // (1)()
                .color(0xE39680) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_SPRING, GENERATE_FINE_WIRE)
                .components("CuNi")
                // .itemPipeProperties(2048, 1)
                // .cableProperties(GTValues.V[2], 1, 1)
                // .fluidTemp(1542)
                .build();

        new GTMaterial.Builder("dark_ash")
                .states("dust") // (1)
                .color(0x323232)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C")
                .build();

        new GTMaterial.Builder("diamond")
                .states("gem", "ore") // (3)()
                .color(0xC8FFFF) // .iconSet(DIAMOND)
                // .flags(GENERATE_BOLT_SCREW, GENERATE_LENS, GENERATE_GEAR, NO_SMASHING, NO_SMELTING,
//                        HIGH_SIFTER_OUTPUT, DISABLE_DECOMPOSITION, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES)
                .components("C")
                .toolProperty(3, 768, 6.0F, 7)
//                        .attackSpeed(0.1F).enchantability(18).build())
                .build();

        new GTMaterial.Builder("electrum")
                .states("ingot", "fluid") // ()()
                .color(0xFFFF64) // .iconSet(SHINY)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_RING)
                .components("AgAu")
                // .itemPipeProperties(1024, 2)
                // .cableProperties(GTValues.V[3], 2, 2)
                // .fluidTemp(1285)
                .build();

        new GTMaterial.Builder("emerald")
                .states("gem", "ore") // ()(2, 1)
                .color(0x50FF50) // .iconSet(EMERALD)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, GENERATE_LENS)
                .components("Be3Al2Si6O18")
                .build();

        new GTMaterial.Builder("galena")
                .states("dust", "ore") // (3)()
                .color(0x643C64)
                // .flags(NO_SMELTING)
                .components("PbS")
                .build();

        new GTMaterial.Builder("garnierite")
                .states("dust", "ore") // (3)()
                .color(0x32C846) // .iconSet(METALLIC)
                .components("NiO")
                .build();

        new GTMaterial.Builder("green_sapphire")
                .states("gem", "ore") // ()()
                .color(0x64C882) // .iconSet(GEM_HORIZONTAL)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components("Al2O3")
                .build();

        new GTMaterial.Builder("grossular")
                .states("gem", "ore") // (1)(3, 1)
                .color(0xC86400) // .iconSet(RUBY)
                .components("Ca3Al2Si3O12")
                .build();

        new GTMaterial.Builder("ice")
                .states("dust", "fluid") // (0)()
                .color(0xC8C8FF) // .iconSet(SHINY)
                // .flags(NO_SMASHING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, DISABLE_DECOMPOSITION)
                .components("H2O")
                // .fluidTemp(273)
                .build();

        new GTMaterial.Builder("ilmenite")
                .states("dust", "ore") // (3)()
                .color(0x463732) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components("FeTiO3")
                .build();

        new GTMaterial.Builder("rutile")
                .states("gem") // ()
                .color(0xD40D5C) // .iconSet(GEM_HORIZONTAL)
                // .flags(DISABLE_DECOMPOSITION)
                .components("TiO2")
                .build();

        new GTMaterial.Builder("bauxite")
                .states("dust", "ore") // (1)()
                .color(0xC86400)
                // .flags(DISABLE_DECOMPOSITION)
                .components("Al2O3")
                .build();

        new GTMaterial.Builder("invar")
                .states("ingot", "fluid") // ()()
                .color(0xB4B478) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_FRAME, GENERATE_GEAR)
                .components("Fe2Ni")
                .toolProperty(2, 384, 4.0F, 3)
//                        .enchantability(18)
//                        .enchantment(Enchantments.BANE_OF_ARTHROPODS, 3)
//                        .enchantment(Enchantments.EFFICIENCY, 1).build())
                // .rotorStats(7.0f, 3.0f, 512)
                // .fluidTemp(1916)
                .build();

        new GTMaterial.Builder("kanthal")
                .states("ingot", "fluid") // ()()
                .color(0xC2D2DF) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_SPRING)
                .components("FeAlCr")
                // .cableProperties(GTValues.V[3], 4, 3)
                // .blastTemp(1800, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1708)
                .build();

        new GTMaterial.Builder("lazurite")
                .states("gem", "ore") // (1)(6, 4)
                .color(0x6478FF) // .iconSet(LAPIS)
                // .flags(GENERATE_PLATE, NO_SMASHING, NO_SMELTING, CRYSTALLIZABLE, GENERATE_ROD, DECOMPOSITION_BY_ELECTROLYZING)
                .components("Al6Si6Ca8Na8")
                .build();

        new GTMaterial.Builder("magnalium")
                .states("ingot", "fluid") // ()()
                .color(0xC8BEFF)
                // .flags(EXT2_METAL)
                .components("MgAl2")
                // .rotorStats(6.0f, 2.0f, 256)
                // .itemPipeProperties(1024, 2)
                // .fluidTemp(929)
                .build();

        new GTMaterial.Builder("magnesite")
                .states("dust", "ore") // ()()
                .color(0xFAFAB4) // .iconSet(METALLIC)
                .components("MgCO3")
                .build();

        new GTMaterial.Builder("magnetite")
                .states("dust") // ().ore()
                .color(0x1E1E1E) // .iconSet(METALLIC)
                .components("Fe3O4")
                .build();

        new GTMaterial.Builder("molybdenite")
                .states("dust") // ().ore()
                .color(0x191919) // .iconSet(METALLIC)
                .components(Molybdenum, 1, S, 2)
                .build();

        new GTMaterial.Builder("nichrome")
                .states("ingot") // ().fluid()
                .color(0xCDCEF6) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_SPRING)
                .components(Ni, 4, Cr, 1)
                // .cableProperties(GTValues.V[4], 4, 4)
                // .blastTemp(2700, GasTier.LOW, VA[HV], 1300)
                // .fluidTemp(1818)
                .build();

        new GTMaterial.Builder("niobium_nitride")
                .states("ingot") // ().fluid()
                .color(0x1D291D)
                // .flags(EXT_METAL, GENERATE_FOIL)
                .components(Niobium, 1, Nitrogen, 1)
                // .cableProperties(GTValues.V[6], 1, 1)
                // .blastTemp(2846, GasTier.MID)
                .build();

        new GTMaterial.Builder("niobium_titanium")
                .states("ingot") // ().fluid()
                .color(0x1D1D29)
                // .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components(Niobium, 1, Ti, 1)
                // .fluidPipeProperties(5900, 175, true)
                // .cableProperties(GTValues.V[6], 4, 2)
                // .blastTemp(4500, GasTier.HIGH, VA[HV], 1500)
                // .fluidTemp(2345)
                .build();

        new GTMaterial.Builder("obsidian")
                .states("dust") // (3)
                .color(0x503264)
                // .flags(NO_SMASHING, EXCLUDE_BLOCK_CRAFTING_RECIPES, GENERATE_PLATE)
                .components(Mg, 1, Fe, 1, Si.x(2), O.x(4))
                .build();

        new GTMaterial.Builder("phosphate")
                .states("dust") // (1)
                .color(0xFFFF00)
                // .flags(NO_SMASHING, NO_SMELTING, FLAMMABLE, EXPLOSIVE)
                .components(Phosphorus, 1, O.x(4))
                .build();

        new GTMaterial.Builder("platinum_raw")
                .states("dust") // ()
                .color(0xFFFFC8) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Pt, 1, Chlorine, 2)
                .build();

        new GTMaterial.Builder("sterling_silver")
                .states("ingot") // ().fluid()
                .color(0xFADCE1) // .iconSet(SHINY)
                // .flags(EXT2_METAL)
                .components(Cu, 1, Ag, 4)
                .toolProperty(3.0F, 8.0F, 768, 2)
                        .attackSpeed(0.3F).enchantability(33)
                        .enchantment(Enchantments.SMITE, 3).build())
                // .rotorStats(13.0f, 2.0f, 196)
                // .itemPipeProperties(1024, 2)
                // .blastTemp(1700, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1258)
                .build();

        new GTMaterial.Builder("rose_gold")
                .states("ingot") // ().fluid()
                .color(0xFFE61E) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_RING)
                .components(Cu, 1, Au, 4)
                .toolProperty(12.0F, 2.0F, 768, 2)
                        .enchantability(33)
                        .enchantment(Enchantments.FORTUNE, 2).build())
                // .rotorStats(14.0f, 2.0f, 152)
                // .itemPipeProperties(1024, 2)
                // .blastTemp(1600, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1341)
                .build();

        new GTMaterial.Builder("black_bronze")
                .states("ingot") // ().fluid()
                .color(0x64327D)
                // .flags(EXT2_METAL, GENERATE_GEAR)
                .components(Au, 1, Ag, 1, Cu, 3)
                // .rotorStats(12.0f, 2.0f, 256)
                // .itemPipeProperties(1024, 2)
                // .blastTemp(2000, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1328)
                .build();

        new GTMaterial.Builder("bismuth_bronze")
                .states("ingot") // ().fluid()
                .color(0x647D7D)
                // .flags(EXT2_METAL)
                .components(Bismuth, 1, Zn, 1, Cu, 3)
                // .rotorStats(8.0f, 3.0f, 256)
                // .blastTemp(1100, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1036)
                .build();

        new GTMaterial.Builder("biotite")
                .states("dust") // (1)
                .color(0x141E14) // .iconSet(METALLIC)
                .components(Potassium, 1, Mg, 3, Al, 3, F, 2, Si.x(3), O.x(10))
                .build();

        new GTMaterial.Builder("powellite")
                .states("dust") // ().ore()
                .color(0xFFFF00)
                .components(Ca1, Molybdenum, 1, O.x(4))
                .build();

        new GTMaterial.Builder("pyrite")
                .states("dust") // (1).ore()
                .color(0x967828) // .iconSet(ROUGH)
                // .flags(BLAST_FURNACE_CALCITE_DOUBLE)
                .components(Fe, 1, S, 2)
                .build();

        new GTMaterial.Builder("pyrolusite")
                .states("dust") // ().ore()
                .color(0x9696AA)
                .components(Manganese, 1, O.x(2))
                .build();

        new GTMaterial.Builder("pyrope")
                .states("gem") // ().ore(3, 1)
                .color(0x783264) // .iconSet(RUBY)
                .components(Al, 2, Mg, 3, Si.x(3), O.x(12))
                .build();

        new GTMaterial.Builder("rock_salt")
                .states("gem") // (1).ore(2, 1)
                .color(0xF0C8C8) // .iconSet(FINE)
                // .flags(NO_SMASHING)
                .components(Potassium, 1, Chlorine, 1)
                .build();

        new GTMaterial.Builder("ruridit")
                .states("ingot") // (3)
                .colorAverage() // .iconSet(BRIGHT)
                // .flags(GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components(Ruthenium, 2, Iridium, 1)
                // .blastTemp(4500, GasTier.HIGH, VA[EV], 1600)
                .build();

        new GTMaterial.Builder("ruby")
                .states("gem") // ().ore()
                .color(0xFF6464) // .iconSet(RUBY)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT, GENERATE_LENS)
                .components(Cr, 1, Al, 2, O.x(3))
                .build();

        new GTMaterial.Builder("salt")
                .states("gem") // (1).ore(2, 1)
                .color(0xFAFAFA) // .iconSet(FINE)
                // .flags(NO_SMASHING)
                .components(Na, 1, Chlorine, 1)
                .build();

        new GTMaterial.Builder("saltpeter")
                .states("dust") // (1).ore(2, 1)
                .color(0xE6E6E6) // .iconSet(FINE)
                // .flags(NO_SMASHING, NO_SMELTING, FLAMMABLE)
                .components(Potassium, 1, Nitrogen, 1, O.x(3))
                .build();

        new GTMaterial.Builder("sapphire")
                .states("gem") // ().ore()
                .color(0x6464C8) // .iconSet(GEM_VERTICAL)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT, GENERATE_LENS)
                .components(Al, 2, O.x(3))
                .build();

        new GTMaterial.Builder("scheelite")
                .states("dust") // (3).ore()
                .color(0xC88C14)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Ca1, Tungsten, 1, O.x(4))
                .build()
                .setFormula("Ca(WO3)O", true);

        new GTMaterial.Builder("sodalite")
                .states("gem") // (1).ore(6, 4)
                .color(0x1414FF) // .iconSet(LAPIS)
                // .flags(GENERATE_PLATE, GENERATE_ROD, NO_SMASHING, NO_SMELTING, CRYSTALLIZABLE, DECOMPOSITION_BY_ELECTROLYZING)
                .components(Al, 3, Si.x(3), Na, 4, Chlorine, 1)
                .build();

        new GTMaterial.Builder("aluminium_sulfite")
                .states("dust") // ()
                .color(0xCC4BBB) // .iconSet(DULL)
                .components(Al, 2, S, 3, O.x(9))
                .build().setFormula("Al2(SO3)3", true);

        new GTMaterial.Builder("tantalite")
                .states("dust") // (3).ore()
                .color(0x915028) // .iconSet(METALLIC)
                .components(Manganese, 1, Tantalum, 2, O.x(6))
                .build();

        new GTMaterial.Builder("coke")
                .states("gem") // (2, 3200) // 2x burn time of coal
                .color(0x666666) // .iconSet(LIGNITE)
                // .flags(FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE)
                .components(C, 1)
                .build();

        new GTMaterial.Builder("soldering_alloy")
                .states("ingot") // (1).fluid()
                .color(0x9696A0)
                .components(Sn, 6, Pb, 3, Sb, 1)
                // .fluidTemp(544)
                .build();

        new GTMaterial.Builder("spessartine")
                .states("gem") // ().ore(3, 1)
                .color(0xFF6464) // .iconSet(RUBY)
                .components(Al, 2, Manganese, 3, Si.x(3), O.x(12))
                .build();

        new GTMaterial.Builder("sphalerite")
                .states("dust") // (1).ore()
                .color(0xFFFFFF)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Zn, 1, S, 1)
                .build();

        new GTMaterial.Builder("stainless_steel")
                .states("ingot") // (3).fluid()
                .color(0xC8C8DC) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR)
                .components(Fe, 6, Cr, 1, Manganese, 1, Ni, 1)
                .toolProperty(7.0F, 5.0F, 1024, 3)
                        .enchantability(14).build())
                // .rotorStats(7.0f, 4.0f, 480)
                // .fluidPipeProperties(2428, 75, true, true, true, false)
                // .blastTemp(1700, GasTier.LOW, VA[HV], 1100)
                // .fluidTemp(2011)
                .build();

        new GTMaterial.Builder("steel")
                .states("ingot") // (3).fluid()
                .color(0x808080) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_SPRING,
                        GENERATE_SPRING_SMALL, GENERATE_FRAME, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .components(Fe, 1)
                .toolProperty(5.0F, 3.0F, 512, 3)
                        .enchantability(14).build())
                // .rotorStats(6.0f, 3.0f, 512)
                // .fluidPipeProperties(1855, 75, true)
                // .cableProperties(GTValues.V[4], 2, 2)
                // .blastTemp(1000, null, VA[MV], 800) // no gas tier for steel
                // .fluidTemp(2046)
                .build();

        new GTMaterial.Builder("stibnite")
                .states("dust") // ().ore()
                .color(0x464646) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Sb, 2, S, 3)
                .build();

        // Free ID 326

        new GTMaterial.Builder("tetrahedrite")
                .states("dust") // ().ore()
                .color(0xC82000)
                .components(Cu, 3, Sb, 1, S, 3, Fe, 1)
                .build();

        new GTMaterial.Builder("tin_alloy")
                .states("ingot") // ().fluid()
                .color(0xC8C8C8) // .iconSet(METALLIC)
                // .flags(EXT2_METAL)
                .components(Sn, 1, Fe, 1)
                // .fluidPipeProperties(1572, 20, true)
                // .fluidTemp(1258)
                .build();

        new GTMaterial.Builder("topaz")
                .states("gem") // (3).ore()
                .color(0xFF8000) // .iconSet(GEM_HORIZONTAL)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components(Al, 2, Si.x(1), F, 1, H, 2)
                .build();

        new GTMaterial.Builder("tungstate")
                .states("dust") // (3).ore()
                .color(0x373223)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Tungsten, 1, Lithium, 2, O.x(4))
                .build()
                .setFormula("Li2(WO3)O", true);

        new GTMaterial.Builder("ultimet")
                .states("ingot") // (4).fluid()
                .color(0xB4B4E6) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_GEAR)
                .components(Co, 5, Cr, 2, Ni, 1, Molybdenum, 1)
                .toolProperty(10.0F, 7.0F, 2048, 4)
                        .attackSpeed(0.1F).enchantability(21).build())
                // .rotorStats(9.0f, 4.0f, 2048)
                // .itemPipeProperties(128, 16)
                // .blastTemp(2700, GasTier.MID, VA[HV], 1300)
                // .fluidTemp(1980)
                .build();

        new GTMaterial.Builder("uraninite")
                .states("dust") // (3).ore(true)
                .color(0x232323) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Uranium238, 1, O.x(2))
                .build()
                .setFormula("UO2", true);

        new GTMaterial.Builder("uvarovite")
                .states("gem") // ()
                .color(0xB4ffB4) // .iconSet(RUBY)
                .components(Ca3, Cr, 2, Si.x(3), O.x(12))
                .build();

        new GTMaterial.Builder("vanadium_gallium")
                .states("ingot") // ().fluid()
                .color(0x80808C) // .iconSet(SHINY)
                // .flags(STD_METAL, GENERATE_FOIL, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components(Vanadium, 3, Gallium, 1)
                // .cableProperties(GTValues.V[7], 4, 2)
                // .blastTemp(4500, GasTier.HIGH, VA[EV], 1200)
                // .fluidTemp(1712)
                .build();

        new GTMaterial.Builder("wrought_iron")
                .states("ingot") // ().fluid()
                .color(0xC8B4B4) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_GEAR, GENERATE_FOIL, MORTAR_GRINDABLE, GENERATE_RING, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, DISABLE_DECOMPOSITION, BLAST_FURNACE_CALCITE_TRIPLE)
                .components(Fe, 1)
                .toolProperty(2.0F, 2.0F, 384, 2)
                        .attackSpeed(-0.2F).enchantability(5).build())
                // .rotorStats(6.0f, 3.5f, 384)
                // .fluidTemp(2011)
                .build();
        Fe.getProperty(PropertyKey.INGOT).setSmeltingInto(WroughtIron);
        Fe.getProperty(PropertyKey.INGOT).setArcSmeltingInto(WroughtIron);

        new GTMaterial.Builder("wulfenite")
                .states("dust") // (3).ore()
                .color(0xFF8000)
                .components(Pb, 1, Molybdenum, 1, O.x(4))
                .build();

        new GTMaterial.Builder("yellow_limonite")
                .states("dust") // ().ore()
                .color(0xC8C800) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, BLAST_FURNACE_CALCITE_DOUBLE)
                .components(Fe, 1, H, 1, O.x(2))
                .build();

        new GTMaterial.Builder("yttrium_barium_cuprate")
                .states("ingot") // ().fluid()
                .color(0x504046) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_FINE_WIRE, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .components(Yttrium, 1, Barium, 2, Cu, 3, O.x(7))
                // .cableProperties(GTValues.V[8], 4, 4)
                // .blastTemp(4500, GasTier.HIGH) // todo redo this EBF process
                // .fluidTemp(1799)
                .build();

        new GTMaterial.Builder("nether_quartz")
                .states("gem") // (1).ore(2, 1)
                .color(0xE6D2D2) // .iconSet(QUARTZ)
                // .flags(GENERATE_PLATE, NO_SMELTING, CRYSTALLIZABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, DISABLE_DECOMPOSITION)
                .components(Si.x(1), O.x(2))
                .build();

        new GTMaterial.Builder("certus_quartz")
                .states("gem") // (1).ore(2, 1)
                .color(0xD2D2E6) // .iconSet(CERTUS)
                // .flags(GENERATE_PLATE, NO_SMELTING, CRYSTALLIZABLE, DISABLE_DECOMPOSITION)
                .components(Si.x(1), O.x(2))
                .build();

        new GTMaterial.Builder("quartzite")
                .states("gem") // (1).ore(2, 1)
                .color(0xD2E6D2) // .iconSet(QUARTZ)
                // .flags(NO_SMELTING, CRYSTALLIZABLE, DISABLE_DECOMPOSITION, GENERATE_PLATE)
                .components(Si.x(1), O.x(2))
                .build();

        new GTMaterial.Builder("graphite")
                .ore()
                .color(0x808080)
                // .flags(NO_SMELTING, FLAMMABLE, DISABLE_DECOMPOSITION)
                .components(C, 1)
                .build();

        new GTMaterial.Builder("graphene")
                .states("dust") // ()
                .color(0x808080) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components(C, 1)
                // .cableProperties(GTValues.V[5], 1, 1)
                .build();

        new GTMaterial.Builder("tungstic_acid")
                .states("dust") // ()
                .color(0xBCC800) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components(H, 2, Tungsten, 1, O.x(4))
                .build();

        new GTMaterial.Builder("osmiridium")
                .states("ingot") // (3).fluid()
                .color(0x6464FF) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .components(Iridium, 3, Osmium, 1)
                // .rotorStats(9.0f, 3.0f, 3152)
                // .itemPipeProperties(64, 32)
                // .blastTemp(4500, GasTier.HIGH, VA[LuV], 900)
                // .fluidTemp(3012)
                .build();

        new GTMaterial.Builder("lithium_chloride")
                .states("dust") // ()
                .color(0xDEDEFA) // .iconSet(FINE)
                .components(Lithium, 1, Chlorine, 1)
                .build();

        new GTMaterial.Builder("calcium_chloride")
                .states("dust") // ()
                .color(0xEBEBFA) // .iconSet(FINE)
                .components(Ca1, Chlorine, 2)
                .build();

        new GTMaterial.Builder("bornite")
                .states("dust") // (1).ore()
                .color(0x97662B) // .iconSet(METALLIC)
                .components(Cu, 5, Fe, 1, S, 4)
                .build();

        new GTMaterial.Builder("chalcocite")
                .states("dust") // ().ore()
                .color(0x353535) // .iconSet(GEM_VERTICAL)
                .components(Cu, 2, S, 1)
                .build();

        // Free ID 349

        // Free ID 350

        new GTMaterial.Builder("gallium_arsenide")
                .states("ingot") // (1).fluid()
                .color(0xA0A0A0)
                // .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(As, 1, Gallium, 1)
                // .blastTemp(1200, GasTier.LOW, VA[MV], 1200)
                // .fluidTemp(1511)
                .build();

        new GTMaterial.Builder("potash")
                .states("dust") // (1)
                .color(0x784137)
                .components(Potassium, 2, O.x(1))
                .build();

        new GTMaterial.Builder("soda_ash")
                .states("dust") // (1)
                .color(0xDCDCFF)
                .components(Na, 2, C, 1, O.x(3))
                .build();

        new GTMaterial.Builder("indium_gallium_phosphide")
                .states("ingot") // (1).fluid()
                .color(0xA08CBE)
                // .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Indium, 1, Gallium, 1, Phosphorus, 1)
                // .fluidTemp(350)
                .build();

        new GTMaterial.Builder("nickel_zinc_ferrite")
                .states("ingot") // (0).fluid()
                .color(0x3C3C3C) // .iconSet(METALLIC)
                // .flags(GENERATE_RING)
                .components(Ni, 1, Zn, 1, Fe, 4, O.x(8))
                // .fluidTemp(1410)
                .build();

        new GTMaterial.Builder("silicon_dioxide")
                .states("dust") // (1)
                .color(0xC8C8C8) // .iconSet(QUARTZ)
                // .flags(NO_SMASHING, NO_SMELTING)
                .components(Si.x(1), O.x(2))
                .build();

        new GTMaterial.Builder("magnesium_chloride")
                .states("dust") // (1)
                .color(0xD40D5C)
                .components(Mg, 1, Chlorine, 2)
                .build();

        new GTMaterial.Builder("sodium_sulfide")
                .states("dust") // (1)
                .color(0xFFE680)
                .components(Na, 2, S, 1)
                .build();

        new GTMaterial.Builder("phosphorus_pentoxide")
                .states("dust") // (1)
                .color(0xDCDC00)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Phosphorus, 4, O.x(10))
                .build();

        new GTMaterial.Builder("quicklime")
                .states("dust") // (1)
                .color(0xF0F0F0)
                .components(Ca1, O.x(1))
                .build();

        new GTMaterial.Builder("sodium_bisulfate")
                .states("dust") // (1)
                .color(0x004455)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Na, 1, H, 1, S, 1, O.x(4))
                .build();

        new GTMaterial.Builder("ferrite_mixture")
                .states("dust") // (1)
                .color(0xB4B4B4) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Ni, 1, Zn, 1, Fe, 4)
                .build();

        new GTMaterial.Builder("magnesia")
                .states("dust") // (1)
                .color(0x887878)
                .components(Mg, 1, O.x(1))
                .build();

        new GTMaterial.Builder("platinum_group_sludge")
                .states("dust") // (1)
                .color(0x001E00) // .iconSet(FINE)
                // .flags(DISABLE_DECOMPOSITION)
                .build();

        new GTMaterial.Builder("realgar")
                .states("gem") // ().ore()
                .color(0x9D2123) // .iconSet(EMERALD)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(As, 4, S, 4)
                .build();

        new GTMaterial.Builder("sodium_bicarbonate")
                .states("dust") // (1)
                .color(0x565b96) // .iconSet(ROUGH)
                .components(Na, 1, H, 1, C, 1, O.x(3))
                .build();

        new GTMaterial.Builder("potassium_dichromate")
                .states("dust") // (1)
                .color(0xFF084E)
                .components(Potassium, 2, Cr, 2, O.x(7))
                .build();

        new GTMaterial.Builder("chromium_trioxide")
                .states("dust") // (1)
                .color(0xFFE4E1)
                .components(Cr, 1, O.x(3))
                .build();

        new GTMaterial.Builder("antimony_trioxide")
                .states("dust") // (1)
                .color(0xE6E6F0)
                .components(Sb, 2, O.x(3))
                .build();

        new GTMaterial.Builder("zincite")
                .states("dust") // (1)
                .color(0xFFFFF5)
                .components(Zn, 1, O.x(1))
                .build();

        new GTMaterial.Builder("cupric_oxide")
                .states("dust") // (1)
                .color(0x0F0F0F)
                .components(Cu, 1, O.x(1))
                .build();

        new GTMaterial.Builder("cobalt_oxide")
                .states("dust") // (1)
                .color(0x788000)
                .components(Co, 1, O.x(1))
                .build();

        new GTMaterial.Builder("arsenic_trioxide")
                .states("dust") // (1)
                 // .iconSet(ROUGH)
                .components(As, 2, O.x(3))
                .build();

        new GTMaterial.Builder("massicot")
                .states("dust") // (1)
                .color(0xFFDD55)
                .components(Pb, 1, O.x(1))
                .build();

        new GTMaterial.Builder("ferrosilite")
                .states("dust") // (1)
                .color(0x97632A)
                .components(Fe, 1, Si.x(1), O.x(3))
                .build();

        new GTMaterial.Builder("metal_mixture")
                .states("dust") // (1)
                .color(0x502d16) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .build();

        new GTMaterial.Builder("sodium_hydroxide")
                .states("dust") // (1)
                .color(0x003380)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Na, 1, O.x(1), H, 1)
                .build();

        new GTMaterial.Builder("sodium_persulfate")
                .states("fluid")()
                .components(Na, 2, S, 2, O.x(8))
                .build();

        new GTMaterial.Builder("bastnasite")
                .states("dust") // ().ore(2, 1)
                .color(0xC86E2D) // .iconSet(FINE)
                .components(Cerium, 1, C, 1, F, 1, O.x(3))
                .build();

        new GTMaterial.Builder("pentlandite")
                .states("dust") // ().ore()
                .color(0xA59605)
                .components(Ni, 9, S, 8)
                .build();

        new GTMaterial.Builder("spodumene")
                .states("dust") // ().ore()
                .color(0xBEAAAA)
                .components(Lithium, 1, Al, 1, Si.x(2), O.x(6))
                .build();

        new GTMaterial.Builder("lepidolite")
                .states("dust") // ().ore(2, 1)
                .color(0xF0328C) // .iconSet(FINE)
                .components(Potassium, 1, Lithium, 3, Al, 4, F, 2, O.x(10))
                .build();

        // Free ID 383

        new GTMaterial.Builder("glauconite_sand")
                .states("dust") // ().ore(3, 1)
                .color(0x82B43C) // .iconSet(SAND)
                .components(Potassium, 1, Mg, 2, Al, 4, H, 2, O.x(12))
                .build();

        new GTMaterial.Builder("malachite")
                .states("gem") // ().ore()
                .color(0x055F05) // .iconSet(LAPIS)
                .components(Cu, 2, C, 1, H, 2, O.x(5))
                .build();

        new GTMaterial.Builder("mica")
                .states("dust") // ().ore(2, 1)
                .color(0xC3C3CD) // .iconSet(FINE)
                .components(Potassium, 1, Al, 3, Si.x(3), F, 2, O.x(10))
                .build();

        new GTMaterial.Builder("barite")
                .states("dust") // ().ore()
                .color(0xE6EBEB)
                .components(Barium, 1, S, 1, O.x(4))
                .build();

        new GTMaterial.Builder("alunite")
                .states("dust") // ().ore(3, 1)
                .color(0xE1B441) // .iconSet(METALLIC)
                .components(Potassium, 1, Al, 3, Si.x(2), H, 6, O.x(14))
                .build();

        // Free ID 389

        // Free ID 390

        // Free ID 391

        new GTMaterial.Builder("talc")
                .states("dust") // ().ore(2, 1)
                .color(0x5AB45A) // .iconSet(FINE)
                .components(Mg, 3, Si.x(4), H, 2, O.x(12))
                .build();

        new GTMaterial.Builder("soapstone")
                .states("dust") // (1).ore(3, 1)
                .color(0x5F915F)
                .components(Mg, 3, Si.x(4), H, 2, O.x(12))
                .build();

        new GTMaterial.Builder("kyanite")
                .states("dust") // ().ore()
                .color(0x6E6EFA) // .iconSet(FLINT)
                .components(Al, 2, Si.x(1), O.x(5))
                .build();

        new GTMaterial.Builder("iron_magnetic")
                .states("ingot") // ()
                .color(0xC8C8C8) // .iconSet(MAGNETIC)
                // .flags(GENERATE_BOLT_SCREW, IS_MAGNETIC)
                .components(Fe, 1)
                .ingotSmeltInto(Fe)
                .arcSmeltInto(WroughtIron)
                .macerateInto(Fe)
                .build();
        Fe.getProperty(PropertyKey.INGOT).setMagneticMaterial(IronMagnetic);

        new GTMaterial.Builder("tungsten_carbide")
                .states("ingot") // (4).fluid()
                .color(0x330066) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_GEAR, DECOMPOSITION_BY_CENTRIFUGING)
                .components(Tungsten, 1, C, 1)
                .toolProperty(60.0F, 2.0F, 1024, 4)
                        .enchantability(21).build())
                // .rotorStats(12.0f, 4.0f, 1280)
                // .fluidPipeProperties(3837, 200, true)
                // .blastTemp(3058, GasTier.MID, VA[HV], 1500)
                .build();

        new GTMaterial.Builder("carbon_dioxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0xA9D0F5)
                .components(C, 1, O.x(2))
                .build();

        new GTMaterial.Builder("titanium_tetrachloride")
                .states("fluid")()
                .color(0xD40D5C)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Ti, 1, Chlorine, 4)
                .build();

        new GTMaterial.Builder("nitrogen_dioxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0x85FCFF) // .iconSet(GAS)
                .components(Nitrogen, 1, O.x(2))
                .build();

        new GTMaterial.Builder("hydrogen_sulfide")
                .states("fluid")(FluidTypes.GAS)
                .components(H, 2, S, 1)
                .build();

        new GTMaterial.Builder("nitric_acid")
                .states("fluid")(FluidTypes.ACID)
                .color(0xCCCC00)
                // .flags(DISABLE_DECOMPOSITION)
                .components(H, 1, Nitrogen, 1, O.x(3))
                .build();

        new GTMaterial.Builder("sulfuric_acid")
                .states("fluid")(FluidTypes.ACID)
                // .flags(DISABLE_DECOMPOSITION)
                .components(H, 2, S, 1, O.x(4))
                .build();

        new GTMaterial.Builder("phosphoric_acid")
                .states("fluid")(FluidTypes.ACID)
                .color(0xDCDC01)
                // .flags(DISABLE_DECOMPOSITION)
                .components(H, 3, Phosphorus, 1, O.x(4))
                .build();

        new GTMaterial.Builder("sulfur_trioxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0xA0A014)
                .components(S, 1, O.x(3))
                .build();

        new GTMaterial.Builder("sulfur_dioxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0xC8C819)
                .components(S, 1, O.x(2))
                .build();

        new GTMaterial.Builder("carbon_monoxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0x0E4880)
                .components(C, 1, O.x(1))
                .build();

        new GTMaterial.Builder("hypochlorous_acid")
                .states("fluid")(FluidTypes.ACID)
                .color(0x6F8A91)
                .components(H, 1, Chlorine, 1, O.x(1))
                .build();

        new GTMaterial.Builder("ammonia")
                .states("fluid")(FluidTypes.GAS)
                .color(0x3F3480)
                .components(Nitrogen, 1, H, 3)
                .build();

        new GTMaterial.Builder("hydrofluoric_acid")
                .states("fluid")(FluidTypes.ACID)
                .color(0x0088AA)
                .components(H, 1, F, 1)
                .build();

        new GTMaterial.Builder("nitric_oxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0x7DC8F0)
                .components(Nitrogen, 1, O.x(1))
                .build();

        new GTMaterial.Builder("iron_iii_chloride")
                .states("fluid")()
                .color(0x060B0B)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Fe, 1, Chlorine, 3)
                .build();

        new GTMaterial.Builder("uranium_hexafluoride")
                .states("fluid")(FluidTypes.GAS)
                .color(0x42D126)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Uranium238, 1, F, 6)
                .build()
                .setFormula("UF6", true);

        new GTMaterial.Builder("enriched_uranium_hexafluoride")
                .states("fluid")(FluidTypes.GAS)
                .color(0x4BF52A)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Uranium235, 1, F, 6)
                .build()
                .setFormula("UF6", true);

        new GTMaterial.Builder("depleted_uranium_hexafluoride")
                .states("fluid")(FluidTypes.GAS)
                .color(0x74BA66)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Uranium238, 1, F, 6)
                .build()
                .setFormula("UF6", true);

        new GTMaterial.Builder("nitrous_oxide")
                .states("fluid")(FluidTypes.GAS)
                .color(0x7DC8FF)
                .components(Nitrogen, 2, O.x(1))
                .build();

        new GTMaterial.Builder("ender_pearl")
                .states("gem") // (1)
                .color(0x6CDCC8)
                // .flags(NO_SMASHING, NO_SMELTING, GENERATE_PLATE)
                .components(Be, 1, Potassium, 4, Nitrogen, 5)
                .build();

        new GTMaterial.Builder("potassium_feldspar")
                .states("dust") // (1)
                .color(0x782828) // .iconSet(FINE)
                .components(Potassium, 1, Al, 1, Si.x(1), O.x(8))
                .build();

        new GTMaterial.Builder("neodymium_magnetic")
                .states("ingot") // ()
                .color(0x646464) // .iconSet(MAGNETIC)
                // .flags(GENERATE_ROD, IS_MAGNETIC)
                .components(Neodymium, 1)
                .ingotSmeltInto(Neodymium)
                .arcSmeltInto(Neodymium)
                .macerateInto(Neodymium)
                .build();
        Neodymium.getProperty(PropertyKey.INGOT).setMagneticMaterial(NeodymiumMagnetic);

        new GTMaterial.Builder("hydrochloric_acid")
                .states("fluid")(FluidTypes.ACID)
                .components(H, 1, Chlorine, 1)
                .build();

        new GTMaterial.Builder("steam")
                .states("fluid")(FluidTypes.GAS, true)
                // .flags(DISABLE_DECOMPOSITION)
                .components(H, 2, O.x(1))
                // .fluidTemp(373)
                .build();

        new GTMaterial.Builder("distilled_water")
                .states("fluid")()
                .color(0x4A94FF)
                // .flags(DISABLE_DECOMPOSITION)
                .components(H, 2, O.x(1))
                .build();

        new GTMaterial.Builder("sodium_potassium")
                .states("fluid")()
                .color(0x64FCB4)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Na, 1, Potassium, 1)
                .build();

        new GTMaterial.Builder("samarium_magnetic")
                .states("ingot") // ()
                .color(0xFFFFCD) // .iconSet(MAGNETIC)
                // .flags(GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(Samarium, 1)
                .ingotSmeltInto(Samarium)
                .arcSmeltInto(Samarium)
                .macerateInto(Samarium)
                .build();
        Samarium.getProperty(PropertyKey.INGOT).setMagneticMaterial(SamariumMagnetic);

        new GTMaterial.Builder("manganese_phosphide")
                .states("ingot") // ().fluid()
                .color(0xE1B454) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Manganese, 1, Phosphorus, 1)
                // .cableProperties(GTValues.V[GTValues.LV], 2, 0, true, 78)
                // .blastTemp(1200, GasTier.LOW)
                // .fluidTemp(1368)
                .build();

        new GTMaterial.Builder("magnesium_diboride")
                .states("ingot") // ().fluid()
                .color(0x331900) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Mg, 1, Boron, 2)
                // .cableProperties(GTValues.V[GTValues.MV], 4, 0, true, 78)
                // .blastTemp(2500, GasTier.LOW, VA[HV], 1000)
                // .fluidTemp(1103)
                .build();

        new GTMaterial.Builder("mercury_barium_calcium_cuprate")
                .states("ingot") // ().fluid()
                .color(0x555555) // .iconSet(SHINY)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Hg, 1, Barium, 2, Ca2, Cu, 3, O.x(8))
                // .cableProperties(GTValues.V[GTValues.HV], 4, 0, true, 78)
                // .blastTemp(3300, GasTier.LOW, VA[HV], 1500)
                // .fluidTemp(1075)
                .build();

        new GTMaterial.Builder("uranium_triplatinum")
                .states("ingot") // ().fluid()
                .color(0x008700) // .iconSet(SHINY)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Uranium238, 1, Pt, 3)
                // .cableProperties(GTValues.V[GTValues.EV], 6, 0, true, 30)
                // .blastTemp(4400, GasTier.MID, VA[EV], 1000)
                // .fluidTemp(1882)
                .build()
                .setFormula("UPt3", true);

        new GTMaterial.Builder("samarium_iron_arsenic_oxide")
                .states("ingot") // ().fluid()
                .color(0x330033) // .iconSet(SHINY)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components(Samarium, 1, Fe, 1, As, 1, O.x(1))
                // .cableProperties(GTValues.V[GTValues.IV], 6, 0, true, 30)
                // .blastTemp(5200, GasTier.MID, VA[EV], 1500)
                // .fluidTemp(1347)
                .build();

        new GTMaterial.Builder("indium_tin_barium_titanium_cuprate")
                .states("ingot") // ().fluid()
                .color(0x994C00) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_FINE_WIRE)
                .components(Indium, 4, Sn, 2, Barium, 2, Ti, 1, Cu, 7, O.x(14))
                // .cableProperties(GTValues.V[GTValues.LuV], 8, 0, true, 5)
                // .blastTemp(6000, GasTier.HIGH, VA[IV], 1000)
                // .fluidTemp(1012)
                .build();

        new GTMaterial.Builder("uranium_rhodium_dinaquadide")
                .states("ingot") // ().fluid()
                .color(0x0A0A0A)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(Uranium238, 1, Rhodium, 1, Naquadah, 2)
                // .cableProperties(GTValues.V[GTValues.ZPM], 8, 0, true, 5)
                // .blastTemp(9000, GasTier.HIGH, VA[IV], 1500)
                // .fluidTemp(3410)
                .build()
                .setFormula("URhNq2", true);

        new GTMaterial.Builder("enriched_naquadah_trinium_europium_duranide")
                .states("ingot") // ().fluid()
                .color(0x7D9673) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .components(NaquadahEnriched, 4, Trinium, 3, Europium, 2, Duranium, 1)
                // .cableProperties(GTValues.V[GTValues.UV], 16, 0, true, 3)
                // .blastTemp(9900, GasTier.HIGH, VA[LuV], 1000)
                // .fluidTemp(5930)
                .build();

        new GTMaterial.Builder("ruthenium_trinium_americium_neutronate")
                .states("ingot") // ().fluid()
                .color(0xFFFFFF) // .iconSet(BRIGHT)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Ruthenium, 1, Trinium, 2, Americium, 1, Neutronium, 2, O.x(8))
                // .cableProperties(GTValues.V[GTValues.UHV], 24, 0, true, 3)
                // .blastTemp(10800, GasTier.HIGHER)
                // .fluidTemp(23691)
                .build();

        new GTMaterial.Builder("inert_metal_mixture")
                .states("dust") // ()
                .color(0xE2AE72) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Rhodium, 1, Ruthenium, 1, O.x(4))
                .build();

        new GTMaterial.Builder("rhodium_sulfate")
                .states("fluid")()
                .color(0xEEAA55)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Rhodium, 2, S, 3, O.x(12))
                // .fluidTemp(1128)
                .build().setFormula("Rh2(SO4)3", true);

        new GTMaterial.Builder("ruthenium_tetroxide")
                .states("dust") // ()
                .color(0xC7C7C7)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Ruthenium, 1, O.x(4))
                .build();

        new GTMaterial.Builder("osmium_tetroxide")
                .states("dust") // ()
                .color(0xACAD71) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Osmium, 1, O.x(4))
                .build();

        new GTMaterial.Builder("iridium_chloride")
                .states("dust") // ()
                .color(0x013220) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Iridium, 1, Chlorine, 3)
                .build();

        new GTMaterial.Builder("fluoroantimonic_acid")
                .states("fluid")(FluidTypes.ACID)
                .components(H, 2, Sb, 1, F, 7)
                .build();

        new GTMaterial.Builder("titanium_trifluoride")
                .states("dust") // ()
                .color(0x8F00FF) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Ti, 1, F, 3)
                .build();

        new GTMaterial.Builder("calcium_phosphide")
                .states("dust") // ()
                .color(0xA52A2A) // .iconSet(METALLIC)
                .components(Ca1, Phosphorus, 1)
                .build();

        new GTMaterial.Builder("indium_phosphide")
                .states("dust") // ()
                .color(0x582E5C) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Indium, 1, Phosphorus, 1)
                .build();

        new GTMaterial.Builder("barium_sulfide")
                .states("dust") // ()
                .color(0xF0EAD6) // .iconSet(METALLIC)
                .components(Barium, 1, S, 1)
                .build();

        new GTMaterial.Builder("trinium_sulfide")
                .states("dust") // ()
                .color(0xE68066) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Trinium, 1, S, 1)
                .build();

        new GTMaterial.Builder("zinc_sulfide")
                .states("dust") // ()
                .color(0xFFFFF6) // .iconSet(DULL)
                .components(Zn, 1, S, 1)
                .build();

        new GTMaterial.Builder("gallium_sulfide")
                .states("dust") // ()
                .color(0xFFF59E) // .iconSet(SHINY)
                .components(Gallium, 1, S, 1)
                .build();

        new GTMaterial.Builder("antimony_trifluoride")
                .states("dust") // ()
                .color(0xF7EABC) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Sb, 1, F, 3)
                .build();

        new GTMaterial.Builder("enriched_naquadah_sulfate")
                .states("dust") // ()
                .color(0x2E2E1C) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components(NaquadahEnriched, 1, S, 1, O.x(4))
                .build();

        new GTMaterial.Builder("naquadria_sulfate")
                .states("dust") // ()
                .color(0x006633) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Naquadria, 1, S, 1, O.x(4))
                .build();

        new GTMaterial.Builder("pyrochlore")
                .states("dust") // ().ore()
                .color(0x2B1100) // .iconSet(METALLIC)
                // .flags()
                .components(Ca2, Niobium, 2, O.x(7))
                .build();

        new GTMaterial.Builder("liquid_helium")
                .states("fluid")()
                .color(0xFCFF90)
                // .flags(DISABLE_DECOMPOSITION)
                .components(Helium, 1)
                // .fluidTemp(4)
                .build();
    }
}
