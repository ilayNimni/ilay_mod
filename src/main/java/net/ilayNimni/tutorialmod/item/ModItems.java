package net.ilayNimni.tutorialmod.item;

import net.ilayNimni.tutorialmod.TutorialMod;
import net.ilayNimni.tutorialmod.block.ModBlocks;
import net.ilayNimni.tutorialmod.item.custom.EightBallItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> BLUEBERRY_SEEDS = ITEMS.register("blueberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<SwordItem> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(null, 5, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<ShovelItem> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(null, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<PickaxeItem> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(null, 2, 2.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<AxeItem> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(null, 3, 3.5f, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<HoeItem> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new HoeItem(null, 0, 0, new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static class Tiers {
        public static final Tier ZIRCON = new ForgeTier(
                3,
                800,
                1.5f,
                3,
                350,
                null,
                () -> Ingredient.of(ModItems.ZIRCON.get()));
    }



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
