package com.k8s.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropUtils {
    public static String LOCATION;

    public static final String CONFIG = "application";

    static {
        try {
            String temp = URLDecoder
                    .decode(PropUtils.class.getProtectionDomain().getCodeSource().getLocation().getFile(), "UTF-8");
            LOCATION = temp.substring(1, temp.lastIndexOf('/'));
        } catch (UnsupportedEncodingException e) {
            LOCATION = "";
        } 

    }
    
    /**
     * @param args
     * @throws Exception
     */
    public static String getAppStr(String key) throws Exception {
        ResourceBundle prop = getProperties(CONFIG);
        return prop.getString(key);
    }    

    /**
     * @param args
     * @throws Exception
     */
    public static ResourceBundle getProperties(String filepath) throws Exception {
        Properties prop = new Properties();
        
//        System.out.println("location="+LOCATION + "/" + filepath);
//        FileInputStream fis = new FileInputStream(filepath);
        
        ResourceBundle bundle = ResourceBundle.getBundle(filepath);
//        String url=bundle.getString("demo.filePath");
//        
//        FileInputStream fis = new FileInputStream(url);
//        
//        prop.load(fis);
        return bundle;
    }

}