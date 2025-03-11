package net.crys.elementoresmod.item;


import net.crys.elementoresmod.ElementOresMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementOresMod.MOD_ID);

    public static final RegistryObject<Item> FIRE_STONE =
            ITEMS.register("firestone",()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_STONE_SWORD =
            ITEMS.register("firestone_sword",()->new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}

}
