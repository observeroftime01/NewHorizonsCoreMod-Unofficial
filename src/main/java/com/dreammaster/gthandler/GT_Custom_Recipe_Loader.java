package com.dreammaster.gthandler;

import com.dreammaster.item.ItemList;
import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.OrePrefixes.*;
import static gregtech.api.enums.Materials.*;

public class GT_Custom_Recipe_Loader implements Runnable{

    public void run() {

        //Assembler Recipes
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{CustomItemList.ChargedCertusQuartzDust.get(4L), GT_OreDictUnificator.get(circuit, Primitive, 2L), com.dreammaster.item.ItemList.LogicProcessorItemGoldCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 35), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Basic, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 35), com.dreammaster.item.ItemList.LogicProcessorItemGoldCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 36), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Good, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 36), ItemList.EngineeringProcessorItemDiamondCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 37), 20, 32);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{GT_OreDictUnificator.get(circuit, Advanced, 2), GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 2L, 37), ItemList.EngineeringProcessorItemDiamondCore.getIS(1)}, null, GT_ModHandler.getModItem("appliedenergistics2", "item.ItemMultiMaterial", 1L, 38), 20, 32);


    }
}
