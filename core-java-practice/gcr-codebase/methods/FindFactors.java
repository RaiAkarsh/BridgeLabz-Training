import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Enter a number"); 
        int number = x.nextInt();

        FindFactors f = new FindFactors();
        int[] factors = f.findFactors(number);
        int greatestFactor = f.findGreatestFactor(factors);
        int sumOfFactors = f.sumOfFactors(factors);
        int[] product = f.products(factors);

        System.out.println("Factors of " + number + ": ");
        for (int i=0; i<factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println("\nGreatest Factor " + greatestFactor);
        System.out.println("Sum of Factors " + sumOfFactors);
        System.out.println("Product of Factors " + product[0]);
        System.out.println("Product of Cubes of Factors " + product[1]);
    }
    public int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }
    public int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public int[] products(int[] factors) {
        int product []  = new int[2];
        product[0]= 1;
        product[1]= 1; 
        for (int i=0; i<factors.length; i++) {
            product[0] *= factors[i];
            product[1] *= Math.pow(factors[i], 3);
        }
        return product;
    }
}
