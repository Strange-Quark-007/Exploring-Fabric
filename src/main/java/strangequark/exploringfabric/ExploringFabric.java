package strangequark.exploringfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strangequark.exploringfabric.block.ModBlocks;
import strangequark.exploringfabric.item.ModItemGroups;
import strangequark.exploringfabric.item.ModItems;

public class ExploringFabric implements ModInitializer {
    public static final String MOD_ID = "exploringfabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();

        CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER, 0.2f);
        FuelRegistryEvents.BUILD.register((builder, context) ->
                builder.add(ModItems.STARLIGHT_ASHES, 4 * 10 * 20));
    }
}