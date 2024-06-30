package com.fxd927.mekanismscience.mixin;

import mekanism.api.chemical.gas.attribute.GasAttributes;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GasAttributes.Coolant.class)
public abstract class MixinCoolant {

    @Mutable
    @Shadow
    private double thermalEnthalpy;

    @Mutable
    @Shadow
    private double conductivity;

    private MixinCoolant(double thermalEnthalpy,double conductivity){
        if (conductivity > 1.0){
            this.thermalEnthalpy = thermalEnthalpy;
            this.conductivity = conductivity;
        }else return;
    }
}
