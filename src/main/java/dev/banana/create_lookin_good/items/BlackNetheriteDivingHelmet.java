package dev.banana.create_lookin_good.items;

import com.simibubi.create.content.equipment.armor.DivingHelmetItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.util.Identifier;


public class BlackNetheriteDivingHelmet extends DivingHelmetItem {
    public BlackNetheriteDivingHelmet(Settings settings) {
        super(ArmorMaterials.NETHERITE, settings, new Identifier("black_netherite_diving_helmet"));
    }

}
