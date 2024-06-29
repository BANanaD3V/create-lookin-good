package dev.banana.create_lookin_good;

import com.simibubi.create.foundation.item.ItemDescription;
import com.tterrag.registrate.util.entry.ItemEntry;
import dev.banana.create_lookin_good.items.RedNetheriteDivingHelmet;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;

import static com.simibubi.create.AllTags.forgeItemTag;
import static dev.banana.create_lookin_good.CreateLookinGood.REGISTRATE;

public class AllItems {
    public static final ItemEntry<RedNetheriteDivingHelmet> RED_NETHERITE_DIVING_HELMET = REGISTRATE
            .item("red_netherite_diving_helmet", RedNetheriteDivingHelmet::new)
            .onRegisterAfter(RegistryKeys.ITEM, v -> ItemDescription.useKey(v, "item.create.netherite_diving_helmet"))
            .properties(Item.Settings::fireproof)
            .tag(forgeItemTag("helmets"))
            .register();
    public static void register() {}
}
