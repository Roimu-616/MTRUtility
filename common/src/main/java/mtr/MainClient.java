package mtr;

import mtr.item.ItemBlockClickingBase;


public class MainClient {
    public static void registerItem () {
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_450.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_500.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_600.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_700.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_800.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_450_ONE_WAY.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_500_ONE_WAY.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_600_ONE_WAY.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_700_ONE_WAY.get(), ItemBlockClickingBase.TAG_POS);
        RegistryClient.registerItemModelPredicate(Main.MOD_ID + "selected", HighRailItems.RAIL_CONNECTOR_800_ONE_WAY.get(), ItemBlockClickingBase.TAG_POS);
    }
}

