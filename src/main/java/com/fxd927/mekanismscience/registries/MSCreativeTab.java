package com.fxd927.mekanismscience.registries;

import com.fxd927.mekanismscience.MSLang;
import com.fxd927.mekanismscience.MekanismScience;
import mekanism.common.Mekanism;
import mekanism.common.registration.impl.CreativeTabDeferredRegister;
import mekanism.common.registration.impl.CreativeTabRegistryObject;
import mekanism.common.registries.MekanismBlocks;
import mekanism.common.registries.MekanismCreativeTabs;

public class MSCreativeTab {
    public static final CreativeTabDeferredRegister CREATIVE_TABS = new CreativeTabDeferredRegister(MekanismScience.MODID);

    public static final CreativeTabRegistryObject MEKANISM_SCIENCE = CREATIVE_TABS.registerMain(MSLang.MEKANISM_SCIENCE, MekanismBlocks.METALLURGIC_INFUSER, builder ->
              builder.withBackgroundLocation(MekanismScience.rl("textures/gui/creative_tab.png"))
                      .withSearchBar(70)
                      .withTabsBefore(MekanismCreativeTabs.MEKANISM.key())
                      .displayItems((displayParameters, output) -> {
                          CreativeTabDeferredRegister.addToDisplay(MSItems.ITEMS, output);
                        CreativeTabDeferredRegister.addToDisplay(MSFluids.FLUIDS, output);
                    })
    );
}
