package com.dk0124.cdr.constants.vendor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorType {
    UPBIT("upbit"),
    BITHUMB("bithumb");

    public static VendorType fromString(String str){
        for(VendorType code :VendorType.values()){
            if(code.name.equals(str))
                return code;
        }
        return null;
    }
    public String name;
}
