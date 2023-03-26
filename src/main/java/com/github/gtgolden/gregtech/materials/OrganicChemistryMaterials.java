package com.github.gtgolden.gregtech.materials;

import com.github.gtgolden.gtgoldencore.material.GTMaterial;
import com.github.gtgolden.gtgoldencore.material.MaterialStack;
import com.github.gtgolden.gtgoldencore.material.Materials;

import static com.github.gtgolden.gtgoldencore.material.chemistry.Elements.*;

public class OrganicChemistryMaterials {
    /**
     * ID RANGE: 1000-1068 (incl.)
     *
     * (no)
     */
    public static void register() {
        new GTMaterial.Builder("silicone_rubber")
                // .polymer()
                .color(0xDCDCDC)
                // .flags(GENERATE_GEAR, GENERATE_RING, GENERATE_FOIL)
                .components("C2H6OSi")
                // .fluidTemp(900)
                .build();

        new GTMaterial.Builder("nitrobenzene")
                // .fluid(FluidTypes.GAS)
                .color(0x704936)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H5NO2")
                .build();

        new GTMaterial.Builder("raw_rubber")
                // .polymer()
                .color(0xCCC789)
                .components("C5H8")
                .build();

        new GTMaterial.Builder("raw_styrene_butadiene_rubber")
                .states("dust") // ()
                .color(0x54403D) // .iconSet(SHINY)
                // .flags(DISABLE_DECOMPOSITION, FLAMMABLE)
                .components("C20H26")
                .setFormula("(C4H6)3C8H8")
                .build();

        new GTMaterial.Builder("styrene_butadiene_rubber")
                // .polymer()
                .color(0x211A18) // .iconSet(SHINY)
                // .flags(GENERATE_FOIL, GENERATE_RING)
                .components("C20H26")
                .setFormula("(C4H6)3C8H8")
                // .fluidTemp(1000)
                .build();

        new GTMaterial.Builder("polyvinyl_acetate")
                // .fluid()
                .color(0xFF9955)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C4H6O2")
                .build();

        new GTMaterial.Builder("reinforced_epoxy_resin")
                // .polymer()
                .color(0xA07A10)
                // .flags(STD_METAL)
                .components("C6H4O")
                // .fluidTemp(600)
                .build();

        new GTMaterial.Builder("polyvinyl_chloride")
                // .polymer()
                .color(0xD7E6E6)
                // .flags(EXT_METAL, GENERATE_FOIL)
                .components("C2H3Cl")
                // .itemPipeProperties(512, 4)
                // .fluidTemp(373)
                .build();

        new GTMaterial.Builder("polyphenylene_sulfide")
                // .polymer()
                .color(0xAA8800)
                // .flags(EXT_METAL, GENERATE_FOIL)
                .components("C6H4S")
                // .fluidTemp(500)
                .build();

        new GTMaterial.Builder("glyceryl_trinitrate")
                // .fluid()
                // .flags(FLAMMABLE, EXPLOSIVE)
                .components("C3H5N3O9")
                .build();

        new GTMaterial.Builder("polybenzimidazole")
                // .polymer()
                .color(0x2D2D2D)
                // .flags(EXCLUDE_BLOCK_CRAFTING_RECIPES, GENERATE_FOIL)
                .components("C20H12N4")
                // .fluidPipeProperties(1000, 350, true)
                // .fluidTemp(1450)
                .build();

        new GTMaterial.Builder("polydimethylsiloxane")
                .states("dust") // ()
                .color(0xF5F5F5)
                // .flags(DISABLE_DECOMPOSITION, FLAMMABLE)
                .components("C2H6OSi")
                .build();

        new GTMaterial.Builder("plastic") //todo add polyethylene oredicts
                // .polymer(1)
                .color(0xC8C8C8)
                // .flags(GENERATE_FOIL)
                .components("C2H4")
                // .fluidPipeProperties(370, 50, true)
                // .fluidTemp(408)
                .build();

        new GTMaterial.Builder("epoxy")
                // .polymer(1)
                .color(0xC88C14)
                // .flags(STD_METAL)
                .components("C21H25ClO5")
                // .fluidTemp(400)
                .build();

        // Free ID 1014

        new GTMaterial.Builder("polycaprolactam")
                // .polymer(1)
                .color(0x323232)
                // .flags(STD_METAL, GENERATE_FOIL)
                .components("C6H11NO")
                // .fluidTemp(493)
                .build();

        new GTMaterial.Builder("polytetrafluoroethylene")
                // .polymer(1)
                .color(0x646464)
                // .flags(STD_METAL, GENERATE_FRAME, GENERATE_FOIL)
                .components("C2F4")
                // .fluidPipeProperties(600, 100, true, true, false, false)
                // .fluidTemp(600)
                .build();

        new GTMaterial.Builder("sugar")
                .states("gem") // (1)
                .color(0xFAFAFA) // .iconSet(FINE)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H12O6")
                .build();

        new GTMaterial.Builder("methane")
                // .fluid(FluidTypes.GAS)
                .color(0xFF0078) // .iconSet(GAS)
                .components("CH4")
                .build();

        new GTMaterial.Builder("epichlorohydrin")
                // .fluid()
                .color(0x712400)
                .components("C3H5ClO")
                .build();

        new GTMaterial.Builder("monochloramine")
                // .fluid(FluidTypes.GAS)
                .color(0x3F9F80)
                .components("NH2Cl")
                .build();

        new GTMaterial.Builder("chloroform")
                // .fluid()
                .color(0x892CA0)
                .components("CHCl3")
                .build();

        new GTMaterial.Builder("cumene")
                // .fluid(FluidTypes.GAS)
                .color(0x552200)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C9H12")
                .build();

        new GTMaterial.Builder("tetrafluoroethylene")
                // .fluid(FluidTypes.GAS)
                .color(0x7D7D7D)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2F4")
                .build();

        new GTMaterial.Builder("chloromethane")
                // .fluid(FluidTypes.GAS)
                .color(0xC82CA0)
                // .flags(DISABLE_DECOMPOSITION)
                .components("CH3Cl")
                .build();

        new GTMaterial.Builder("allyl_chloride")
                // .fluid()
                .color(0x87DEAA)
                .setComponents(
                        C.x(2),
                        new MaterialStack("Methane", 1),
                        new MaterialStack("HydrochloricAcid", 1))
                .setFormula("C3H5Cl")
                .build();

        new GTMaterial.Builder("isoprene")
                // .fluid()
                .color(0x141414)
                .components("C5H8")
                .build();

        new GTMaterial.Builder("propane")
                // .fluid(FluidTypes.GAS)
                .color(0xFAE250)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C3H8")
                .build();

        new GTMaterial.Builder("propene")
                // .fluid(FluidTypes.GAS)
                .color(0xFFDD55)
                .components("C3H6")
                .build();

        new GTMaterial.Builder("ethane")
                // .fluid(FluidTypes.GAS)
                .color(0xC8C8FF)
                .components("C2H6")
                .build();

        new GTMaterial.Builder("butene")
                // .fluid(FluidTypes.GAS)
                .color(0xCF5005)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C4H8")
                .build();

        new GTMaterial.Builder("butane")
                // .fluid(FluidTypes.GAS)
                .color(0xB6371E)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C4H10")
                .build();

        new GTMaterial.Builder("dissolved_calcium_acetate")
                // .fluid()
                .color(0xDCC8B4)
                // .flags(DISABLE_DECOMPOSITION)
                .components("CaC4OH8")
                .setFormula("Ca(CH3COO)2(H2O)")
                .build();

        new GTMaterial.Builder("vinyl_acetate")
                // .fluid()
                .color(0xE1B380)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C4H6O2")
                .build();

        new GTMaterial.Builder("methyl_acetate")
                // .fluid()
                .color(0xEEC6AF)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C3H6O2")
                .build();

        new GTMaterial.Builder("ethenone")
                // .fluid()
                .color(0x141446)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H2O")
                .build();

        new GTMaterial.Builder("tetranitromethane")
                // .fluid()
                .color(0x0F2828)
                // .flags(DISABLE_DECOMPOSITION)
                .components("CN4O8")
                .build();

        new GTMaterial.Builder("dimethylamine")
                // .fluid(FluidTypes.GAS)
                .color(0x554469)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H7N")
                .build();

        new GTMaterial.Builder("dimethylhydrazine")
                // .fluid()
                .color(0x000055)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H8N2")
                .build();

        new GTMaterial.Builder("dinitrogen_tetroxide")
                // .fluid(FluidTypes.GAS)
                .color(0x004184)
                .components("N2O4")
                .build();

        new GTMaterial.Builder("dimethyldichlorosilane")
                // .fluid(FluidTypes.GAS)
                .color(0x441650)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H6Cl2Si")
                .build();

        new GTMaterial.Builder("styrene")
                // .fluid()
                .color(0xD2C8BE)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C8H8")
                .build();

        new GTMaterial.Builder("butadiene")
                // .fluid(FluidTypes.GAS)
                .color(0xB55A10)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C4H6")
                .build();

        new GTMaterial.Builder("dichlorobenzene")
                // .fluid()
                .color(0x004455)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H4Cl2")
                .build();

        new GTMaterial.Builder("acetic_acid")
                // .fluid(FluidTypes.ACID)
                .color(0xC8B4A0)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H4O2")
                .build();

        new GTMaterial.Builder("phenol")
                // .fluid()
                .color(0x784421)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H6O")
                .build();

        new GTMaterial.Builder("bisphenol_a")
                // .fluid()
                .color(0xD4AA00)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C15H16O2")
                .build();

        new GTMaterial.Builder("vinyl_chloride")
                // .fluid(FluidTypes.GAS)
                .color(0xE1F0F0)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H3Cl")
                .build();

        new GTMaterial.Builder("ethylene")
                // .fluid(FluidTypes.GAS)
                .color(0xE1E1E1)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H4")
                .build();

        new GTMaterial.Builder("benzene")
                // .fluid()
                .color(0x1A1A1A)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H6")
                .build();

        new GTMaterial.Builder("acetone")
                // .fluid()
                .color(0xAFAFAF)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C3H6O")
                .build();

        new GTMaterial.Builder("glycerol")
                // .fluid()
                .color(0x87DE87)
                .components("C3H8O3")
                .build();

        new GTMaterial.Builder("methanol")
                // .fluid()
                .color(0xAA8800)
                .components("CH4O")
                .build();

        // FREE ID 1053

        new GTMaterial.Builder("ethanol")
                // .fluid()
                // .flags(DISABLE_DECOMPOSITION)
                .components("C2H6O")
                .build();

        new GTMaterial.Builder("toluene")
                // .fluid()
                // .flags(DISABLE_DECOMPOSITION)
                .components("C7H8")
                .build();

        new GTMaterial.Builder("diphenyl_isophthalate")
                // .fluid()
                .color(0x246E57)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C20H14O4")
                .build();

        new GTMaterial.Builder("phthalic_acid")
                // .fluid(FluidTypes.ACID)
                .color(0xD1D1D1)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C8H6O4")
                .setFormula("C6H4(CO2H)2")
                .build();

        new GTMaterial.Builder("dimethylbenzene")
                // .fluid()
                .color(0x669C40)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C8H10")
                .setFormula("C6H4(CH3)2")
                .build();

        new GTMaterial.Builder("diaminobenzidine")
                // .fluid()
                .color(0x337D59)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C12H14N4")
                .setFormula("(C6H3(NH2)2)2")
                .build();

        new GTMaterial.Builder("dichlorobenzidine")
                // .fluid()
                .color(0xA1DEA6)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C12H10Cl2N2")
                .setFormula("(C6H3Cl(NH2))2")
                .build();

        new GTMaterial.Builder("nitrochlorobenzene")
                // .fluid()
                .color(0x8FB51A)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H4ClNO2")
                .build();

        new GTMaterial.Builder("chlorobenzene")
                // .fluid()
                .color(0x326A3E)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C6H5Cl")
                .build();

        new GTMaterial.Builder("octane")
                // .fluid()
                // .flags(DISABLE_DECOMPOSITION)
                .color(0x8A0A09)
                .components("C8H18")
                .build();

        new GTMaterial.Builder("ethyl_tertbutyl_ether")
                // .fluid()
                // .flags(DISABLE_DECOMPOSITION)
                .color(0xB15C06)
                .components("C6H14O")
                .build();

        new GTMaterial.Builder("ethylbenzene")
                // .fluid()
                // .flags(DISABLE_DECOMPOSITION)
                .components("C8H10")
                .build();

        new GTMaterial.Builder("naphthalene")
                // .fluid()
                // .flags(DISABLE_DECOMPOSITION)
                .color(0xF4F4D7)
                .components("C10H8")
                .build();

        new GTMaterial.Builder("rubber")
                // .polymer(0) polymer is multiple meta items, todo lookup what metaitems are included into polymer
                .color(0x000000) // .iconSet(SHINY)
                // .flags(GENERATE_GEAR, GENERATE_RING, GENERATE_FOIL, GENERATE_BOLT_SCREW)
                .components("C5H8")
                // .fluidTemp(400)
                .build();

        new GTMaterial.Builder("cyclohexane")
                // .fluid()
                .color(0xF2F2F2E7)
                .components("C6H12")
                .build();

        new GTMaterial.Builder("nitrosyl_chloride")
                // .fluid(FluidTypes.GAS)
                // .flags(FLAMMABLE)
                .color(0xF3F100)
                .components("NOCl")
                .build();

        new GTMaterial.Builder("cyclohexanone_oxime")
                .states("dust") // ()
                // .flags(DISABLE_DECOMPOSITION, FLAMMABLE)
                .color(0xEBEBF0) // .iconSet(ROUGH)
                .components("C6H11NO")
                .build();

        new GTMaterial.Builder("caprolactam")
                .states("dust") // ()
                // .flags(DISABLE_DECOMPOSITION, FLAMMABLE)
                .color(0x676768)
                .components("C6H11NO")
                .setFormula("(CH2)5C(O)NH")
                .build();

        new GTMaterial.Builder("butyraldehyde")
                // .fluid()
                .color(0x554A3F)
                // .flags(DISABLE_DECOMPOSITION)
                .components("C4H8O")
                .build();

        new GTMaterial.Builder("polyvinyl_butyral")
                .states("ingot", "fluid") // ()()
                .color(0x347D41)
                // .flags(GENERATE_PLATE, DISABLE_DECOMPOSITION, NO_SMASHING)
                .setComponents(
                        new MaterialStack("butyraldehyde", 1),
                        new MaterialStack("polyvinyl_acetate", 1))
                .setFormula("(C4H8O)(C4H6O2)")
                .build();
    }
}
