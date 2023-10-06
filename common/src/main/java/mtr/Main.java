package mtr;

import net.minecraft.world.item.Item;

import java.util.function.BiConsumer;

public class Main{
	public static final String MOD_ID = "highrails";
	public static void init(BiConsumer<String, RegistryObject<Item>> registerItem ) {
		registerItem.accept("rail_connector_450", HighRailItems.RAIL_CONNECTOR_450);
		registerItem.accept("rail_connector_500", HighRailItems.RAIL_CONNECTOR_500);
		registerItem.accept("rail_connector_600", HighRailItems.RAIL_CONNECTOR_600);
		registerItem.accept("rail_connector_700", HighRailItems.RAIL_CONNECTOR_700);
		registerItem.accept("rail_connector_800", HighRailItems.RAIL_CONNECTOR_800);
		registerItem.accept("rail_connector_450_one_way", HighRailItems.RAIL_CONNECTOR_450_ONE_WAY);
		registerItem.accept("rail_connector_500_one_way", HighRailItems.RAIL_CONNECTOR_500_ONE_WAY);
		registerItem.accept("rail_connector_600_one_way", HighRailItems.RAIL_CONNECTOR_600_ONE_WAY);
		registerItem.accept("rail_connector_700_one_way", HighRailItems.RAIL_CONNECTOR_700_ONE_WAY);
		registerItem.accept("rail_connector_800_one_way", HighRailItems.RAIL_CONNECTOR_800_ONE_WAY);
	}
}
