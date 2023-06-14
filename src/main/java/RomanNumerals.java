public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";
    public static final String X = "X";

    public String convert(int inputNumber) {
        String output = "";

        if(inputNumber < 34 && inputNumber > 30) {
            int count = inputNumber - 30;
            String xs = getXs(inputNumber);
            output = xs + I.repeat(count);
        }
        if (inputNumber == 30) {
            int count = inputNumber / 10;
            output = X.repeat(count);
        }
        if(inputNumber < 29 && inputNumber > 25) {
            int count = inputNumber - 20 - 5;
            String xs = getXs(inputNumber);
            output = xs + V + I.repeat(count);
        }
        if(inputNumber == 25) {
            String xs = getXs(inputNumber);
            output = xs + V;
        }
        if(inputNumber < 24 && inputNumber > 20) {
            String xs = getXs(inputNumber);
            String is = getIs(inputNumber, 20);
            output = xs + is;
        }
        if (inputNumber == 20) {
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
            String is = getIs(inputNumber, 10);
            output = X + is;
        }
        if (inputNumber == 10) {
            int count = inputNumber / 10;
            output = X.repeat(count);
        }
        if (inputNumber < 10 && inputNumber > 5) {
            String is = getIs(inputNumber, 5);
            output = V + is;
        }
        if (inputNumber == 5) {
            output = V;
        }
        if (inputNumber < 5) {
            output = I.repeat(inputNumber);
        }
        return output;
    }

    private static String getIs(int inputNumber, int i) {
        int count = inputNumber - i;
        String is = I.repeat(count);
        return is;
    }

    private static String getXs(int inputNumber) {
        int count1 = inputNumber / 10;
        String xs = X.repeat(count1);
        return xs;
    }

}
