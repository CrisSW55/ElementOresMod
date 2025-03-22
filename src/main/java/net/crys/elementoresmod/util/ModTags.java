package net.crys.elementoresmod.util;

import net.crys.elementoresmod.ElementOresMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_FIRESTONE_TOOL =
                tag("needs_firestone_tool");

        private static TagKey<Block> tag(String name){
            // Found in the: net.minecraft.tags.BlockTags;
            //The method below creates TagKey<Block>
            //public static TagKey<Block> create(ResourceLocation name) {
            //        return TagKey.create(Registries.BLOCK, name);
            //    }
            return BlockTags.create(new ResourceLocation(ElementOresMod.MOD_ID,name));
        }
    }

    public static class Items{
        private static TagKey<Item>tag(String name){
            return ItemTags.create(new ResourceLocation(ElementOresMod.MOD_ID,name));
        }
    }
}
