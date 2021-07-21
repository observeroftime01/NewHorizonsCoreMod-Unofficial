package com.dreammaster.gthandler;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TC_Aspects;
import gregtech.api.objects.ItemData;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.common.items.GT_MetaGenerated_Item_01;

/*
 * 
 */
public class GT_Loader_Batteries
{
	public void run()
	{
		GT = GT_MetaGenerated_Item_01.INSTANCE;
		registerBatteries();
	}

	private GT_MetaGenerated_Item_01 GT;
	
	private void registerBatteries()
	{
		// 500 - 502: LV, MV, HV Hull
		// Range 545 to 596 is free, as of GT 5.08.30
		// 600+ Are motors, covers, belts, etc.
		int tLastID;
		
		// Empty battery hulls
		CustomItemList.BatteryHull_EV.set(GT.addItem(503, "Small Sunnarium Battery (Empty)", "An empty EV Battery Container", new Object[] { new ItemData(Materials.BlueSteel, OrePrefixes.plate.mMaterialAmount * 2L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 8L) }));
		CustomItemList.BatteryHull_IV.set(GT.addItem(504, "Medium Sunnarium Battery (Empty)", "An empty IV Battery Container", new Object[] { new ItemData(Materials.RoseGold, OrePrefixes.plate.mMaterialAmount * 6L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 16L) }));
		CustomItemList.BatteryHull_LuV.set(GT.addItem(505, "Large Sunnarium Battery (Empty)", "An empty LuV Battery Container", new Object[] { new ItemData(Materials.RedSteel, OrePrefixes.plate.mMaterialAmount * 18L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 32L) }));
		CustomItemList.BatteryHull_ZPM.set(GT.addItem(506, "Medium Naquadria Battery (Empty)", "An empty ZPM Energy Storage", new Object[] { new ItemData(Materials.Europium, OrePrefixes.plate.mMaterialAmount * 6L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 64L) }));
		CustomItemList.BatteryHull_UV.set(GT.addItem(507, "Large Naquadria Battery (Empty)", "An empty UV Energy Storage", new Object[] { new ItemData(Materials.Americium, OrePrefixes.plate.mMaterialAmount * 18L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 128L) }));
		CustomItemList.BatteryHull_UHV.set(GT.addItem(561, "Small Neutronium Battery (Empty)", "An empty UHV Energy Storage", new Object[] { new ItemData(Materials.Naquadah, OrePrefixes.plate.mMaterialAmount * 24L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 256L) }));
		CustomItemList.BatteryHull_UHV_Large.set(GT.addItem(567, "Extra Large Neutronium Battery (Empty)", "An empty Extra Large UHV Energy Storage", new Object[] { new ItemData(Materials.Naquadah, OrePrefixes.plate.mMaterialAmount * 24L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 256L) }));
		CustomItemList.BatteryHull_UEV.set(GT.addItem(562, "Medium Neutronium Battery (Empty)", "An empty UEV Energy Storage", new Object[] { new ItemData(Materials.NaquadahEnriched, OrePrefixes.plate.mMaterialAmount * 36L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 512L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 512L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 512L) }));
		CustomItemList.BatteryHull_UIV.set(GT.addItem(563, "Large Neutronium Battery (Empty)", "An empty UIV Energy Storage", new Object[] { new ItemData(Materials.NaquadahAlloy, OrePrefixes.plate.mMaterialAmount * 48L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 1024L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 1024L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 1024L) }));
		CustomItemList.BatteryHull_UMV.set(GT.addItem(564, "Medium Plasma Battery (Empty)", "An empty UMV Energy Storage", new Object[] { new ItemData(Materials.Neutronium, OrePrefixes.plate.mMaterialAmount * 56L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 2048L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 2048L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 2048L) }));
		CustomItemList.BatteryHull_UxV.set(GT.addItem(565, "Large Plasma Battery (Empty)", "An empty UXV Energy Storage", new Object[] { new ItemData(Materials.DraconiumAwakened, OrePrefixes.plate.mMaterialAmount * 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 4096L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 4096L), new TC_Aspects.TC_AspectStack(TC_Aspects.VACUOS, 4096L) }));

		// Recipes
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Aluminium, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlueSteel, 2L), Materials.Polytetrafluoroethylene.getMolten(144L),
				CustomItemList.BatteryHull_EV.get(1L), 100, 480);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Platinum, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.RoseGold, 6L), Materials.Polytetrafluoroethylene.getMolten(288L),
				CustomItemList.BatteryHull_IV.get(1L), 200, 1920);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.Naquadah, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.RedSteel, 18L), Materials.Polybenzimidazole.getMolten(144L),
				CustomItemList.BatteryHull_LuV.get(1L),  300, 7680);
		
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.NaquadahAlloy, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Europium, 6L), Materials.Polybenzimidazole.getMolten(288L),
				CustomItemList.BatteryHull_ZPM.get(1L), 200, 30720);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt01, Materials.ElectrumFlux, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Americium, 18L), Materials.Polybenzimidazole.getMolten(576L),
				CustomItemList.BatteryHull_UV.get(1L), 300, 122880);

		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.ElectrumFlux, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Naquadah, 24L), Materials.Polybenzimidazole.getMolten(1152L),
				CustomItemList.BatteryHull_UHV.get(1L), 100, 500000);

		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt04, Materials.ElectrumFlux, 16L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Naquadah, 48L), Materials.Polybenzimidazole.getMolten(1152L),
				CustomItemList.BatteryHull_UHV_Large.get(1L), 2400, 500000);

		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt04, Materials.ElectrumFlux, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NaquadahEnriched, 36L), Materials.Polybenzimidazole.getMolten(2304L),
				CustomItemList.BatteryHull_UEV.get(1L), 200, 2000000);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.cableGt08, Materials.ElectrumFlux, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NaquadahAlloy, 48L), Materials.Polybenzimidazole.getMolten(4608L),
				CustomItemList.BatteryHull_UIV.get(1L), 300, 2000000);

		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt16, Materials.SuperconductorUHV, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 56L), Materials.Polybenzimidazole.getMolten(9216L),
				CustomItemList.BatteryHull_UMV.get(1L), 600, 2000000);
		GT_Values.RA.addAssemblerRecipe(GT_OreDictUnificator.get(OrePrefixes.wireGt16, Materials.SuperconductorUHV, 2L),
				GT_OreDictUnificator.get(OrePrefixes.plate, Materials.DraconiumAwakened, 64L), Materials.Polybenzimidazole.getMolten(18432L),
				CustomItemList.BatteryHull_UxV.get(1L), 1200, 2000000);

		// Actually filled hulls.
		// I added a gap of 5 to each filled hull, so 4 additional batteries are possible for each voltage tier
		CustomItemList.BatteryHull_EV_Full.set(GT.addItem(tLastID = 540, "Small Sunnarium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 8L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 8L)}));
	    GT.setElectricStats(32000 + tLastID, 6400000L, GT_Values.V[4], 4L, -3L, true);
	    
		CustomItemList.BatteryHull_IV_Full.set(GT.addItem(tLastID = 545, "Medium Sunnarium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 16L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 16L)}));
	    GT.setElectricStats(32000 + tLastID, 25600000L, GT_Values.V[5], 5L, -3L, true);
	    
		CustomItemList.BatteryHull_LuV_Full.set(GT.addItem(tLastID = 550, "Large Sunnarium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 32L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 32L)}));
	    GT.setElectricStats(32000 + tLastID, 102400000L, GT_Values.V[6], 6L, -3L, true);
	    
		CustomItemList.BatteryHull_ZPM_Full.set(GT.addItem(tLastID = 555, "Medium Naquadria Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 64L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 64L)}));
	    GT.setElectricStats(32000 + tLastID, 409600000L, GT_Values.V[7], 7L, -3L, true);
	    
		CustomItemList.BatteryHull_UV_Full.set(GT.addItem(tLastID = 560, "Large Naquadria Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 128L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 128L)}));
	    GT.setElectricStats(32000 + tLastID, 1638400000L, GT_Values.V[8], 8L, -3L, true);

		CustomItemList.BatteryHull_UHV_Full.set(GT.addItem(tLastID = 570, "Small Neutronium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 256L)}));
		GT.setElectricStats(32000 + tLastID, 6553600000L, GT_Values.V[9], 9L, -3L, true);

		CustomItemList.BatteryHull_UHV_Large_Full.set(GT.addItem(tLastID = 571, "Extra Large Neutronium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 256L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 256L)}));
		GT.setElectricStats(32000 + tLastID, 1677721600000L, GT_Values.V[9], 9L, -3L, true);

		CustomItemList.BatteryHull_UEV_Full.set(GT.addItem(tLastID = 575, "Medium Neutronium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 512L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 512L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 512L)}));
		GT.setElectricStats(32000 + tLastID, 26214400000L, GT_Values.V[10], 10L, -3L, true);

		CustomItemList.BatteryHull_UIV_Full.set(GT.addItem(tLastID = 580, "Large Neutronium Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 1024L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 1024L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 1024L)}));
		GT.setElectricStats(32000 + tLastID, 104857600000L, GT_Values.V[11], 11L, -3L, true);

		CustomItemList.BatteryHull_UMV_Full.set(GT.addItem(tLastID = 585, "Medium Infinity Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 2048L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 2048L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 2048L)}));
		GT.setElectricStats(32000 + tLastID, 419430400000L, GT_Values.V[12], 12L, -3L, true);

		CustomItemList.BatteryHull_UxV_Full.set(GT.addItem(tLastID = 590, "Large Infinity Battery", "Reusable", new Object[]{new TC_Aspects.TC_AspectStack(TC_Aspects.ELECTRUM, 4096L), new TC_Aspects.TC_AspectStack(TC_Aspects.METALLUM, 4096L), new TC_Aspects.TC_AspectStack(TC_Aspects.POTENTIA, 4096L)}));
		GT.setElectricStats(32000 + tLastID, 1677721600000L, GT_Values.V[13], 13L, -3L, true);

	    // Just to be complete, extractor recipes for the filled hulls
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_EV_Full.get(1L), CustomItemList.BatteryHull_EV.get(1L));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_IV_Full.get(1L), CustomItemList.BatteryHull_IV.get(1L));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_LuV_Full.get(1L), CustomItemList.BatteryHull_LuV.get(1L));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_ZPM_Full.get(1L), CustomItemList.BatteryHull_ZPM.get(1L));
	    GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UV_Full.get(1L), CustomItemList.BatteryHull_UV.get(1L));
		GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UHV_Full.get(1L), CustomItemList.BatteryHull_UHV.get(1L));
		GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UHV_Large_Full.get(1L), CustomItemList.BatteryHull_UHV_Large.get(1L));
		GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UEV_Full.get(1L), CustomItemList.BatteryHull_UEV.get(1L));
		GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UIV_Full.get(1L), CustomItemList.BatteryHull_UIV.get(1L));
		GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UMV_Full.get(1L), CustomItemList.BatteryHull_UMV.get(1L));
		GT_ModHandler.addExtractionRecipe(CustomItemList.BatteryHull_UxV_Full.get(1L), CustomItemList.BatteryHull_UxV.get(1L));

	    // Recipes to actually fill the empty hulls with content
	    // IV 2048
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 4L),
	    		CustomItemList.BatteryHull_EV.get(1L),
	    		CustomItemList.BatteryHull_EV_Full.get(1L),
	    		null, 100, 480);

	    // EV 8192
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 16L),
	    		CustomItemList.BatteryHull_IV.get(1L),
	    		CustomItemList.BatteryHull_IV_Full.get(1L),
	    		null, 150, 1024);
	    
	    // LuV 32768
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sunnarium, 32L),
	    		CustomItemList.BatteryHull_LuV.get(1L),
	    		CustomItemList.BatteryHull_LuV_Full.get(1L),
	    		null, 200, 1920);
	    
	    // ZPM 131072
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 16L),
	    		CustomItemList.BatteryHull_ZPM.get(1L),
	    		CustomItemList.BatteryHull_ZPM_Full.get(1L),
	    		null, 250, 4096);
	    
	    // UV 524288
	    GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 32L),
	    		CustomItemList.BatteryHull_UV.get(1L),
	    		CustomItemList.BatteryHull_UV_Full.get(1L),
	    		null, 300, 7860);

		// UHV 2097152
		GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Neutronium, 16L),
				CustomItemList.BatteryHull_UHV.get(1L),
				CustomItemList.BatteryHull_UHV_Full.get(1L),
				null, 350, 15720);

		GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.CosmicNeutronium, 16L),
				CustomItemList.BatteryHull_UHV_Large.get(1L),
				CustomItemList.BatteryHull_UHV_Full.get(1L),
				null, 350, 15720);

		// UEV 8388608
		GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Neutronium, 32L),
				CustomItemList.BatteryHull_UEV.get(1L),
				CustomItemList.BatteryHull_UEV_Full.get(1L),
				null, 400, 31440);

		// UIV 33554432
		GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Neutronium, 64L),
				CustomItemList.BatteryHull_UIV.get(1L),
				CustomItemList.BatteryHull_UIV_Full.get(1L),
				null, 450, 62880);

		// UMV 134217728
		GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Infinity, 4L),
				CustomItemList.BatteryHull_UMV.get(1L),
				CustomItemList.BatteryHull_UMV_Full.get(1L),
				null, 500, 125760);

		// UxV 536870912
		GT_Values.RA.addCannerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Infinity, 8L),
				CustomItemList.BatteryHull_UxV.get(1L),
				CustomItemList.BatteryHull_UxV_Full.get(1L),
				null, 600, 251520);
	}
}
