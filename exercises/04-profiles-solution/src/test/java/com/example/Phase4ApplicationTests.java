package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Phase4ApplicationTests {

    @Test
    @Tag("unit")
    void fast() throws Exception {
        System.out.println("FAST, waiting 500ms ...");
        Thread.sleep(500);
        System.out.println("done!");
    }

    @Test
    @Tag("slow")
    void slow() throws Exception {
        System.out.println("SLOW, waiting 5000ms ...");
        Thread.sleep(5000);
        System.out.println("done!");
    }

}
