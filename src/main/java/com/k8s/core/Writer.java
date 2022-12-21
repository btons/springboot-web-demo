package com.k8s.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.k8s.util.PropUtils;

public class Writer {

//    Resource resource = new ClassPathResource("application.properties");
//    Properties props = PropertiesLoaderUtils.loadProperties(resource);
    public Writer(String text) throws IOException {
        DateFormat df = new SimpleDateFormat("yyMMddHHmmss");
        //String demoFilePath=props.getProperty("demo.filePath");
        String demoFilePath=null; 
        String demoFileName=null;
        
        try {
            demoFilePath = PropUtils.getAppStr("demo.filePath");

            demoFileName="WebCrawler"+df.format(new Date())+".txt";
    
            File file = new File(demoFilePath);
    
            if(!file.exists()) {
                if(file.mkdirs()) {
                    System.out.println("Folder is created successfully.");
                }
            }
            else {
                System.out.println("Folder is already exists.");
            }
        
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        FileWriter fw = new FileWriter(demoFilePath+demoFileName);
        fw.write(text);
        fw.flush();
        fw.close();
    }
}