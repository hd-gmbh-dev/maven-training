package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

@SpringBootTest
class Demo2Phase1ApplicationTests {

    @Test
    void test() {
        await().atMost(5, SECONDS).until(() -> true);
    }

}
