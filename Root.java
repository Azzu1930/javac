import java.util.Scanner;

 class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        double D = b * b - 4 * a * 0;  
        System.out.println("Discriminant (D): " + D);

        if (D > 0) {
            System.out.println("Roots are real and distinct.");
        } else if (D == 0) {
            System.out.println("Roots are real and equal.");
        } else {
            System.out.println("Roots are imaginary.");
        }

        double root1 = 0;
        double root2 = -b / a;

        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}
