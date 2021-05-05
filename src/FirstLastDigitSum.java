public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int last = number % 10; // finds last digit
        int first = number;

        while (first >=10) { // while first is more than or equal to 10
            first = first / 10; // divide number by 10
            // when you divide by 10, each digit moves one place to the right
            // once it's less than 10, the loop stops

            // 252 % 10 = 2
            // 252 / 10 = 25
            // 25 / 10 = 2
            // 2 + 2 = 4
            // it's a whole number as it's an integer
        }
        return first + last;
    }
}

