import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read coefficients
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Check for real solutions
        if (discriminant < 0) {
            System.out.println("There are no real solutions.");
        } 
        else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("There is one real solution: " + x);
        } 
        else {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("Two real solutions exist:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        sc.close();
    }
}
