package com.fxd927.mekanismscience.gas;

import mekanism.common.base.IChemicalConstant;

public enum MSChemicalConstants implements IChemicalConstant {
    AMMONIA("ammonia",0xFFC8B3FF,0,240F,0.6942F),
    BERYLLIUM("beryllium",0xFF00DB1B,0,1560.15F,1850F),
    COMPRESSED_AIR("compressed_air",0xFFF7F3F3,0,83.15F,1.293F),
    HELIUM("helium", 0xFFE0F0FF, 0, 4.22F, 124.9F),
    SUPERHEATED_HELIUM("superheated_helium", 0xFFFFDDB5, 0, 2_000F, 124.9F),
    STRONTIUM("strontium", 0xFFFFC1B2, 0, 1050.15F, 2375F),
    NITROGEN("nitrogen",0xFFFA8FF0,0,	77.36F,1.251F),
    YTTRIUM("yttrium", 0xFFCCE5FF, 0, 1799.15F, 4240F);

    private final String name;
    private final int color;
    private final int lightLevel;
    private final float temperature;
    private final float density;

    MSChemicalConstants(String name,int color,int lightLevel,float temperature,float density){
        this.name = name;
        this.color = color;
        this.lightLevel = lightLevel;
        this.temperature = temperature;
        this.density = density;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getColor(){
        return color;
    }

    @Override
    public int getLightLevel() {
        return lightLevel;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    @Override
    public float getDensity() {
        return density;
    }

}
