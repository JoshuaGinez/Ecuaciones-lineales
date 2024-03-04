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
            System.out.println("5). salir");
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
                    Division(scanner);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Numero indefinido,inténtelo de nuevo.");
            }

        } while (menu != 5);

        scanner.close();
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

    private static void Division(Scanner scanner) {

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
