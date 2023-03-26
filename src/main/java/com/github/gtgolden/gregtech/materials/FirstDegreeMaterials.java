package com.github.gtgolden.gregtech.materials;


import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import net.fabricmc.loader.impl.FormattedException;

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
                .states("dust", "ore") // ()()
                .color(0x1E1E1E) // .iconSet(METALLIC)
                .components("Fe3O4")
                .build();

        new GTMaterial.Builder("molybdenite")
                .states("dust", "ore") // ()()
                .color(0x191919) // .iconSet(METALLIC)
                .components("MoS2")
                .build();

        new GTMaterial.Builder("nichrome")
                .states("ingot", "fluid") // ()()
                .color(0xCDCEF6) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_SPRING)
                .components("Ni4Cr")
                // .cableProperties(GTValues.V[4], 4, 4)
                // .blastTemp(2700, GasTier.LOW, VA[HV], 1300)
                // .fluidTemp(1818)
                .build();

        new GTMaterial.Builder("niobium_nitride")
                .states("ingot", "fluid") // ()()
                .color(0x1D291D)
                // .flags(EXT_METAL, GENERATE_FOIL)
                .components("NbN")
                // .cableProperties(GTValues.V[6], 1, 1)
                // .blastTemp(2846, GasTier.MID)
                .build();

        new GTMaterial.Builder("niobium_titanium")
                .states("ingot", "fluid") // ()()
                .color(0x1D1D29)
                // .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .components("NbTi")
                // .fluidPipeProperties(5900, 175, true)
                // .cableProperties(GTValues.V[6], 4, 2)
                // .blastTemp(4500, GasTier.HIGH, VA[HV], 1500)
                // .fluidTemp(2345)
                .build();

        new GTMaterial.Builder("obsidian")
                .states("dust") // (3)
                .color(0x503264)
                // .flags(NO_SMASHING, EXCLUDE_BLOCK_CRAFTING_RECIPES, GENERATE_PLATE)
                .components("MgFeSi2O4")
                .build();

        new GTMaterial.Builder("phosphate")
                .states("dust") // (1)
                .color(0xFFFF00)
                // .flags(NO_SMASHING, NO_SMELTING, FLAMMABLE, EXPLOSIVE)
                .components("PO4")
                .build();

        new GTMaterial.Builder("platinum_raw")
                .states("dust") // ()
                .color(0xFFFFC8) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components("PtCl2")
                .build();

        new GTMaterial.Builder("sterling_silver")
                .states("ingot", "fluid") // ()()
                .color(0xFADCE1) // .iconSet(SHINY)
                // .flags(EXT2_METAL)
                .components("CuAg4")
                .toolProperty(2, 768, 3.0F, 8)
//                        .attackSpeed(0.3F).enchantability(33)
//                        .enchantment(Enchantments.SMITE, 3).build())
                // .rotorStats(13.0f, 2.0f, 196)
                // .itemPipeProperties(1024, 2)
                // .blastTemp(1700, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1258)
                .build();

        new GTMaterial.Builder("rose_gold")
                .states("ingot", "fluid") // ()()
                .color(0xFFE61E) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_RING)
                .components("CuAu4")
                .toolProperty(2, 768, 12.0F, 2)
//                        .enchantability(33)
//                        .enchantment(Enchantments.FORTUNE, 2).build())
                // .rotorStats(14.0f, 2.0f, 152)
                // .itemPipeProperties(1024, 2)
                // .blastTemp(1600, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1341)
                .build();

        new GTMaterial.Builder("black_bronze")
                .states("ingot", "fluid") // ()()
                .color(0x64327D)
                // .flags(EXT2_METAL, GENERATE_GEAR)
                .components("AuAgCu3")
                // .rotorStats(12.0f, 2.0f, 256)
                // .itemPipeProperties(1024, 2)
                // .blastTemp(2000, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1328)
                .build();

        new GTMaterial.Builder("bismuth_bronze")
                .states("ingot", "fluid") // ()()
                .color(0x647D7D)
                // .flags(EXT2_METAL)
                .components("BiZnCu3")
                // .rotorStats(8.0f, 3.0f, 256)
                // .blastTemp(1100, GasTier.LOW, VA[MV], 1000)
                // .fluidTemp(1036)
                .build();

        new GTMaterial.Builder("biotite")
                .states("dust") // (1)
                .color(0x141E14) // .iconSet(METALLIC)
                .components("KMg3Al3F2Si3O10")
                .build();

        new GTMaterial.Builder("powellite")
                .states("dust", "ore") // ()()
                .color(0xFFFF00)
                .components("CaMoO4")
                .build();

        new GTMaterial.Builder("pyrite")
                .states("dust", "ore") // (1)()
                .color(0x967828) // .iconSet(ROUGH)
                // .flags(BLAST_FURNACE_CALCITE_DOUBLE)
                .components("FeS2")
                .build();

        new GTMaterial.Builder("pyrolusite")
                .states("dust", "ore") // ()()
                .color(0x9696AA)
                .components("MnO2")
                .build();

        new GTMaterial.Builder("pyrope")
                .states("gem", "ore") // ()(3, 1)
                .color(0x783264) // .iconSet(RUBY)
                .components("Al2Mg3Si3O12")
                .build();

        new GTMaterial.Builder("rock_salt")
                .states("gem", "ore") // (1)(2, 1)
                .color(0xF0C8C8) // .iconSet(FINE)
                // .flags(NO_SMASHING)
                .components("KCl")
                .build();

        new GTMaterial.Builder("ruridit")
                .states("ingot") // (3)
                // .colorAverage() // .iconSet(BRIGHT)
                // .flags(GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_LONG_ROD)
                .components("Ru2Ir")
                // .blastTemp(4500, GasTier.HIGH, VA[EV], 1600)
                .build();

        new GTMaterial.Builder("ruby")
                .states("gem", "ore") // ()()
                .color(0xFF6464) // .iconSet(RUBY)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT, GENERATE_LENS)
                .components("CrAl2O3")
                .build();

        new GTMaterial.Builder("salt")
                .states("gem", "ore") // (1)(2, 1)
                .color(0xFAFAFA) // .iconSet(FINE)
                // .flags(NO_SMASHING)
                .components("NaCl")
                .build();

        new GTMaterial.Builder("saltpeter")
                .states("dust", "ore") // (1)(2, 1)
                .color(0xE6E6E6) // .iconSet(FINE)
                // .flags(NO_SMASHING, NO_SMELTING, FLAMMABLE)
                .components("KNO3")
                .build();

        new GTMaterial.Builder("sapphire")
                .states("gem", "ore") // ()()
                .color(0x6464C8) // .iconSet(GEM_VERTICAL)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT, GENERATE_LENS)
                .components("Al2O3")
                .build();

        new GTMaterial.Builder("scheelite")
                .states("dust", "ore") // (3)()
                .color(0xC88C14)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(Ca.x(1), W.x(1), O.x(4))
                .setFormula("Ca(WO3)O")
                .build();

        new GTMaterial.Builder("sodalite")
                .states("gem", "ore") // (1)(6, 4)
                .color(0x1414FF) // .iconSet(LAPIS)
                // .flags(GENERATE_PLATE, GENERATE_ROD, NO_SMASHING, NO_SMELTING, CRYSTALLIZABLE, DECOMPOSITION_BY_ELECTROLYZING)
                .components("Al3Si3Na4Cl")
                .build();

        new GTMaterial.Builder("aluminium_sulfite")
                .states("dust") // ()
                .color(0xCC4BBB) // .iconSet(DULL)
                .setComponents(Al.x(2), S.x(3), O.x(9))
                .setFormula("Al2(SO3)3")
                .build();

        new GTMaterial.Builder("tantalite")
                .states("dust", "ore") // (3)()
                .color(0x915028) // .iconSet(METALLIC)
                .components("MnTa2O6")
                .build();

        new GTMaterial.Builder("coke")
                .states("gem") // (2, 3200) // 2x burn time of coal
                .color(0x666666) // .iconSet(LIGNITE)
                // .flags(FLAMMABLE, NO_SMELTING, NO_SMASHING, MORTAR_GRINDABLE)
                .components("C")
                .build();

        new GTMaterial.Builder("soldering_alloy")
                .states("ingot", "fluid") // (1)()
                .color(0x9696A0)
                .components("Sn6Pb3Sb")
                // .fluidTemp(544)
                .build();

        new GTMaterial.Builder("spessartine")
                .states("gem", "ore") // ()(3, 1)
                .color(0xFF6464) // .iconSet(RUBY)
                .components("Al2Mn3Si3O12")
                .build();

        new GTMaterial.Builder("sphalerite")
                .states("dust", "ore") // (1)()
                .color(0xFFFFFF)
                // .flags(DISABLE_DECOMPOSITION)
                .components("ZnS")
                .build();

        new GTMaterial.Builder("stainless_steel")
                .states("ingot", "fluid") // (3)()
                .color(0xC8C8DC) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_GEAR)
                .components("Fe6CrMnNi")
                .toolProperty(3, 1024, 7.0F, 5)
//                        .enchantability(14).build())
                // .rotorStats(7.0f, 4.0f, 480)
                // .fluidPipeProperties(2428, 75, true, true, true, false)
                // .blastTemp(1700, GasTier.LOW, VA[HV], 1100)
                // .fluidTemp(2011)
                .build();

        new GTMaterial.Builder("steel")
                .states("ingot", "fluid") // (3)()
                .color(0x808080) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_SPRING,
//                        GENERATE_SPRING_SMALL, GENERATE_FRAME, DISABLE_DECOMPOSITION, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .components("Fe")
                .toolProperty(3, 512, 5.0F, 3)
//                        .enchantability(14).build())
                // .rotorStats(6.0f, 3.0f, 512)
                // .fluidPipeProperties(1855, 75, true)
                // .cableProperties(GTValues.V[4], 2, 2)
                // .blastTemp(1000, null, VA[MV], 800) // no gas tier for steel
                // .fluidTemp(2046)
                .build();

        new GTMaterial.Builder("stibnite")
                .states("dust", "ore") // ()()
                .color(0x464646) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components("Sb2S3")
                .build();

        // Free ID 326

        new GTMaterial.Builder("tetrahedrite")
                .states("dust", "ore") // ()()
                .color(0xC82000)
                .components("Cu3SbS3Fe")
                .build();

        new GTMaterial.Builder("tin_alloy")
                .states("ingot", "fluid") // ()()
                .color(0xC8C8C8) // .iconSet(METALLIC)
                // .flags(EXT2_METAL)
                .components("SnFe")
                // .fluidPipeProperties(1572, 20, true)
                // .fluidTemp(1258)
                .build();

        new GTMaterial.Builder("topaz")
                .states("gem", "ore") // (3)()
                .color(0xFF8000) // .iconSet(GEM_HORIZONTAL)
                // .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components("Al2SiFH2")
                .build();

        new GTMaterial.Builder("tungstate")
                .states("dust", "ore") // (3)()
                .color(0x373223)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(Li.x(2), W.x(1), O.x(4))
                .setFormula("Li2(WO3)O")
                .build();

        new GTMaterial.Builder("ultimet")
                .states("ingot", "fluid") // (4)()
                .color(0xB4B4E6) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_GEAR)
                .components("Co5Cr2NiMo")
                .toolProperty(4, 2048, 10.0F, 7)
//                        .attackSpeed(0.1F).enchantability(21).build())
                // .rotorStats(9.0f, 4.0f, 2048)
                // .itemPipeProperties(128, 16)
                // .blastTemp(2700, GasTier.MID, VA[HV], 1300)
                // .fluidTemp(1980)
                .build();

        new GTMaterial.Builder("uraninite")
                .states("dust", "ore") // (3)(true)
                .color(0x232323) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(U238.x(1), O.x(2))
                .setFormula("UO2")
                .build();

        new GTMaterial.Builder("uvarovite")
                .states("gem") // ()
                .color(0xB4ffB4) // .iconSet(RUBY)
                .components("Ca3Cr2Si3O12")
                .build();

        new GTMaterial.Builder("vanadium_gallium")
                .states("ingot", "fluid") // ()()
                .color(0x80808C) // .iconSet(SHINY)
                // .flags(STD_METAL, GENERATE_FOIL, GENERATE_SPRING, GENERATE_SPRING_SMALL)
                .components("V3Ga")
                // .cableProperties(GTValues.V[7], 4, 2)
                // .blastTemp(4500, GasTier.HIGH, VA[EV], 1200)
                // .fluidTemp(1712)
                .build();

        new GTMaterial.Builder("wrought_iron")
                .states("ingot", "fluid") // ()()
                .color(0xC8B4B4) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_GEAR, GENERATE_FOIL, MORTAR_GRINDABLE, GENERATE_RING, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, DISABLE_DECOMPOSITION, BLAST_FURNACE_CALCITE_TRIPLE)
                .components("Fe")
                .toolProperty(2, 384, 2.0F, 2)
//                        .attackSpeed(-0.2F).enchantability(5).build())
                // .rotorStats(6.0f, 3.5f, 384)
                // .fluidTemp(2011)
                .build();
//        Fe.getProperty(PropertyKey.INGOT).setSmeltingInto(WroughtIron); // todo set smelting into
//        Fe.getProperty(PropertyKey.INGOT).setArcSmeltingInto(WroughtIron);

        new GTMaterial.Builder("wulfenite")
                .states("dust", "ore") // (3)()
                .color(0xFF8000)
                .components("PbMoO4")
                .build();

        new GTMaterial.Builder("yellow_limonite")
                .states("dust", "ore") // ()()
                .color(0xC8C800) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, BLAST_FURNACE_CALCITE_DOUBLE)
                .components("FeHO2")
                .build();

        new GTMaterial.Builder("yttrium_barium_cuprate")
                .states("ingot", "fluid") // ()()
                .color(0x504046) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_FINE_WIRE, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .components("YBa2Cu3O7")
                // .cableProperties(GTValues.V[8], 4, 4)
                // .blastTemp(4500, GasTier.HIGH) // todo redo this EBF process
                // .fluidTemp(1799)
                .build();

        new GTMaterial.Builder("nether_quartz")
                .states("gem", "ore") // (1)(2, 1)
                .color(0xE6D2D2) // .iconSet(QUARTZ)
                // .flags(GENERATE_PLATE, NO_SMELTING, CRYSTALLIZABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, DISABLE_DECOMPOSITION)
                .components("SiO2")
                .build();

        new GTMaterial.Builder("certus_quartz")
                .states("gem", "ore") // (1)(2, 1)
                .color(0xD2D2E6) // .iconSet(CERTUS)
                // .flags(GENERATE_PLATE, NO_SMELTING, CRYSTALLIZABLE, DISABLE_DECOMPOSITION)
                .components("SiO2")
                .build();

        new GTMaterial.Builder("quartzite")
                .states("gem", "ore") // (1)(2, 1)
                .color(0xD2E6D2) // .iconSet(QUARTZ)
                // .flags(NO_SMELTING, CRYSTALLIZABLE, DISABLE_DECOMPOSITION, GENERATE_PLATE)
                .components("SiO2")
                .build();

        new GTMaterial.Builder("graphite")
                .states("ore") // ()
                .color(0x808080)
                // .flags(NO_SMELTING, FLAMMABLE, DISABLE_DECOMPOSITION)
                .components("C")
                .build();

        new GTMaterial.Builder("graphene")
                .states("dust") // ()
                .color(0x808080) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C")
                // .cableProperties(GTValues.V[5], 1, 1)
                .build();

        new GTMaterial.Builder("tungstic_acid")
                .states("dust") // ()
                .color(0xBCC800) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components("H2WO4")
                .build();

        new GTMaterial.Builder("osmiridium")
                .states("ingot", "fluid") // (3)()
                .color(0x6464FF) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .components("Ir3Os")
                // .rotorStats(9.0f, 3.0f, 3152)
                // .itemPipeProperties(64, 32)
                // .blastTemp(4500, GasTier.HIGH, VA[LuV], 900)
                // .fluidTemp(3012)
                .build();

        new GTMaterial.Builder("lithium_chloride")
                .states("dust") // ()
                .color(0xDEDEFA) // .iconSet(FINE)
                .components("LiCl")
                .build();

        new GTMaterial.Builder("calcium_chloride")
                .states("dust") // ()
                .color(0xEBEBFA) // .iconSet(FINE)
                .components("CaCl2")
                .build();

        new GTMaterial.Builder("bornite")
                .states("dust", "ore") // (1)()
                .color(0x97662B) // .iconSet(METALLIC)
                .components("Cu5FeS4")
                .build();

        new GTMaterial.Builder("chalcocite")
                .states("dust", "ore") // ()()
                .color(0x353535) // .iconSet(GEM_VERTICAL)
                .components("Cu2S")
                .build();

        // Free ID 349

        // Free ID 350

        // Rip gtceu's code, no id's now lol

        new GTMaterial.Builder("gallium_arsenide")
                .states("ingot", "fluid") // (1)()
                .color(0xA0A0A0)
                // .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components("AsGa")
                // .blastTemp(1200, GasTier.LOW, VA[MV], 1200)
                // .fluidTemp(1511)
                .build();

        new GTMaterial.Builder("potash")
                .states("dust") // (1)
                .color(0x784137)
                .components("K2O")
                .build();

        new GTMaterial.Builder("soda_ash")
                .states("dust") // (1)
                .color(0xDCDCFF)
                .components("Na2CO3")
                .build();

        new GTMaterial.Builder("indium_gallium_phosphide")
                .states("ingot", "fluid") // (1)()
                .color(0xA08CBE)
                // .flags(STD_METAL, DECOMPOSITION_BY_CENTRIFUGING)
                .components("InGaP")
                // .fluidTemp(350)
                .build();

        new GTMaterial.Builder("nickel_zinc_ferrite")
                .states("ingot", "fluid") // (0)()
                .color(0x3C3C3C) // .iconSet(METALLIC)
                // .flags(GENERATE_RING)
                .components("NiZnFe4O8")
                // .fluidTemp(1410)
                .build();

        new GTMaterial.Builder("silicon_dioxide")
                .states("dust") // (1)
                .color(0xC8C8C8) // .iconSet(QUARTZ)
                // .flags(NO_SMASHING, NO_SMELTING)
                .components("SiO2")
                .build();

        new GTMaterial.Builder("magnesium_chloride")
                .states("dust") // (1)
                .color(0xD40D5C)
                .components("MgCl2")
                .build();

        new GTMaterial.Builder("sodium_sulfide")
                .states("dust") // (1)
                .color(0xFFE680)
                .components("Na2S")
                .build();

        new GTMaterial.Builder("phosphorus_pentoxide")
                .states("dust") // (1)
                .color(0xDCDC00)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components("P4O10")
                .build();

        new GTMaterial.Builder("quicklime")
                .states("dust") // (1)
                .color(0xF0F0F0)
                .components("CaO")
                .build();

        new GTMaterial.Builder("sodium_bisulfate")
                .states("dust") // (1)
                .color(0x004455)
                // .flags(DISABLE_DECOMPOSITION)
                .components("NaHSO4")
                .build();

        new GTMaterial.Builder("ferrite_mixture")
                .states("dust") // (1)
                .color(0xB4B4B4) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components("NiZnFe4")
                .build();

        new GTMaterial.Builder("magnesia")
                .states("dust") // (1)
                .color(0x887878)
                .components("MgO")
                .build();

        new GTMaterial.Builder("platinum_group_sludge")
                .states("dust") // (1)
                .color(0x001E00) // .iconSet(FINE)
                // .flags(DISABLE_DECOMPOSITION)
                .build();

        new GTMaterial.Builder("realgar")
                .states("gem", "ore") // ()()
                .color(0x9D2123) // .iconSet(EMERALD)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components("As4S4")
                .build();

        new GTMaterial.Builder("sodium_bicarbonate")
                .states("dust") // (1)
                .color(0x565b96) // .iconSet(ROUGH)
                .components("NaHCO3")
                .build();

        new GTMaterial.Builder("potassium_dichromate")
                .states("dust") // (1)
                .color(0xFF084E)
                .components("K2Cr2O7")
                .build();

        new GTMaterial.Builder("chromium_trioxide")
                .states("dust") // (1)
                .color(0xFFE4E1)
                .components("CrO3")
                .build();

        new GTMaterial.Builder("antimony_trioxide")
                .states("dust") // (1)
                .color(0xE6E6F0)
                .components("Sb2O3")
                .build();

        new GTMaterial.Builder("zincite")
                .states("dust") // (1)
                .color(0xFFFFF5)
                .components("ZnO")
                .build();

        new GTMaterial.Builder("cupric_oxide")
                .states("dust") // (1)
                .color(0x0F0F0F)
                .components("CuO")
                .build();

        new GTMaterial.Builder("cobalt_oxide")
                .states("dust") // (1)
                .color(0x788000)
                .components("CoO")
                .build();

        new GTMaterial.Builder("arsenic_trioxide")
                .states("dust") // (1)
                 // .iconSet(ROUGH)
                .components("As2O3")
                .build();

        new GTMaterial.Builder("massicot")
                .states("dust") // (1)
                .color(0xFFDD55)
                .components("PbO")
                .build();

        new GTMaterial.Builder("ferrosilite")
                .states("dust") // (1)
                .color(0x97632A)
                .components("FeSiO3")
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
                .components("NaOH")
                .build();

        new GTMaterial.Builder("sodium_persulfate")
                .states("fluid") // ()
                .components("Na2S2O8")
                .build();

        new GTMaterial.Builder("bastnasite")
                .states("dust", "ore") // ()(2, 1)
                .color(0xC86E2D) // .iconSet(FINE)
                .components("CeCFO3")
                .build();

        new GTMaterial.Builder("pentlandite")
                .states("dust", "ore") // ()()
                .color(0xA59605)
                .components("Ni9S8")
                .build();

        new GTMaterial.Builder("spodumene")
                .states("dust", "ore") // ()()
                .color(0xBEAAAA)
                .components("LiAlSi2O6")
                .build();

        new GTMaterial.Builder("lepidolite")
                .states("dust", "ore") // ()(2, 1)
                .color(0xF0328C) // .iconSet(FINE)
                .components("KLi3Al4F2O10")
                .build();

        // Free ID 383

        new GTMaterial.Builder("glauconite_sand")
                .states("dust", "ore") // ()(3, 1)
                .color(0x82B43C) // .iconSet(SAND)
                .components("KMg2Al4H2O12")
                .build();

        new GTMaterial.Builder("malachite")
                .states("gem", "ore") // ()()
                .color(0x055F05) // .iconSet(LAPIS)
                .components("Cu2CH2O5")
                .build();

        new GTMaterial.Builder("mica")
                .states("dust", "ore") // ()(2, 1)
                .color(0xC3C3CD) // .iconSet(FINE)
                .components("KAl3Si3F2O10")
                .build();

        new GTMaterial.Builder("barite")
                .states("dust", "ore") // ()()
                .color(0xE6EBEB)
                .components("BaSO4")
                .build();

        new GTMaterial.Builder("alunite")
                .states("dust", "ore") // ()(3, 1)
                .color(0xE1B441) // .iconSet(METALLIC)
                .components("KAl3Si2H6O14")
                .build();

        // Free ID 389

        // Free ID 390

        // Free ID 391

        // No id's lol

        new GTMaterial.Builder("talc")
                .states("dust", "ore") // ()(2, 1)
                .color(0x5AB45A) // .iconSet(FINE)
                .components("Mg3Si4H2O12")
                .build();

        new GTMaterial.Builder("soapstone")
                .states("dust", "ore") // (1)(3, 1)
                .color(0x5F915F)
                .components("Mg3Si4H2O12")
                .build();

        new GTMaterial.Builder("kyanite")
                .states("dust", "ore") // ()()
                .color(0x6E6EFA) // .iconSet(FLINT)
                .components("Al2SiO5")
                .build();

        new GTMaterial.Builder("iron_magnetic")
                .states("ingot") // ()
                .color(0xC8C8C8) // .iconSet(MAGNETIC)
                // .flags(GENERATE_BOLT_SCREW, IS_MAGNETIC)
                .components("Fe")
//                .ingotSmeltInto(Iron) todo smelts into Materials.get("smth").as("some").x((int)amt)
//                .arcSmeltInto(WroughtIron) todo same as above
//                .macerateInto(Fe) todo maserate same sa above
                .build();
//        Iron.getProperty(PropertyKey.INGOT).setMagneticMaterial(IronMagnetic); // todo magnetic? todo chemk how this works

        new GTMaterial.Builder("tungsten_carbide")
                .states("ingot", "fluid") // (4)()
                .color(0x330066) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_GEAR, DECOMPOSITION_BY_CENTRIFUGING)
                .components("WC")
                .toolProperty(4, 1024, 60.0F, 2)
//                        .enchantability(21).build())
                // .rotorStats(12.0f, 4.0f, 1280)
                // .fluidPipeProperties(3837, 200, true)
                // .blastTemp(3058, GasTier.MID, VA[HV], 1500)
                .build();

        new GTMaterial.Builder("carbon_dioxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0xA9D0F5)
                .components("CO2")
                .build();

        new GTMaterial.Builder("titanium_tetrachloride")
                .states("fluid") // ()
                .color(0xD40D5C)
                // .flags(DISABLE_DECOMPOSITION)
                .components("TiCl4")
                .build();

        new GTMaterial.Builder("nitrogen_dioxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x85FCFF) // .iconSet(GAS)
                .components("NO2")
                .build();

        new GTMaterial.Builder("hydrogen_sulfide")
                .states("fluid") // (FluidTypes.GAS)
                .components("H2S")
                .build();

        new GTMaterial.Builder("nitric_acid")
                .states("fluid") // (FluidTypes.ACID)
                .color(0xCCCC00)
                // .flags(DISABLE_DECOMPOSITION)
                .components("HNO3")
                .build();

        new GTMaterial.Builder("sulfuric_acid")
                .states("fluid") // (FluidTypes.ACID)
                // .flags(DISABLE_DECOMPOSITION)
                .components("H2SO4")
                .build();

        new GTMaterial.Builder("phosphoric_acid")
                .states("fluid") // (FluidTypes.ACID)
                .color(0xDCDC01)
                // .flags(DISABLE_DECOMPOSITION)
                .components("H3PO4")
                .build();

        new GTMaterial.Builder("sulfur_trioxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0xA0A014)
                .components("SO3")
                .build();

        new GTMaterial.Builder("sulfur_dioxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0xC8C819)
                .components("SO2")
                .build();

        new GTMaterial.Builder("carbon_monoxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x0E4880)
                .components("CO")
                .build();

        new GTMaterial.Builder("hypochlorous_acid")
                .states("fluid") // (FluidTypes.ACID)
                .color(0x6F8A91)
                .components("HClO")
                .build();

        new GTMaterial.Builder("ammonia")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x3F3480)
                .components("NH3")
                .build();

        new GTMaterial.Builder("hydrofluoric_acid")
                .states("fluid") // (FluidTypes.ACID)
                .color(0x0088AA)
                .components("HF")
                .build();

        new GTMaterial.Builder("nitric_oxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x7DC8F0)
                .components("NO")
                .build();

        new GTMaterial.Builder("iron_iii_chloride")
                .states("fluid") // ()
                .color(0x060B0B)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components("FeCl3")
                .build();

        new GTMaterial.Builder("uranium_hexafluoride")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x42D126)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(U238.x(1), F.x(6))
                .setFormula("UF6")
                .build();

        new GTMaterial.Builder("enriched_uranium_hexafluoride")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x4BF52A)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(U235.x(1), F.x(6))
                .setFormula("UF6")
                .build();

        new GTMaterial.Builder("depleted_uranium_hexafluoride")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x74BA66)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(U238.x(1), F.x(6))
                .setFormula("UF6")
                .build();

        new GTMaterial.Builder("nitrous_oxide")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x7DC8FF)
                .components("N2O")
                .build();

        new GTMaterial.Builder("ender_pearl")
                .states("gem") // (1)
                .color(0x6CDCC8)
                // .flags(NO_SMASHING, NO_SMELTING, GENERATE_PLATE)
                .components("BeK4N5")
                .build();

        new GTMaterial.Builder("potassium_feldspar")
                .states("dust") // (1)
                .color(0x782828) // .iconSet(FINE)
                .components("KAlSiO8")
                .build();

        new GTMaterial.Builder("neodymium_magnetic")
                .states("ingot") // ()
                .color(0x646464) // .iconSet(MAGNETIC)
                // .flags(GENERATE_ROD, IS_MAGNETIC)
                .components("Nd")
//                .ingotSmeltInto(Nd)
//                .arcSmeltInto(Nd)
//                .macerateInto(Nd)
                .build();
//        Nd.getProperty(PropertyKey.INGOT).setMagneticMaterial(NdMagnetic);

        new GTMaterial.Builder("hydrochloric_acid")
                .states("fluid") // (FluidTypes.ACID)
                .components("HCl")
                .build();

        new GTMaterial.Builder("steam")
                .states("fluid") // (FluidTypes.GAS, true)
                // .flags(DISABLE_DECOMPOSITION)
                .components("H2O")
                // .fluidTemp(373)
                .build();

        new GTMaterial.Builder("distilled_water")
                .states("fluid") // ()
                .color(0x4A94FF)
                // .flags(DISABLE_DECOMPOSITION)
                .components("H2O")
                .build();

        new GTMaterial.Builder("sodium_potassium")
                .states("fluid") // ()
                .color(0x64FCB4)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components("NaK")
                .build();

        new GTMaterial.Builder("samarium_magnetic")
                .states("ingot") // ()
                .color(0xFFFFCD) // .iconSet(MAGNETIC)
                // .flags(GENERATE_LONG_ROD, IS_MAGNETIC)
                .components("Sm")
//                .ingotSmeltInto(Sm)
//                .arcSmeltInto(Sm)
//                .macerateInto(Sm)
                .build();
//        Sm.getProperty(PropertyKey.INGOT).setMagneticMaterial(SmMagnetic);

        new GTMaterial.Builder("manganese_phosphide")
                .states("ingot", "fluid") // ()()
                .color(0xE1B454) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components("MnP")
                // .cableProperties(GTValues.V[GTValues.LV], 2, 0, true, 78)
                // .blastTemp(1200, GasTier.LOW)
                // .fluidTemp(1368)
                .build();

        new GTMaterial.Builder("magnesium_diboride")
                .states("ingot", "fluid") // ()()
                .color(0x331900) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components("MgB2")
                // .cableProperties(GTValues.V[GTValues.MV], 4, 0, true, 78)
                // .blastTemp(2500, GasTier.LOW, VA[HV], 1000)
                // .fluidTemp(1103)
                .build();

        new GTMaterial.Builder("mercury_barium_calcium_cuprate")
                .states("ingot", "fluid") // ()()
                .color(0x555555) // .iconSet(SHINY)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components("HgBa2Ca2Cu3O8")
                // .cableProperties(GTValues.V[GTValues.HV], 4, 0, true, 78)
                // .blastTemp(3300, GasTier.LOW, VA[HV], 1500)
                // .fluidTemp(1075)
                .build();

        new GTMaterial.Builder("uranium_triplatinum")
                .states("ingot", "fluid") // ()()
                .color(0x008700) // .iconSet(SHINY)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .setComponents(U238.x(1), Pt.x(3))
                .setFormula("UPt3")
                // .cableProperties(GTValues.V[GTValues.EV], 6, 0, true, 30)
                // .blastTemp(4400, GasTier.MID, VA[EV], 1000)
                // .fluidTemp(1882)
                .build();

        new GTMaterial.Builder("samarium_iron_arsenic_oxide")
                .states("ingot", "fluid") // ()()
                .color(0x330033) // .iconSet(SHINY)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING)
                .components("SmFeAsO")
                // .cableProperties(GTValues.V[GTValues.IV], 6, 0, true, 30)
                // .blastTemp(5200, GasTier.MID, VA[EV], 1500)
                // .fluidTemp(1347)
                .build();

        new GTMaterial.Builder("indium_tin_barium_titanium_cuprate")
                .states("ingot", "fluid") // ()()
                .color(0x994C00) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING, GENERATE_FINE_WIRE)
                .components("In4Sn2Ba2TiCu7O14")
                // .cableProperties(GTValues.V[GTValues.LuV], 8, 0, true, 5)
                // .blastTemp(6000, GasTier.HIGH, VA[IV], 1000)
                // .fluidTemp(1012)
                .build();

        new GTMaterial.Builder("uranium_rhodium_dinaquadide")
                .states("ingot", "fluid") // ()()
                .color(0x0A0A0A)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .setComponents(U238.x(1), Rh.x(1), Nq.x(2))
                .setFormula("URhNq2")
                // .cableProperties(GTValues.V[GTValues.ZPM], 8, 0, true, 5)
                // .blastTemp(9000, GasTier.HIGH, VA[IV], 1500)
                // .fluidTemp(3410)
                .build();

        new GTMaterial.Builder("enriched_naquadah_trinium_europium_duranide")
                .states("ingot", "fluid") // ()()
                .color(0x7D9673) // .iconSet(METALLIC)
                // .flags(DECOMPOSITION_BY_CENTRIFUGING, GENERATE_FINE_WIRE)
                .setComponents(Nq1.x(4), Ke.x(3), Eu.x(2), Dr.x(1))
                .setFormula("Nu4Ke3Eu2Dr1")
                // .cableProperties(GTValues.V[GTValues.UV], 16, 0, true, 3)
                // .blastTemp(9900, GasTier.HIGH, VA[LuV], 1000)
                // .fluidTemp(5930)
                .build();

        new GTMaterial.Builder("ruthenium_trinium_americium_neutronate")
                .states("ingot", "fluid") // ()()
                .color(0xFFFFFF) // .iconSet(BRIGHT)
                // .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components("RuKe2AmNt2O8")
                // .cableProperties(GTValues.V[GTValues.UHV], 24, 0, true, 3)
                // .blastTemp(10800, GasTier.HIGHER)
                // .fluidTemp(23691)
                .build();

        new GTMaterial.Builder("inert_metal_mixture")
                .states("dust") // ()
                .color(0xE2AE72) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components("RhRuO4")
                .build();

        new GTMaterial.Builder("rhodium_sulfate")
                .states("fluid") // ()
                .color(0xEEAA55)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(Rh.x(2), S.x(3), O.x(12))
                .setFormula("Rh2(SO4)3")
                // .fluidTemp(1128)
                .build();

        new GTMaterial.Builder("ruthenium_tetroxide")
                .states("dust") // ()
                .color(0xC7C7C7)
                // .flags(DISABLE_DECOMPOSITION)
                .components("RuO4")
                .build();

        new GTMaterial.Builder("osmium_tetroxide")
                .states("dust") // ()
                .color(0xACAD71) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components("OsO4")
                .build();

        new GTMaterial.Builder("iridium_chloride")
                .states("dust") // ()
                .color(0x013220) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components("IrCl3")
                .build();

        new GTMaterial.Builder("fluoroantimonic_acid")
                .states("fluid") // (FluidTypes.ACID)
                .components("H2SbF7")
                .build();

        new GTMaterial.Builder("titanium_trifluoride")
                .states("dust") // ()
                .color(0x8F00FF) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components("TiF3")
                .build();

        new GTMaterial.Builder("calcium_phosphide")
                .states("dust") // ()
                .color(0xA52A2A) // .iconSet(METALLIC)
                .components("CaP")
                .build();

        new GTMaterial.Builder("indium_phosphide")
                .states("dust") // ()
                .color(0x582E5C) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components("InP")
                .build();

        new GTMaterial.Builder("barium_sulfide")
                .states("dust") // ()
                .color(0xF0EAD6) // .iconSet(METALLIC)
                .components("BaS")
                .build();

        new GTMaterial.Builder("trinium_sulfide")
                .states("dust") // ()
                .color(0xE68066) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .components("KeS")
                .build();

        new GTMaterial.Builder("zinc_sulfide")
                .states("dust") // ()
                .color(0xFFFFF6) // .iconSet(DULL)
                .components("ZnS")
                .build();

        new GTMaterial.Builder("gallium_sulfide")
                .states("dust") // ()
                .color(0xFFF59E) // .iconSet(SHINY)
                .components("GaS")
                .build();

        new GTMaterial.Builder("antimony_trifluoride")
                .states("dust") // ()
                .color(0xF7EABC) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .components("SbF3")
                .build();

        new GTMaterial.Builder("enriched_naquadah_sulfate")
                .states("dust") // ()
                .color(0x2E2E1C) // .iconSet(METALLIC)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(Nq1.x(1), S.x(1), O.x(4))
                .setFormula("NuSO4")
                .build();

        new GTMaterial.Builder("naquadria_sulfate")
                .states("dust") // ()
                .color(0x006633) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION)
                .setComponents(Nq2.x(1), S.x(1), O.x(4))
                .setFormula("NrSO4")
                .build();

        new GTMaterial.Builder("pyrochlore")
                .states("dust", "ore") // ()()
                .color(0x2B1100) // .iconSet(METALLIC)
                // .flags()
                .components("Ca2Nb2O7")
                .build();

        new GTMaterial.Builder("liquid_helium")
                .states("fluid") // ()
                .color(0xFCFF90)
                // .flags(DISABLE_DECOMPOSITION)
                .components("He")
                // .fluidTemp(4)
                .build();
    }
}
