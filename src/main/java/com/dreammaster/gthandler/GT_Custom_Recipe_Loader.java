package com.dreammaster.gthandler;

import com.dreammaster.item.ItemList;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_Config;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.V;
import static gregtech.api.enums.OrePrefixes.*;
import static gregtech.api.enums.Materials.*;

public class GT_Custom_Recipe_Loader implements Runnable{

    public void run() {

        //Assembler Recipes

        //TODO: Add sensible energy cost for these items, right now they are far too cheap to make energy wise.
        //1k - 64k ME storage components, 2x recursive instead of 4x recursive
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CustomItemList.ChargedCertusQuartzDust.get(4L), GT_OreDictUnificator.get(circuit, Primitive, 2L), com.dreammaster.item.ItemList.LogicProcessorItemGoldCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 35), 20, Voltage.LV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Basic, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 35), com.dreammaster.item.ItemList.LogicProcessorItemGoldCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 36), 40, Voltage.LV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Good, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 36), ItemList.EngineeringProcessorItemDiamondCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 37), 80, Voltage.MV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Advanced, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 37), ItemList.EngineeringProcessorItemDiamondCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 38), 160, Voltage.HV.getVoltage());

        //256k - 16384k storage components, 2x recursive instead of 4x recursive
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Data, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 38), ItemList.EngineeringProcessorItemEmeraldCore.getIS(1)}, null, GT_ModHandler.getModItem("extracells", "storage.component", 1L, 0), 320, Voltage.EV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Elite, 2), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 0), ItemList.EngineeringProcessorItemEmeraldCore.getIS(1)}, null, GT_ModHandler.getModItem("extracells", "storage.component", 1L, 1), 640, Voltage.IV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Master, 2), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 1 ), ItemList.EngineeringProcessorItemAdvEmeraldCore.getIS(1)}, null, GT_ModHandler.getModItem("extracells", "storage.component", 1L, 2), 1280 , Voltage.LUV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Ultimate, 2), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 2 ), ItemList.EngineeringProcessorItemAdvEmeraldCore.getIS(1)}, null, GT_ModHandler.getModItem("extracells", "storage.component", 1L, 3), 2560, Voltage.ZPM.getVoltage());

        //Assembler Recipes to turn storage components into cells
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 35), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 39)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemBasicStorageCell.1k", 1L, 0), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 36), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 39)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemBasicStorageCell.4k", 1L, 0), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 37), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 39)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemBasicStorageCell.16k", 1L, 0), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 38), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 39)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemBasicStorageCell.64k", 1L, 0), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("extracells", "storage.casing", 1L, 0), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 0)}, null, GT_ModHandler.getModItem("extracells", "storage.physical", 1L, 0), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("extracells", "storage.casing", 1L, 0), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 1)}, null, GT_ModHandler.getModItem("extracells", "storage.physical", 1L, 1), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("extracells", "storage.casing", 1L, 0), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 2)}, null, GT_ModHandler.getModItem("extracells", "storage.physical", 1L, 2), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_ModHandler.getModItem("extracells", "storage.casing", 1L, 0), GT_ModHandler.getModItem("extracells", "storage.component", 1L, 3)}, null, GT_ModHandler.getModItem("extracells", "storage.physical", 1L, 3), 20, 32);

        //Different recipes for ME Storage Components
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(dust, Gold, 3L), GT_OreDictUnificator.get(dust, Silicon, 1L), GT_OreDictUnificator.get(dust, Redstone, 1L), GT_Utility.getIntegratedCircuit(16)}, null, ItemList.LogicProcessorItemGoldCore.getIS(1), 20, Voltage.MV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(dust, Diamond, 6L), GT_OreDictUnificator.get(dust, Silicon, 1L), GT_OreDictUnificator.get(dust, Redstone, 2L), GT_Utility.getIntegratedCircuit(17)}, null, ItemList.EngineeringProcessorItemDiamondCore.getIS(1), 20, Voltage.HV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(dust, Diamond, 1L), GT_OreDictUnificator.get(dust, Silicon, 1L), GT_OreDictUnificator.get(dust, Redstone, 7L), GT_OreDictUnificator.get(dust, Ruby, 4L), GT_OreDictUnificator.get(dust, Emerald, 1L), GT_Utility.getIntegratedCircuit(18)}, null, ItemList.EngineeringProcessorItemEmeraldCore.getIS(1), 20, Voltage.EV.getVoltage());
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(dust, Diamond, 1L), GT_OreDictUnificator.get(dust, Redstone, 2L), GT_OreDictUnificator.get(dust, Silicon, 1L), GT_OreDictUnificator.get(dust, GarnetYellow, 9L), GT_OreDictUnificator.get(dust, Emerald, 1L), GT_Utility.getIntegratedCircuit(19)}, null, ItemList.EngineeringProcessorItemAdvEmeraldCore.getIS(1), 20, Voltage.IV.getVoltage());

        //Some adjusted recipes - Lapotron Related
        GT_Values.RA.addMixerRecipe(gregtech.api.enums.ItemList.IC2_Energium_Dust.get(1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lapis, 4L), GT_Values.NI, GT_Values.NI, GT_Values.NI, GT_Utility.getIntegratedCircuit(2), GT_Values.NF, GT_Values.NF, CustomItemList.LapotronDust.get(5L), 600, 480);
        GT_Values.RA.addAutoclaveRecipe(CustomItemList.LapotronDust.get(3L), Materials.EnergeticAlloy.getMolten(576L), CustomItemList.RawLapotronCrystal.get(1L), 10000, 2400, 480);
        GT_Values.RA.addAutoclaveRecipe(CustomItemList.LapotronDust.get(3L), Materials.VibrantAlloy.getMolten(288L), CustomItemList.RawLapotronCrystal.get(1L), 10000, 1200, 480);
        //Faster cutting
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_HPIC.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_HPIC.get(8L), GT_Values.NI, 900, 7860, true);
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_UHPIC.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_UHPIC.get(8L), GT_Values.NI, 225, 30720, true);
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_NPIC.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_NPIC.get(8L), GT_Values.NI, 58, 122880, true);
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_PPIC.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_PPIC.get(8L), GT_Values.NI, 20, 500000, true);
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_QPIC.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_QPIC.get(8L), GT_Values.NI, 20, 2000000, true);
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_NanoCPU.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_NanoCPU.get(8L), GT_Values.NI, 900, 480, true);
        GT_Values.RA.addCutterRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_QuantumCPU.get(1L), GT_Values.NI, gregtech.api.enums.ItemList.Circuit_Chip_QuantumCPU.get(4L), GT_Values.NI, 900, 1920, true);
        //Faster Production
        GT_Values.RA.addChemicalRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_PIC.get(1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.IndiumGalliumPhosphide, 2), Materials.VanadiumGallium.getMolten(288L), GT_Values.NF, gregtech.api.enums.ItemList.Circuit_Wafer_HPIC.get(1L), GT_Values.NI, 1200, 7860, true);
        GT_Values.RA.addChemicalRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_HPIC.get(1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.IndiumGalliumPhosphide, 8), Materials.Naquadah.getMolten(576L), GT_Values.NF, gregtech.api.enums.ItemList.Circuit_Wafer_UHPIC.get(1L), GT_Values.NI, 400, 30720, true);
        GT_Values.RA.addChemicalRecipe(gregtech.api.enums.ItemList.Circuit_Wafer_NPIC.get(1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.IndiumGalliumPhosphide, 64), Materials.Sunnarium.getMolten(1440L), GT_Values.NF, gregtech.api.enums.ItemList.Circuit_Wafer_PPIC.get(1L), GT_Values.NI, 100, 122880, true);








    }
    enum Voltage {
        ULV, LV, MV,
        HV, EV, IV,
        LUV, ZPM, UV,
        UHV, UEV, UIV,
        UMV, UXV, OpV,
        MAX;
        public int getVoltage() {
            return (int) (V[this.ordinal()] / 1.5);
        }

    }
}
