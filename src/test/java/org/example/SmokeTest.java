package org.example;                       // (1)

import org.junit.jupiter.api.Test;         // (2)

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;  // (3)

class SmokeTest {                        // (4)

    @Test                                  // (5)
    void to_find_max_number() {   // (6)

        // Given : on prépare les données
        int number1 = 1;
        int number2 = 5;

        // When : on exécute ce qu'on teste
        int num_max = Math.max(number1, number2);

        // Then : on vérifie le résultat
        assertEquals(5, num_max);


    }
}