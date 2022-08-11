package com.stackroute.loops;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PairsCounterTests {
    private PairsCounter pairsCounter;
    private static final String MESSAGE = "Check logic of your computePairsCount method";
    private static final String ARRAY_MESSAGE = "Check logic of your inputArrayLengthValidator method";
    private static final String DIFFERENCE_MESSAGE = "Check logic of your inputDifferenceValidator method";

    @BeforeEach
    public void setUp() {
        pairsCounter = new PairsCounter();
    }

    @AfterEach
    public void tearDown() {
        pairsCounter = null;
    }

    @Test
    public void givenInputArrayWithPositiveNumbersThenReturnResult() {
        int[] input = {1, 2, 3, 4};
        int difference = 2;
        String output = "2 pairs are found with the given difference";
        assertEquals(output, pairsCounter.computePairsCount(input, difference), MESSAGE);
    }

    @Test
    public void givenInputWithNegativeNumbersThenReturnResult() {
        int[] input = {-1, -2, -3, -5, -7, -9, -13};
        int difference = 4;
        String output = "4 pairs are found with the given difference";
        assertEquals(output, pairsCounter.computePairsCount(input, difference), MESSAGE);
    }

    @Test
    public void givenInputWithNumbersAndDifferenceAsZeroThenReturnResult() {
        int[] input = {1, 12, 43, 25, 7, 19, 43, 25, 1};
        int difference = 0;
        String output = "3 pairs are found with the given difference";
        assertEquals(output, pairsCounter.computePairsCount(input, difference), MESSAGE);
    }

    @Test
    public void givenArrayAsNullThenReturnErrorMessage() {
        int difference = 4;
        String output = "Give proper input array not null";
        assertEquals(output, pairsCounter.computePairsCount(null, difference), MESSAGE);
    }

    @Test
    public void givenValidDifferenceThenReturnTrue() {
        int difference = 4;
        assertTrue(pairsCounter.inputDifferenceValidator(difference), DIFFERENCE_MESSAGE);
    }

    @Test
    public void givenInvalidDifferenceThenReturnFalse() {
        int difference = -4;
        assertFalse(pairsCounter.inputDifferenceValidator(difference), DIFFERENCE_MESSAGE);
    }

    @Test
    public void givenValidArrayLengthThenReturnTrue() {
        assertTrue(pairsCounter.inputArrayLengthValidator(4), ARRAY_MESSAGE);
    }

    @Test
    public void givenInvalidArrayLengthThenReturnFalse() {
        assertFalse(pairsCounter.inputArrayLengthValidator(0), ARRAY_MESSAGE);
    }

}