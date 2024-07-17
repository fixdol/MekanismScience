package com.fxd927.mekanismscience.registries;

import com.fxd927.mekanismscience.MekanismScience;
import mekanism.api.text.EnumColor;
import mekanism.common.registration.impl.ItemDeferredRegister;
import mekanism.common.registration.impl.ItemRegistryObject;
import net.minecraft.world.item.Item;

public class MSItems {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(MekanismScience.MODID);

    public static final ItemRegistryObject<Item> NEUTRON_SOURCE_PELLET = ITEMS.register("pellet_neutron_source", EnumColor.YELLOW);

    private MSItems(){
    }
}
