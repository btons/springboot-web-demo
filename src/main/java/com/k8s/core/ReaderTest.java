package com.k8s.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

class ReaderTest {
    private Reader reader;

    private Writer writer;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        try {
            reader = new Reader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void list() {
        try {
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
    }
}