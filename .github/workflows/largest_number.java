package java_programs;

public class find_largest_number {

    public static void main(String[] args){

        int [] number = {2,987,1000,7,9,4,1008,1093883};
        int largest = number[0];

        for(int i = 1; i < number.length; i++){

            largest = number[i];
        }

        System.out.println("Largest number: " + largest);
    }
}
