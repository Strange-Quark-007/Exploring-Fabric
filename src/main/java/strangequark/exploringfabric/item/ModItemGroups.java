package strangequark.exploringfabric.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import strangequark.exploringfabric.ExploringFabric;
import strangequark.exploringfabric.block.ModBlocks;

import static strangequark.exploringfabric.block.ModBlocks.PINK_GARNET_DEEPSLATE_ORE;
import static strangequark.exploringfabric.block.ModBlocks.PINK_GARNET_ORE;
import static strangequark.exploringfabric.utils.ModIdentifier.createIdentifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            createIdentifier("pink_garnet_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.exploringfabric.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    })
                    .build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            createIdentifier("pink_garnet_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.exploringfabric.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(PINK_GARNET_ORE);
                        entries.add(PINK_GARNET_DEEPSLATE_ORE);
                    })
                    .build());

    public static final ItemGroup MISC_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            createIdentifier("misc_mod_stuff"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.exploringfabric.misc_mod_stuff"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.STARLIGHT_ASHES);
                        entries.add(ModBlocks.MAGIC_BLOCK);
                    })
                    .build());

    public static void registerItemGroups() {
        ExploringFabric.LOGGER.info("Registering Item Groups for " + ExploringFabric.MOD_ID);
    }
}
