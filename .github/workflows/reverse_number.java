package java_programs;

public class reverse_number {

    public static void main(String[] args) {
        int number = 123456789;
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
