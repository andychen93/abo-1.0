package com.cl.common.util;

public class StringUtils {

    public static boolean isNotEmpty(String string){
        if(string!=null&&!"".equals(string)){
            return true;
        }
        return false;
    }

}
