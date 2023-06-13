public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";

    public String convert(int inputNumber) {
        String output = "";

        if(inputNumber == 20) {
            int count = inputNumber / 10;
            output = X.repeat(count);
        }
        if (inputNumber == 10) {
            int count = inputNumber / 10;
            output = X.repeat(count);
        }
        if(inputNumber < 19 && inputNumber > 15) {
            int count = inputNumber - 10 - 5;
            output = X + V + I.repeat(count);
        }
        if(inputNumber == 15) {
            output = X + V;
        }
        if (inputNumber > 10 && inputNumber < 14) {
            int variable = inputNumber - 10;
            output = X + I.repeat(variable);
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
