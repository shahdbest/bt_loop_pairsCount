package com.stackroute.loops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PairsCounterAppTests {

    private ByteArrayOutputStream myOutStream;
    private static final String MESSAGE = "PairsCounter Should display result";
    private static final String ERROR_ARRAY_LENGTH_MESSAGE = "PairsCounter Should display 'Give proper length of input array' message";
    private static final String ERROR_DIFFERENCE_MESSAGE = "PairsCounter Should display 'Give proper difference greater than or equal to zero' message";

    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @AfterEach
    public void tearDown() {
        myOutStream = null;
    }

    @Test
    public void givenValidInputArrayAndDifferenceThenReturnResult() {
        String input = "2 8 1 3 4 5 7 9 100 98";
        String output = "5 pairs are found with the given difference";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        PairsCounter.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, MESSAGE);
    }

    @Test
    public void givenValidDifferenceAndInValidArrayLengthThenReturnErrorMessage() {
        String input = "4 0";
        String output = "Give proper length of input array";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        PairsCounter.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, ERROR_ARRAY_LENGTH_MESSAGE);
    }

    @Test
    public void givenInvalidDifferenceThenReturnErrorMessage() {
        String input = "-1";
        String output = "Give proper difference greater than or equal to zero";
        ByteArrayInputStream myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);
        PairsCounter.main(null);
        String actual = myOutStream.toString().trim().replaceAll(".*\n", "");
        assertEquals(output, actual, ERROR_DIFFERENCE_MESSAGE);
    }

}
