package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Password.checkIfDigits;
import static org.example.Password.checkLength;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void addTest_whenLength8thenreturntrue(){
        //Given
        String a = "Password";

        //When
        boolean password = checkLength(a);

        //Then
        assertTrue(password);
    }
    @Test
    public void addTest_whenLength4thenreturnfalse(){
        //Given
        String a = "Pass";

        //When
        boolean password = checkLength(a);

        //Then
        assertFalse(password);
    }
    @Test
    public void addTest_whenLength9thenreturnfalse(){
        //Given
        String a = "Passwords";

        //When
        boolean password = checkLength(a);

        //Then
        assertFalse(password);
    }
    @Test
    public void addTest_whenDigitsTruethenreturnTrue(){
        //Given
        String a = "Passwor1";

        //When
        boolean password = checkIfDigits(a);

        //Then
        assertTrue(password);
    }
}
