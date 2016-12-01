/**
 * $id$
 * Copyright 2011-2012 Qihoo Inc. All rights reserved.
 */
package com.tomsky.androiddemo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author Zhitao Wang (zhitao.wang@360.cn)
 *
 */
public class StringUtil {

    public static boolean isEmpty(String str) {
        return (str == null || "".equals(str.trim()));
    }
    
    public static boolean isNotEmpty(String str) {
        return (str != null && !"".equals(str.trim()));
    }
    
    public static boolean isNumeric(String str) {
        // fixed bug: 识别240+30为数字
        Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]?");
        Matcher isNum = pattern.matcher(str);
        if( isNum.matches()){
            return true; 
        } 
        
        return false; 
    }

    public static String removeTopic(String str) {
        Pattern pattern = Pattern.compile("#.+#");
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll("");
        return result;
    }
    
}
