package com.skyLight.skyLight.tool;

public class CommonTool {

    public static short integerToShort(Integer integer){
        int i = integer.intValue();
        short s = (short)i;
        return new Short(s);
    }
}
