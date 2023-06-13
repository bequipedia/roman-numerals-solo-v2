public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";

    public String convert(int inputNumber) {
        String output = "";

        if(inputNumber == 20) {
            output = X + X;
        }

        if(inputNumber == 18) {
            output = X + V + I + I + I;
        }
        if(inputNumber == 17) {
            output = X + V + I + I;
        }
        if(inputNumber == 16) {
            output = X + V + I;
        }

        if(inputNumber == 15) {
            output = X + V;
        }
        if (inputNumber > 10 && inputNumber < 14) {
            int variable = inputNumber - 10;
            output = X + I.repeat(variable);
        }
        if (inputNumber == 10) {
            output = X;
        }
        if (inputNumber < 10 && inputNumber > 5) {
            int numberOfIs = inputNumber - 5;
            output = V + I.repeat(numberOfIs);
        }
        if (inputNumber == 5) {
            output = V;
        }
        if (inputNumber < 5) {
            output = I.repeat(inputNumber);
        }

        return output;
    }

}
