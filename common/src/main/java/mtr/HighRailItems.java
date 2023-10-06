package mtr;

import mtr.data.RailType;
import mtr.item.ItemRailModifier;
import net.minecraft.world.item.Item;

public interface HighRailItems{
    RegistryObject<Item> RAIL_CONNECTOR_450 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.NETHERITE));
    RegistryObject<Item> RAIL_CONNECTOR_500 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.PURPUR));
    RegistryObject<Item> RAIL_CONNECTOR_600 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.REINFORCED_DEEPSLATE));
    RegistryObject<Item> RAIL_CONNECTOR_700 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.BARRIER));
    RegistryObject<Item> RAIL_CONNECTOR_800 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.BEDROCK));
    RegistryObject<Item> RAIL_CONNECTOR_450_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.NETHERITE));
    RegistryObject<Item> RAIL_CONNECTOR_500_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.PURPUR));
    RegistryObject<Item> RAIL_CONNECTOR_600_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.REINFORCED_DEEPSLATE));
    RegistryObject<Item> RAIL_CONNECTOR_700_ONE_WAY= new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.BARRIER));
    RegistryObject<Item> RAIL_CONNECTOR_800_ONE_WAY= new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.BEDROCK));
    RegistryObject<Item> RAIL_CONNECTOR_20 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.WOODEN));
    RegistryObject<Item> RAIL_CONNECTOR_20_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.WOODEN));
    RegistryObject<Item> RAIL_CONNECTOR_40 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.STONE));
    RegistryObject<Item> RAIL_CONNECTOR_40_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.STONE));
    RegistryObject<Item> RAIL_CONNECTOR_60 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.EMERALD));
    RegistryObject<Item> RAIL_CONNECTOR_60_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.EMERALD));
    RegistryObject<Item> RAIL_CONNECTOR_80 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.IRON));
    RegistryObject<Item> RAIL_CONNECTOR_80_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.IRON));
    RegistryObject<Item> RAIL_CONNECTOR_120 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.OBSIDIAN));
    RegistryObject<Item> RAIL_CONNECTOR_120_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.OBSIDIAN));
    RegistryObject<Item> RAIL_CONNECTOR_160 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.BLAZE));
    RegistryObject<Item> RAIL_CONNECTOR_160_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.BLAZE));
    RegistryObject<Item> RAIL_CONNECTOR_200 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.QUARTZ));
    RegistryObject<Item> RAIL_CONNECTOR_200_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.QUARTZ));
    RegistryObject<Item> RAIL_CONNECTOR_300 = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.DIAMOND));
    RegistryObject<Item> RAIL_CONNECTOR_300_ONE_WAY = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, true, RailType.DIAMOND));
    RegistryObject<Item> RAIL_CONNECTOR_PLATFORM = new RegistryObject<>(() -> new ItemRailModifier(true, true, true, false, RailType.PLATFORM));
    RegistryObject<Item> RAIL_CONNECTOR_SIDING = new RegistryObject<>(() -> new ItemRailModifier(true, true, true, false, RailType.SIDING));
    RegistryObject<Item> RAIL_CONNECTOR_TURN_BACK = new RegistryObject<>(() -> new ItemRailModifier(true, false, true, false, RailType.TURN_BACK));
    RegistryObject<Item> RAIL_CONNECTOR_CABLE_CAR = new RegistryObject<>(() -> new ItemRailModifier(false, true, false, true, RailType.CABLE_CAR));
    RegistryObject<Item> RAIL_CONNECTOR_RUNWAY = new RegistryObject<>(() -> new ItemRailModifier(false, false, true, true, RailType.RUNWAY));
    public class RegisterItem {
    }

    public class RegisterBlockItem {
    }
}
