package com.example;

import org.apache.commons.lang3.stream.Streams;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class Demo2Phase3ApplicationTests {

    @Test
    void shouldFilterWithCommonsStreams() {
        // Streams class was introduced in commons-lang3 3.12.0
        List<Integer> result = Streams.stream(List.of(1, 2, 3, 4, 5))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        assertThat(result).containsExactly(2, 4);
    }

}
