package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.atomic.AtomicInteger;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

@SpringBootTest
class Phase4ApplicationTests {

    @Test
    void test() {
        await().atMost(5, SECONDS).until(() -> true);
    }

    @Test
    @Tag("slow")
    void slowTest() {
        System.out.println("Waiting ...");
        var i = new AtomicInteger(0);
        await()
                .atLeast(5, SECONDS)
                .atMost(15, SECONDS)
                .pollInterval(1, SECONDS)
                .until(() -> i.incrementAndGet() == 10);
        System.out.println("done!");
    }

}
