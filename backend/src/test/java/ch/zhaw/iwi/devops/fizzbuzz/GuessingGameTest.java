package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GuessingGameTest {
    @Test
    public void GuessingGameCorrect() {
        GuessingGame test = new GuessingGame();
        Assertions.assertEquals("Das ist korrekt!", test.guess(10));
    }        
}
