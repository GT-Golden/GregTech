package com.github.gtgolden.gregtech.materials;

import com.github.gtgolden.gtgoldencore.material.GTMaterial;

import static com.github.gtgolden.gtgoldencore.material.chemistry.Elements.*;

public class ElementMaterials {

    public static void register() {
        new GTMaterial.Builder("actinium")
                .color(0xC3D1FF) // .iconSet(METALLIC)
                .element(Ac)
                .build();

        new GTMaterial.Builder("aluminium")
                .states("ingot", "fluid", "ore")
                .color(0x80C8F0)
                // .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_SMALL_GEAR, GENERATE_RING, GENERATE_FRAME, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE)
                .element(Al)
                .toolProperty(2, 768, 6.0F, 7)
//                        .enchantability(14).build())
                // .rotorStats(10.0f, 2.0f, 128)
                // .cableProperties(GTValues.V[4], 1, 1)
                // .fluidPipeProperties(1166, 100, true)
                // .blastTemp(1700, GasTier.LOW)
                // .fluidTemp(933)
                .build();

        new GTMaterial.Builder("americium")
                .states("ingot", "fluid") // (3)()
                .color(0x287869) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .element(Am)
                // .itemPipeProperties(64, 64)
                // .fluidTemp(1449)
                .build();

        new GTMaterial.Builder("antimony")
                .states("ingot", "fluid") // ()()
                .color(0xDCDCF0) // .iconSet(SHINY)
                // .flags(MORTAR_GRINDABLE)
                .element(Sb)
                // .fluidTemp(904)
                .build();

        new GTMaterial.Builder("argon")
                .states("fluid", "plasma") // (FluidTypes.GAS)()
                .color(0x00FF00) // .iconSet(GAS)
                .element(Ar)
                .build();

        new GTMaterial.Builder("arsenic")
                .states("dust") // ().fluid()
                .color(0x676756)
                .element(As)
                // .fluidTemp(887)
                .build();

        new GTMaterial.Builder("astatine")
                .color(0x241A24)
                .element(At)
                .build();

        new GTMaterial.Builder("barium")
                .states("dust") // ()
                .color(0x83824C) // .iconSet(METALLIC)
                .element(Ba)
                .build();

        new GTMaterial.Builder("berkelium")
                .color(0x645A88) // .iconSet(METALLIC)
                .element(Bk)
                .build();

        new GTMaterial.Builder("beryllium")
                .states("ingot") // ().fluid().ore()
                .color(0x64B464) // .iconSet(METALLIC)
                // .flags(STD_METAL)
                .element(Be)
                // .fluidTemp(1560)
                .build();

        new GTMaterial.Builder("bismuth")
                .states("ingot") // (1).fluid()
                .color(0x64A0A0) // .iconSet(METALLIC)
                .element(Bi)
                // .fluidTemp(545)
                .build();

        new GTMaterial.Builder("bohrium")
                .color(0xDC57FF) // .iconSet(SHINY)
                .element(Bh)
                .build();

        new GTMaterial.Builder("boron")
                .states("dust") // ()
                .color(0xD2FAD2)
                .element(B)
                .build();

        new GTMaterial.Builder("bromine")
                .color(0x500A0A) // .iconSet(SHINY)
                .element(Br)
                .build();

        new GTMaterial.Builder("caesium")
                .states("dust") // ()
                .color(0x80620B) // .iconSet(METALLIC)
                .element(Cs)
                .build();

        new GTMaterial.Builder("calcium")
                .states("dust") // ()
                .color(0xFFF5DE) // .iconSet(METALLIC)
                .element(Ca)
                .build();

        new GTMaterial.Builder("californium")
                .color(0xA85A12) // .iconSet(METALLIC)
                .element(Cf)
                .build();

        new GTMaterial.Builder("carbon")
                .states("dust") // ().fluid()
                .color(0x141414)
                .element(C)
                // .fluidTemp(4600)
                .build();

        new GTMaterial.Builder("cadmium")
                .states("dust") // ()
                .color(0x32323C) // .iconSet(SHINY)
                .element(Cd)
                .build();

        new GTMaterial.Builder("cerium")
                .states("dust") // ().fluid()
                .color(0x87917D) // .iconSet(METALLIC)
                .element(Ce)
                // .fluidTemp(1068)
                .build();

        new GTMaterial.Builder("chlorine")
                .states("fluid") // (FluidTypes.GAS)
                .element(Cl)
                .build();

        new GTMaterial.Builder("chrome")
                .states("ingot") // (3).fluid()
                .color(0xEAC4D8) // .iconSet(SHINY)
                // .flags(EXT_METAL, GENERATE_ROTOR)
                .element(Cr)
                // .rotorStats(12.0f, 3.0f, 512)
                // .fluidPipeProperties(2180, 35, true, true, false, false)
                // .blastTemp(1700, GasTier.LOW)
                // .fluidTemp(2180)
                .build();

        new GTMaterial.Builder("cobalt")
                .states("ingot") // ().fluid().ore() // leave for TiCon ore processing
                .color(0x5050FA) // .iconSet(METALLIC)
                // .flags(EXT_METAL)
                .element(Co)
                // .cableProperties(GTValues.V[1], 2, 2)
                // .itemPipeProperties(2560, 2.0f)
                // .fluidTemp(1768)
                .build();

        new GTMaterial.Builder("copernicium")
                .color(0xFFFEFF)
                .element(Cn)
                .build();

        new GTMaterial.Builder("copper")
                .states("ingot") // (1).fluid().ore()
                .color(0xFF6400) // .iconSet(SHINY)
                // .flags(EXT_METAL, MORTAR_GRINDABLE, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE)
                .element(Cu)
                // .cableProperties(GTValues.V[2], 1, 2)
                // .fluidPipeProperties(1696, 6, true)
                // .fluidTemp(1358)
                .build();

        new GTMaterial.Builder("curium")
                .color(0x7B544E) // .iconSet(METALLIC)
                .element(Cm)
                .build();

        new GTMaterial.Builder("darmstadtium")
                .states("ingot") // ().fluid()
                .color(0x578062)
                // .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_SMALL_GEAR)
                .element(Ds)
                .build();

        new GTMaterial.Builder("deuterium")
                .states("fluid") // (FluidTypes.GAS)
                .element(D)
                .build();

        new GTMaterial.Builder("dubnium")
                .color(0xD3FDFF) // .iconSet(SHINY)
                .element(Db)
                .build();

        new GTMaterial.Builder("dysprosium")
                 // .iconSet(METALLIC)
                .element(Dy)
                .build();

        new GTMaterial.Builder("einsteinium")
                .color(0xCE9F00) // .iconSet(METALLIC)
                .element(Es)
                .build();

        new GTMaterial.Builder("erbium")
                 // .iconSet(METALLIC)
                .element(Er)
                .build();

        new GTMaterial.Builder("europium")
                .states("ingot") // ().fluid()
                .color(0x20FFFF) // .iconSet(METALLIC)
                // .flags(STD_METAL, GENERATE_LONG_ROD, GENERATE_FINE_WIRE, GENERATE_SPRING, GENERATE_FOIL, GENERATE_FRAME)
                .element(Eu)
                // .cableProperties(GTValues.V[GTValues.UHV], 2, 32)
                // .fluidPipeProperties(7750, 300, true)
                // .blastTemp(6000, GasTier.MID, VA[IV], 180)
                // .fluidTemp(1099)
                .build();

        new GTMaterial.Builder("fermium")
                .color(0x984ACF) // .iconSet(METALLIC)
                .element(Fm)
                .build();

        new GTMaterial.Builder("flerovium")
                 // .iconSet(SHINY)
                .element(Fl)
                .build();

        new GTMaterial.Builder("fluorine")
                .states("fluid") // (FluidTypes.GAS)
                .element(F)
                .build();

        new GTMaterial.Builder("francium")
                .color(0xAAAAAA) // .iconSet(SHINY)
                .element(Fr)
                .build();

        new GTMaterial.Builder("gadolinium")
                .color(0xDDDDFF) // .iconSet(METALLIC)
                .element(Gd)
                .build();

        new GTMaterial.Builder("gallium")
                .states("ingot") // ().fluid()
                .color(0xDCDCFF) // .iconSet(SHINY)
                // .flags(STD_METAL, GENERATE_FOIL)
                .element(Ga)
                // .fluidTemp(303)
                .build();

        new GTMaterial.Builder("germanium")
                .color(0x434343) // .iconSet(SHINY)
                .element(Ge)
                .build();

        new GTMaterial.Builder("gold")
                .states("ingot") // ().fluid().ore()
                .color(0xFFE650) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_RING, MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE, GENERATE_FOIL)
                .element(Au)
                // .cableProperties(GTValues.V[3], 3, 2)
                // .fluidPipeProperties(1671, 25, true, true, false, false)
                // .fluidTemp(1337)
                .build();

        new GTMaterial.Builder("hafnium")
                .color(0x99999A) // .iconSet(SHINY)
                .element(Hf)
                .build();

        new GTMaterial.Builder("hassium")
                .color(0xDDDDDD)
                .element(Hs)
                .build();

        new GTMaterial.Builder("holmium")
                 // .iconSet(METALLIC)
                .element(Ho)
                .build();

        new GTMaterial.Builder("hydrogen")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x0000B5)
                .element(H)
                .build();

        new GTMaterial.Builder("helium")
                .states("fluid") // (FluidTypes.GAS).plasma()
                .element(He)
                .build();

        new GTMaterial.Builder("helium_3")
                .states("fluid") // (FluidTypes.GAS)
                .element(He3)
                .build();

        new GTMaterial.Builder("indium")
                .states("ingot") // ().fluid()
                .color(0x400080) // .iconSet(SHINY)
                .element(In)
                // .fluidTemp(430)
                .build();

        new GTMaterial.Builder("iodine")
                .color(0x2C344F) // .iconSet(SHINY)
                .element(I)
                .build();

        new GTMaterial.Builder("iridium")
                .states("ingot") // (3).fluid()
                .color(0xA1E4E4) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .element(Ir)
                // .rotorStats(7.0f, 3.0f, 2560)
                // .fluidPipeProperties(3398, 250, true, false, true, false)
                // .blastTemp(4500, GasTier.HIGH, VA[IV], 1100)
                // .fluidTemp(2719)
                .build();

        new GTMaterial.Builder("iron")
                .states("ingot") // ().fluid().plasma().ore()
                .color(0xC8C8C8) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_GEAR, GENERATE_SPRING_SMALL, GENERATE_SPRING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES, BLAST_FURNACE_CALCITE_TRIPLE)
                .element(Fe)
                .toolProperty(2, 256, 2.0F, 2)
//                        .enchantability(14).build())
                // .rotorStats(7.0f, 2.5f, 256)
                // .cableProperties(GTValues.V[2], 2, 3)
                // .fluidTemp(1811)
                .build();

        new GTMaterial.Builder("krypton")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x80FF80) // .iconSet(GAS)
                .element(Kr)
                .build();

        new GTMaterial.Builder("lanthanum")
                .states("dust") // ().fluid()
                .color(0x5D7575) // .iconSet(METALLIC)
                .element(La)
                // .fluidTemp(1193)
                .build();

        new GTMaterial.Builder("lawrencium")
                 // .iconSet(METALLIC)
                .element(Lr)
                .build();

        new GTMaterial.Builder("lead")
                .states("ingot") // (1).fluid().ore()
                .color(0x8C648C)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE)
                .element(Pb)
                // .cableProperties(GTValues.V[0], 2, 2)
                // .fluidPipeProperties(1200, 8, true)
                // .fluidTemp(600)
                .build();

        new GTMaterial.Builder("lithium")
                .states("dust") // ().fluid().ore()
                .color(0xBDC7DB)
                .element(Li)
                // .fluidTemp(454)
                .build();

        new GTMaterial.Builder("livermorium")
                .color(0xAAAAAA) // .iconSet(SHINY)
                .element(Lv)
                .build();

        new GTMaterial.Builder("lutetium")
                .states("dust") // ().fluid()
                .color(0x00AAFF) // .iconSet(METALLIC)
                .element(Lu)
                // .fluidTemp(1925)
                .build();

        new GTMaterial.Builder("magnesium")
                .states("dust") // ().fluid()
                .color(0xFFC8C8) // .iconSet(METALLIC)
                .element(Mg)
                // .fluidTemp(923)
                .build();

        new GTMaterial.Builder("mendelevium")
                .color(0x1D4ACF) // .iconSet(METALLIC)
                .element(Md)
                .build();

        new GTMaterial.Builder("manganese")
                .states("ingot") // ().fluid()
                .color(0xCDE1B9)
                // .flags(STD_METAL, GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .element(Mn)
                // .rotorStats(7.0f, 2.0f, 512)
                // .fluidTemp(1519)
                .build();

        new GTMaterial.Builder("meitnerium")
                .color(0x2246BE) // .iconSet(SHINY)
                .element(Mt)
                .build();

        new GTMaterial.Builder("mercury")
                .states("fluid") // ()
                .color(0xE6DCDC) // .iconSet(DULL)
                .element(Hg)
                .build();

        new GTMaterial.Builder("molybdenum")
                .states("ingot") // ().fluid().ore()
                .color(0xB4B4DC) // .iconSet(SHINY)
                .element(Mo)
                // .flags(GENERATE_FOIL, GENERATE_BOLT_SCREW)
                // .rotorStats(7.0f, 2.0f, 512)
                // .fluidTemp(2896)
                .build();

        new GTMaterial.Builder("moscovium")
                .color(0x7854AD) // .iconSet(SHINY)
                .element(Mc)
                .build();

        new GTMaterial.Builder("neodymium")
                .states("ingot") // ().fluid().ore()
                .color(0x646464) // .iconSet(METALLIC)
                // .flags(STD_METAL, GENERATE_ROD, GENERATE_BOLT_SCREW)
                .element(Nd)
                // .rotorStats(7.0f, 2.0f, 512)
                // .blastTemp(1297, GasTier.MID)
                .build();

        new GTMaterial.Builder("neon")
                .states("fluid") // (FluidTypes.GAS)
                .color(0xFAB4B4) // .iconSet(GAS)
                .element(Ne)
                .build();

        new GTMaterial.Builder("neptunium")
                .color(0x284D7B) // .iconSet(METALLIC)
                .element(Np)
                .build();

        new GTMaterial.Builder("nickel")
                .states("ingot") // ().fluid().plasma().ore()
                .color(0xC8C8FA) // .iconSet(METALLIC)
                // .flags(STD_METAL, MORTAR_GRINDABLE)
                .element(Ni)
                // .cableProperties(GTValues.V[GTValues.LV], 3, 3)
                // .itemPipeProperties(2048, 1.0f)
                // .fluidTemp(1728)
                .build();

        new GTMaterial.Builder("nihonium")
                .color(0x08269E) // .iconSet(SHINY)
                .element(Nh)
                .build();

        new GTMaterial.Builder("niobium")
                .states("ingot") // ().fluid()
                .color(0xBEB4C8) // .iconSet(METALLIC)
                .element(Nb)
                // .blastTemp(2750, GasTier.MID, VA[HV], 900)
                .build();

        new GTMaterial.Builder("nitrogen")
                .states("fluid") // (FluidTypes.GAS).plasma()
                .color(0x00BFC1) // .iconSet(GAS)
                .element(N)
                .build();

        new GTMaterial.Builder("nobelium")
                 // .iconSet(SHINY)
                .element(No)
                .build();

        new GTMaterial.Builder("oganesson")
                .color(0x142D64) // .iconSet(METALLIC)
                .element(Og)
                .build();

        new GTMaterial.Builder("osmium")
                .states("ingot") // (4).fluid()
                .color(0x3232FF) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_FOIL)
                .element(Os)
                // .rotorStats(16.0f, 4.0f, 1280)
                // .cableProperties(GTValues.V[6], 4, 2)
                // .itemPipeProperties(256, 8.0f)
                // .blastTemp(4500, GasTier.HIGH, VA[LuV], 1000)
                // .fluidTemp(3306)
                .build();

        new GTMaterial.Builder("oxygen")
                .states("fluid") // (FluidTypes.GAS).plasma()
                .color(0x4CC3FF)
                .element(O)
                .build();

        new GTMaterial.Builder("palladium")
                .states("ingot") // ().fluid().ore()
                .color(0x808080) // .iconSet(SHINY)
                // .flags(EXT_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE)
                .element(Pd)
                // .blastTemp(1828, GasTier.LOW, VA[HV], 900)
                .build();

        new GTMaterial.Builder("phosphorus")
                .states("dust") // ()
                .color(0xFFFF00)
                .element(P)
                .build();

        new GTMaterial.Builder("polonium")
                .color(0xC9D47E)
                .element(Po)
                .build();

        new GTMaterial.Builder("platinum")
                .states("ingot") // ().fluid().ore()
                .color(0xFFFFC8) // .iconSet(SHINY)
                // .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_RING)
                .element(Pt)
                // .cableProperties(GTValues.V[5], 2, 1)
                // .itemPipeProperties(512, 4.0f)
                // .fluidTemp(2041)
                .build();

        new GTMaterial.Builder("plutonium")
                .states("ingot") // (3).fluid().ore(true)
                .color(0xF03232) // .iconSet(METALLIC)
                .element(Pu239)
                // .fluidTemp(913)
                .build();

        new GTMaterial.Builder("plutonium_241")
                .states("ingot") // (3).fluid()
                .color(0xFA4646) // .iconSet(SHINY)
                // .flags(EXT_METAL)
                .element(Pu241)
                // .fluidTemp(913)
                .build();

        new GTMaterial.Builder("potassium")
                .states("dust") // (1).fluid()
                .color(0xBEDCFF) // .iconSet(METALLIC)
                .element(K)
                // .fluidTemp(337)
                .build();

        new GTMaterial.Builder("praseodymium")
                .color(0xCECECE) // .iconSet(METALLIC)
                .element(Pr)
                .build();

        new GTMaterial.Builder("promethium")
                 // .iconSet(METALLIC)
                .element(Pm)
                .build();

        new GTMaterial.Builder("protactinium")
                .color(0xA78B6D) // .iconSet(METALLIC)
                .element(Pa)
                .build();

        new GTMaterial.Builder("radon")
                .states("fluid") // (FluidTypes.GAS)
                .color(0xFF39FF)
                .element(Rn)
                .build();

        new GTMaterial.Builder("radium")
                .color(0xFFFFCD) // .iconSet(SHINY)
                .element(Ra)
                .build();

        new GTMaterial.Builder("rhenium")
                .color(0xB6BAC3) // .iconSet(SHINY)
                .element(Re)
                .build();

        new GTMaterial.Builder("rhodium")
                .states("ingot") // ().fluid()
                .color(0xDC0C58) // .iconSet(BRIGHT)
                // .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_FINE_WIRE)
                .element(Rh)
                // .blastTemp(2237, GasTier.MID, VA[EV], 1200)
                .build();

        new GTMaterial.Builder("roentgenium")
                .color(0xE3FDEC) // .iconSet(SHINY)
                .element(Rg)
                .build();

        new GTMaterial.Builder("rubidium")
                .color(0xF01E1E) // .iconSet(SHINY)
                .element(Rb)
                .build();

        new GTMaterial.Builder("ruthenium")
                .states("ingot") // ().fluid()
                .color(0x50ACCD) // .iconSet(SHINY)
                // .flags(GENERATE_FOIL, GENERATE_GEAR)
                .element(Ru)
                // .blastTemp(2607, GasTier.MID, VA[EV], 900)
                .build();

        new GTMaterial.Builder("rutherfordium")
                .color(0xFFF6A1) // .iconSet(SHINY)
                .element(Rf)
                .build();

        new GTMaterial.Builder("samarium")
                .states("ingot") // ().fluid()
                .color(0xFFFFCC) // .iconSet(METALLIC)
                // .flags(GENERATE_LONG_ROD)
                .element(Sm)
                // .blastTemp(5400, GasTier.HIGH, VA[EV], 1500)
                // .fluidTemp(1345)
                .build();

        new GTMaterial.Builder("scandium")
                 // .iconSet(METALLIC)
                .element(Sc)
                .build();

        new GTMaterial.Builder("seaborgium")
                .color(0x19C5FF) // .iconSet(SHINY)
                .element(Sg)
                .build();

        new GTMaterial.Builder("selenium")
                .color(0xB6BA6B) // .iconSet(SHINY)
                .element(Se)
                .build();

        new GTMaterial.Builder("silicon")
                .states("ingot") // ().fluid()
                .color(0x3C3C50) // .iconSet(METALLIC)
                // .flags(GENERATE_FOIL)
                .element(Si)
                // .blastTemp(1687) // no gas tier for silicon
                .build();

        new GTMaterial.Builder("silver")
                .states("ingot") // ().fluid().ore()
                .color(0xDCDCFF) // .iconSet(SHINY)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_FINE_WIRE, GENERATE_RING)
                .element(Ag)
                // .cableProperties(GTValues.V[3], 1, 1)
                // .fluidTemp(1235)
                .build();

        new GTMaterial.Builder("sodium")
                .states("dust") // ()
                .color(0x000096) // .iconSet(METALLIC)
                .element(Na)
                .build();

        new GTMaterial.Builder("strontium")
                .color(0xC8C8C8) // .iconSet(METALLIC)
                .element(Sr)
                .build();

        new GTMaterial.Builder("sulfur")
                .states("dust", "ore") // ()()
                .color(0xC8C800)
                // .flags(FLAMMABLE)
                .element(S)
                .build();

        new GTMaterial.Builder("tantalum")
                .states("ingot", "fluid") // ()()
                .color(0x78788c) // .iconSet(METALLIC)
                // .flags(STD_METAL, GENERATE_FOIL)
                .element(Ta)
                // .fluidTemp(3290)
                .build();

        new GTMaterial.Builder("technetium")
                .color(0x545455) // .iconSet(SHINY)
                .element(Tc)
                .build();

        new GTMaterial.Builder("tellurium")
                 // .iconSet(METALLIC)
                .element(Te)
                .build();

        new GTMaterial.Builder("tennessine")
                .color(0x977FD6) // .iconSet(SHINY)
                .element(Ts)
                .build();

        new GTMaterial.Builder("terbium")
                 // .iconSet(METALLIC)
                .element(Tb)
                .build();

        new GTMaterial.Builder("thorium")
                .states("ingot", "fluid", "ore") // ()()()
                .color(0x001E00) // .iconSet(SHINY)
                // .flags(STD_METAL, GENERATE_ROD)
                .element(Th)
                // .fluidTemp(2023)
                .build();

        new GTMaterial.Builder("thallium")
                .color(0xC1C1DE) // .iconSet(SHINY)
                .element(Tl)
                .build();

        new GTMaterial.Builder("thulium")
                 // .iconSet(METALLIC)
                .element(Tm)
                .build();

        new GTMaterial.Builder("tin")
                .states("ingot", "fluid", "ore") // (1)(FluidTypes.LIQUID, true)()
                .color(0xDCDCDC)
                // .flags(EXT2_METAL, MORTAR_GRINDABLE, GENERATE_ROTOR, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FINE_WIRE)
                .element(Sn)
                // .cableProperties(GTValues.V[1], 1, 1)
                // .itemPipeProperties(4096, 0.5f)
                // .fluidTemp(505)
                .build();

        new GTMaterial.Builder("titanium") // todo Ore? Look at EBF recipe here if we do Ti ores
                .states("ingot", "fluid") // (3)()
                .color(0xDCA0F0) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_GEAR, GENERATE_FRAME)
                .element(Ti)
                .toolProperty(3, 1536, 8.0F, 6)
//                        .enchantability(14).build())
                // .rotorStats(7.0f, 3.0f, 1600)
                // .fluidPipeProperties(2426, 150, true)
                // .blastTemp(1941, GasTier.MID, VA[HV], 1500)
                .build();

        new GTMaterial.Builder("tritium")
                .states("fluid") // (FluidTypes.GAS)
                 // .iconSet(METALLIC)
                .element(T)
                .build();

        new GTMaterial.Builder("tungsten")
                .states("ingot") // (3).fluid()
                .color(0x323232) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_FOIL, GENERATE_GEAR)
                .element(W)
                // .rotorStats(7.0f, 3.0f, 2560)
                // .cableProperties(GTValues.V[5], 2, 2)
                // .fluidPipeProperties(4618, 50, true, true, false, true)
                // .blastTemp(3600, GasTier.MID, VA[EV], 1800)
                // .fluidTemp(3695)
                .build();

        new GTMaterial.Builder("uranium")
                .states("ingot") // (3).fluid()
                .color(0x32F032) // .iconSet(METALLIC)
                // .flags(EXT_METAL)
                .element(U238)
                // .fluidTemp(1405)
                .build();

        new GTMaterial.Builder("uranium_235")
                .states("ingot") // (3).fluid()
                .color(0x46FA46) // .iconSet(SHINY)
                // .flags(EXT_METAL)
                .element(U235)
                // .fluidTemp(1405)
                .build();

        new GTMaterial.Builder("vanadium")
                .states("ingot") // ().fluid()
                .color(0x323232) // .iconSet(METALLIC)
                .element(V)
                // .blastTemp(2183, GasTier.MID)
                .build();

        new GTMaterial.Builder("xenon")
                .states("fluid") // (FluidTypes.GAS)
                .color(0x00FFFF) // .iconSet(GAS)
                .element(Xe)
                .build();

        new GTMaterial.Builder("ytterbium")
                .color(0xA7A7A7) // .iconSet(METALLIC)
                .element(Yb)
                .build();

        new GTMaterial.Builder("yttrium")
                .states("ingot") // ().fluid()
                .color(0x76524C) // .iconSet(METALLIC)
                .element(Y)
                // .blastTemp(1799)
                .build();

        new GTMaterial.Builder("zinc")
                .states("ingot") // (1).fluid()
                .color(0xEBEBFA) // .iconSet(METALLIC)
                // .flags(STD_METAL, MORTAR_GRINDABLE, GENERATE_FOIL, GENERATE_RING, GENERATE_FINE_WIRE)
                .element(Zn)
                // .fluidTemp(693)
                .build();

        new GTMaterial.Builder("zirconium")
                .color(0xC8FFFF) // .iconSet(METALLIC)
                .element(Zr)
                .build();

        new GTMaterial.Builder("naquadah")
                .states("ingot") // (4).fluid().ore()
                .color(0x323232) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_FOIL, GENERATE_SPRING, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW)
                .element(Nq)
                // .rotorStats(6.0f, 4.0f, 1280)
                // .cableProperties(GTValues.V[7], 2, 2)
                // .fluidPipeProperties(3776, 200, true, false, true, true)
                // .blastTemp(5000, GasTier.HIGH, VA[IV], 600)
                .build();

        new GTMaterial.Builder("naquadah_enriched")
                .states("ingot") // (4).fluid()
                .color(0x3C3C3C) // .iconSet(METALLIC)
                // .flags(EXT_METAL, GENERATE_FOIL)
                .element(Nq1)
                // .blastTemp(7000, GasTier.HIGH, VA[IV], 1000)
                .build();

        new GTMaterial.Builder("naquadria")
                .states("ingot") // (3).fluid()
                .color(0x1E1E1E) // .iconSet(SHINY)
                // .flags(EXT_METAL, GENERATE_FOIL, GENERATE_GEAR, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW)
                .element(Nq2)
                // .blastTemp(9000, GasTier.HIGH, VA[ZPM], 1200)
                .build();

        new GTMaterial.Builder("neutronium")
                .states("ingot") // (6).fluid()
                .color(0xFAFAFA)
                // .flags(EXT_METAL, GENERATE_BOLT_SCREW, GENERATE_FRAME)
                .element(Nt)
                .toolProperty(6, 65535, 180.0F, 100)
//                        .attackSpeed(0.5F).enchantability(33).magnetic().unbreakable().build())
                // .rotorStats(24.0f, 12.0f, 655360)
                // .fluidPipeProperties(100_000, 5000, true, true, true, true)
                // .fluidTemp(100_000)
                .build();

        new GTMaterial.Builder("tritanium")
                .states("ingot") // (6).fluid()
                .color(0x600000) // .iconSet(METALLIC)
                // .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_ROUND, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .element(Tr)
                // .cableProperties(GTValues.V[8], 1, 8)
                // .rotorStats(20.0f, 6.0f, 10240)
                // .fluidTemp(25000)
                .build();

        new GTMaterial.Builder("duranium")
                .states("ingot") // (5).fluid()
                .color(0x4BAFAF) // .iconSet(BRIGHT)
                // .flags(EXT_METAL, GENERATE_FOIL, GENERATE_GEAR)
                .element(Dr)
                .toolProperty(5, 8192, 14.0F, 12)
//                        .attackSpeed(0.3F).enchantability(33).magnetic().build())
                // .fluidPipeProperties(9625, 500, true, true, true, true)
                // .fluidTemp(7500)
                .build();

        new GTMaterial.Builder("trinium")
                .states("ingot") // (7).fluid()
                .color(0x9973BD) // .iconSet(SHINY)
                // .flags(GENERATE_FOIL, GENERATE_BOLT_SCREW, GENERATE_GEAR)
                .element(Ke)
                // .cableProperties(GTValues.V[7], 6, 4)
                // .blastTemp(7200, GasTier.HIGH, VA[LuV], 1500)
                .build();

    }
}
