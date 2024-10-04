import java.util.Scanner;
public class calculadora{

    public static void main(String[] args) {
        Scanner   scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora ");
        
        while (true) {
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Seleccione la operación (+, -, *, /) o 'q' para salir: ");
            String operacion = scanner.next();

            if (operacion.equals("q")) {
                System.out.println("Saliendo de la calculadora. ¡Adiós!");
                break;
            }

            switch (operacion) {
                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
        }

        scanner.close();
    }
}
