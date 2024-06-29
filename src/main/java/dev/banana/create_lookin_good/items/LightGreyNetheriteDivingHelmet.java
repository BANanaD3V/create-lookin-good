package dev.banana.create_lookin_good.items;

import com.simibubi.create.content.equipment.armor.DivingHelmetItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.util.Identifier;


public class LightGreyNetheriteDivingHelmet extends DivingHelmetItem {
    public LightGreyNetheriteDivingHelmet(Settings settings) {
        super(ArmorMaterials.NETHERITE, settings, new Identifier("light_grey_netherite_diving_helmet"));
    }

}
