package net.crys.elementoresmod.item.custom;

import net.crys.elementoresmod.ElementOresMod;
import net.crys.elementoresmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    // Assume we have a DeferredRegister<CreativeModeTab> called CREATIVE_TAB_REGISTRAR
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_REGISTRAR =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB,ElementOresMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELEMENTORES_TAB = CREATIVE_TAB_REGISTRAR.register("elementores_tab",
            () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("creativetab.elementores_tab"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(ModItems.FIRE_STONE_SWORD.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                output.accept(ModItems.FIRE_STONE.get());
                output.accept(ModItems.FIRE_STONE_SWORD.get());
                output.accept(Items.AMETHYST_SHARD);
                output.accept(ModBlocks.FIRESTONE_ORE.get());
            })
            .build());

    public static void register(IEventBus eventBus){CREATIVE_TAB_REGISTRAR.register(eventBus);}
}
