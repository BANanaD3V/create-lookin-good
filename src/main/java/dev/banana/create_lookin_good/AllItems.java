package dev.banana.create_lookin_good;

import com.simibubi.create.foundation.item.ItemDescription;
import com.tterrag.registrate.util.entry.ItemEntry;
import dev.banana.create_lookin_good.items.*;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import static com.simibubi.create.AllTags.forgeItemTag;
import static dev.banana.create_lookin_good.CreateLookinGood.REGISTRATE;

public class AllItems {
    public static final ItemEntry<BlackNetheriteDivingHelmet> BLACK_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("black_netherite_diving_helmet", BlackNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<BlueNetheriteDivingHelmet> BLUE_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("blue_netherite_diving_helmet", BlueNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<BrownNetheriteDivingHelmet> BROWN_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("brown_netherite_diving_helmet", BrownNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<CyanNetheriteDivingHelmet> CYAn_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("cyan_netherite_diving_helmet", CyanNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<GreenNetheriteDivingHelmet> GREEN_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("green_netherite_diving_helmet", GreenNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<GrayNetheriteDivingHelmet> GRAY_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("gray_netherite_diving_helmet", GrayNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<LightBlueNetheriteDivingHelmet> LIGHT_BLUE_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("light_blue_netherite_diving_helmet", LightBlueNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<LightGrayNetheriteDivingHelmet> LIGHT_GRAY_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("light_gray_netherite_diving_helmet", LightGrayNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<LimeNetheriteDivingHelmet> LIME_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("lime_netherite_diving_helmet", LimeNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<MagentaNetheriteDivingHelmet> MAGENTA_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("magenta_netherite_diving_helmet", MagentaNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<OrangeNetheriteDivingHelmet> ORANGE_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("orange_netherite_diving_helmet", OrangeNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<PinkNetheriteDivingHelmet> PINK_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("pink_netherite_diving_helmet", PinkNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<PurpleNetheriteDivingHelmet> PURPLE_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("purple_netherite_diving_helmet", PurpleNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<RedNetheriteDivingHelmet> RED_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("red_netherite_diving_helmet", RedNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<WhiteNetheriteDivingHelmet> WHITE_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("white_netherite_diving_helmet", WhiteNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();

    public static final ItemEntry<YellowNetheriteDivingHelmet> YELLOW_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("yellow_netherite_diving_helmet", YellowNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();


    public static void register() {}
}
