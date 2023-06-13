public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";

    public String convert(int inputNumber) {
        String output = "";

        if(inputNumber == 5) {
            output = V;
        }
        if (inputNumber < 5) {
            output = I.repeat(inputNumber);
        }

        return output;
    }
}
