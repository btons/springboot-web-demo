package com.k8s;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Assertions;

import com.k8s.core.Article;
import com.k8s.core.Reader;
import com.k8s.core.Writer;

//@SpringBootApplication
public class K8SDemoApplication {

	public static void main(String[] args) {
	    Reader reader=null;
	    Writer writer=null;
	    
        try {
            reader = new Reader();
            
            List<Article> result = reader.getList("Gossiping");
            Assertions.assertInstanceOf(List.class, result);
            for(Article article:result) {
                System.out.println(article);
            }

            writer=new Writer(result.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	   
        System.exit(0);
		//SpringApplication.run(K8SDemoApplication.class, args);
	}

}
