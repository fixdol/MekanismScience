package com.fxd927.mekanismscience.registries;

import com.fxd927.mekanismscience.MekanismScienceMod;
import com.fxd927.mekanismscience.gas.MSChemicalConstants;
import mekanism.api.chemical.attribute.ChemicalAttribute;
import mekanism.api.chemical.gas.Gas;
import mekanism.api.chemical.gas.attribute.GasAttributes;
import mekanism.api.math.FloatingLong;
import mekanism.common.registration.impl.GasDeferredRegister;
import mekanism.common.registration.impl.GasRegistryObject;

public class MSGases {
    public static final GasDeferredRegister GASES = new GasDeferredRegister(MekanismScienceMod.MODID);

    public static final GasRegistryObject<Gas> AMERICIUM;
    public static final GasRegistryObject<Gas> AMMONIA;
    public static final GasRegistryObject<Gas> BERYLLIUM;
    public static final GasRegistryObject<Gas> CALIFORNIUM;
    public static final GasRegistryObject<Gas> CURIUM;
    public static final GasRegistryObject<Gas> HELIUM;
    public static final GasRegistryObject<Gas> SUPERHEATED_HELIUM;
    public static final GasRegistryObject<Gas> STRONTIUM;
    public static final GasRegistryObject<Gas> YTTRIUM;

    private MSGases(){
    }
    
    static {
        AMERICIUM = GASES.register("americium", 13983840, new GasAttributes.Radiation(0.05));
        AMMONIA = GASES.register(MSChemicalConstants.AMMONIA, new GasAttributes.Fuel(1, FloatingLong.create(1000)));
        BERYLLIUM = GASES.register(MSChemicalConstants.BERYLLIUM);
        CALIFORNIUM = GASES.register("californium",0xFFF08B00, new GasAttributes.Radiation(1.00));
        CURIUM = GASES.register("curium",15725501, new GasAttributes.Radiation(0.07));
        HELIUM = GASES.register(MSChemicalConstants.HELIUM,Coolants.HELIUM_COOLANT);
        SUPERHEATED_HELIUM = GASES.register(MSChemicalConstants.SUPERHEATED_HELIUM,Coolants.HEATED_HELIUM_COOLANT);
        STRONTIUM = GASES.register(MSChemicalConstants.STRONTIUM);
        YTTRIUM = GASES.register(MSChemicalConstants.YTTRIUM);
    }

    public static class Coolants{

        private Coolants(){
        }

        public static final GasAttributes.CooledCoolant HELIUM_COOLANT = new GasAttributes.CooledCoolant(() -> SUPERHEATED_HELIUM.get(), 100, 1.5);
        public static final GasAttributes.HeatedCoolant HEATED_HELIUM_COOLANT = new GasAttributes.HeatedCoolant(() -> HELIUM.get(), 100, 1.5);
    }
}
