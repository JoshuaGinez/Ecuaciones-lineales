import java.util.Scanner;

public class Ecuacioneslineales {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de resolucion de ecuaciones lineales !!");
        int menu;
        do {
            System.out.println("\nMenú:");
            System.out.println("1). Suma");
            System.out.println("2). Resta");
            System.out.println("3). Multiplicaion");
            System.out.println("4). Division");
            System.out.println("5). Cuadraticas");
            System.out.println("6). salir");
            System.out.print("Seleccione una opción: ");

            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                   suma(scanner);
                    break;
                case 2:
                    resta(scanner);
                    break;
                case 3:
                    multiplicacion(scanner);
                    break;
                case 4:
                    division(scanner);
                    break;
                case 5:
                    cuadraticas(scanner);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Numero indefinido,inténtelo de nuevo.");
            }

        } while (menu != 6);

        scanner.close();
    }

    private static void cuadraticas(Scanner scanner) {
        System.out.println("Ingrese los coeficientes de la ecuación cuadrática (a, b, c):");
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();
        double discriminante = (b * b) - (4 * a * c);
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son reales y diferentes:");
            System.out.println("Raíz 1 = " + raiz1);
            System.out.println("Raíz 2 = " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una raíz real y doble:");
            System.out.println("Raíz = " + raiz);
        } else {
            System.out.println("Las raíces son números complejos:");
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(Math.abs(discriminante)) / (2 * a);
            System.out.println("Raíz 1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raíz 2 = " + parteReal + " - " + parteImaginaria + "i");
        }


    }

    private static void multiplicacion(Scanner scanner) {
        System.out.print("Primer digito a multiplicar: ");
        int primerDigito = scanner.nextInt();

        System.out.print("Segundo digito a multiplicar: ");
        int segundoDigito = scanner.nextInt();

        scanner.nextLine();
        int multiplicar =primerDigito * segundoDigito;
        System.out.print("Su resultado es: " + multiplicar);
    }
    private static void resta(Scanner scanner) {
        System.out.print("Primer digito a restar: ");
        int primerDigito = scanner.nextInt();

        System.out.print("Segundo digito a restar: ");
        int segundoDigito = scanner.nextInt();

        scanner.nextLine();
        int restar =primerDigito - segundoDigito;
        System.out.print("Su resultado es: " + restar);
    }

    private static void suma(Scanner scanner) {
        System.out.print("Primer digito a sumar: ");
        int primerDigito = scanner.nextInt();

        System.out.print("Segundo digito a  sumar: ");
        int segundoDigito = scanner.nextInt();

        scanner.nextLine();
        int sumar =primerDigito + segundoDigito;
        System.out.print("Su resultado es: " + sumar);
    }

    private static void division(Scanner scanner) {

        System.out.print("Primer digito a dividir: ");
        int primerDigito = scanner.nextInt();

        System.out.print("Segundo digito a dividir: ");
        int segundoDigito = scanner.nextInt();

        scanner.nextLine();
        if (segundoDigito <= 0) {
            System.out.print("No se puede divir entre 0, es indeterminado");

        } else {
            int division = primerDigito / segundoDigito;
            System.out.print("Su resultado es: " + division);
        }

    }

}
