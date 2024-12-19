import java.util.Scanner;

public class RunQuad {
    public static void main(String[] args) throws Exception {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Select from the Following : \n R - Rectangle \n S - Square \n P - Parallelogram \n H - Rhombus \n T - Trapezoid" + //
                                " \n Enter choice: ");
            String choice = s.nextLine();
        
            if(choice.equalsIgnoreCase("R")){
                Rectangle rectangle = new Rectangle();
                System.out.println("\u001B[32m");
                System.out.println("A Rectangle:");
                rectangle.showDescription();
                System.out.println("\u001B[0m");


            } else if(choice.equalsIgnoreCase("S")){
                Square square = new Square();
                System.out.println("\u001B[32m");
                System.out.println("A Square:");
                square.showDescription();
                System.out.println("\u001B[0m");

            } else if(choice.equalsIgnoreCase("P")){
                Parallelogram parallelogram = new Parallelogram();
                System.out.println("\u001B[32m");
                System.out.println("A Parallelogram:");
                parallelogram.showDescription();
                System.out.println("\u001B[0m");


            } else if(choice.equalsIgnoreCase("H")){
                Rhombus rhombus = new Rhombus();
                System.out.println("\u001B[32m");
                System.out.println("A Rhombus:");
                rhombus.showDescription();
                System.out.println("\u001B[0m");

            } else if(choice.equalsIgnoreCase("T")){
                Trapezoid trapezoid = new Trapezoid(); 
                System.out.println("\u001B[32m");
                System.out.println("A Trapezoid:");
                trapezoid.showDescription();
                System.out.println("\u001B[0m");

            } else {
                System.out.println("\u001B[31m");
                System.out.println("Invalid input. Restarting Program...");
                Thread.sleep(1500);
                System.out.println("\u001B[0m");
                main(args);
            }

        } catch (Exception e) {
            System.out.println("\u001B[31m");
            System.out.println("Invalid input. Restarting Program...");
            Thread.sleep(1500);
            System.out.println("\u001B[0m");
            main(args);
        }
    }
}

