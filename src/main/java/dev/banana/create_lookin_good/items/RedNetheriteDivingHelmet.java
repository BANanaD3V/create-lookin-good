package dev.banana.create_lookin_good.items;

import com.simibubi.create.content.equipment.armor.DivingHelmetItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;


public class RedNetheriteDivingHelmet extends DivingHelmetItem {
    public RedNetheriteDivingHelmet(Settings settings) {
        super(ArmorMaterials.NETHERITE, settings, new Identifier("red_netherite_diving_helmet"));
    }

}
