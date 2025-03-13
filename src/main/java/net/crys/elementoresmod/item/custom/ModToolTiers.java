package net.crys.elementoresmod.item.custom;

import net.crys.elementoresmod.ElementOresMod;
import net.crys.elementoresmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers implements Tier {
    public static final Tier FIRESTONE = TierSortingRegistry.registerTier(
            new ForgeTier(
                    5,
                    1500,
                    5,
                    4,
                    25,
                    ModTags.Blocks.NEEDS_FIRESTONE_TOOL,()-> Ingredient.of(ModItems.FIRE_STONE.get())),
                    new ResourceLocation(ElementOresMod.MOD_ID,"firestone"),
                    List.of(Tiers.NETHERITE),
                    List.of()
    );
    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
