package gestionvehiculos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionVehiculos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You selected Option 1.");
                        break;
                    case 2:
                        System.out.println("You selected Option 2.");
                        break;
                    case 3:
                        System.out.println("You selected Option 3.");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear the invalid input
            }
        } while (choice != 4);

        scanner.close();
//        Sucursal macul = new Sucursal("101", "Rent-A-Car");
//        VehiculoEstandar vestandar1 = new VehiculoEstandar("22", "CityCar", 2.0);
//        VehiculoDeLujo vdlujo1 = new VehiculoDeLujo("33", "Deportivo", 4.0);
//        VehiculoEstandar vestandar2 = new VehiculoEstandar("44", "SparkLT", 3.0);
//        macul.agregarVehiculo(vestandar1);
//        macul.agregarVehiculo(vdlujo1);
//        macul.agregarVehiculo(vestandar2);
//        System.out.println(macul.calcularCostoAlquiler());
        
    }

}
