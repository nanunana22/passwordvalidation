package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PasswordGeneratorTest{
    @Test
    public void addTest_whenGenerating_expect8Chars(){
        //Given
        String a = "Passwor*";

        //When
        String password = PasswordGenerator.generate();

        //Then
        System.out.println(password);
        Assertions.assertTrue(Password.isSafe(password));
    }
}
