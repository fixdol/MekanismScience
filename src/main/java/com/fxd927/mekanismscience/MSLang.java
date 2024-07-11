package com.fxd927.mekanismscience;

import mekanism.api.text.ILangEntry;
import net.minecraft.Util;

public enum MSLang  implements ILangEntry {
    MEKANISM_SCIENCE("constants","mod_name");

    private final String key;

    MSLang(String type,String path){
        this(Util.makeDescriptionId(type, MekanismScience.rl(path)));
    }

    MSLang(String key){
        this.key = key;
    }

    @Override
    public String getTranslationKey(){
        return key;
    }
}
