package dev.banana.create_lookin_good.items;

import com.simibubi.create.content.equipment.armor.DivingHelmetItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.util.Identifier;


public class LimeNetheriteDivingHelmet extends DivingHelmetItem {
    public LimeNetheriteDivingHelmet(Settings settings) {
        super(ArmorMaterials.NETHERITE, settings, new Identifier("lime_netherite_diving_helmet"));
    }

}
