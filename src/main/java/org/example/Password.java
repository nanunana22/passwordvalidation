//1 Eine Methode, die sicherstellt, dass ein Passwort mindestens 8 Zeichen lang ist.
//2 Mit einer anderen Methode soll geprüft werden, ob das Kennwort Ziffern enthält.
//3 Außerdem wollen Sie mit einer Methode sicherstellen, dass im Kennwort sowohl Groß- als auch Kleinbuchstaben verwendet werden.
//4 Und eine Methode soll häufig verwendete Kennwörter erkennen.

//Schreiben Sie einen Test für die Methode mit der Passwortlänge.

//Implementieren Sie die Funktionalität zur Überprüfung der Passwortlänge.

//Definieren Sie zusätzliche Testmethoden für verschiedene Passwörter. Wählen Sie eine aus Ihrer Sicht optimale Anzahl von Tests.
package org.example;

public class Password {
    public static void main(String[] args) {
    }
    public static boolean checkLength(String a){
        if (a.length() == 8){
            return true;
        }
        return false;
    }
    public static boolean checkIfDigits(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkUpperLower(String input) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            if (Character.isUpperCase(check)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(check)) {
                hasLowerCase = true;
            }
        }
        return hasUpperCase && hasLowerCase;

    }
}


