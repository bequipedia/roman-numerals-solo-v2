public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";

    public String convert(int inputNumber) {
        String output = "";
        if(inputNumber == 10) {
            output = X;
        }
        if(inputNumber < 10 && inputNumber > 5) {
            int numberOfIs = inputNumber - 5;
            output = V + I.repeat(numberOfIs);
        }
        if(inputNumber == 5) {
            output = V;
        }
        if (inputNumber < 5) {
            output = I.repeat(inputNumber);
        }

        return output;
    }

}
