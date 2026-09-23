import java.util.Scanner;

public class Calculadora {

    public double valor1 = 0;
    public double valor2 = 0;
    public int opcion = 0;

    private Scanner scanner = new Scanner(System.in);

    public double suma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicacion(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double division(double valor1, double valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }
        return valor1 / valor2;
    }

    public void obtenerInformacion() {
        System.out.println("Que opcion quieres");
        System.out.println("1 Suma, 2 Resta, 3 Multiplicacion, 4 Division");
        this.opcion = scanner.nextInt();

        System.out.println("Dame el primer valor:");
        this.valor1 = scanner.nextDouble();

        System.out.println("Dame el segundo valor:");
        this.valor2 = scanner.nextDouble();
    }

    public void ejecutar() {
        this.obtenerInformacion();

        switch (this.opcion) {
            case 1:
                System.out.println("La suma es: " + this.suma(this.valor1, this.valor2));
                break;
            case 2:
                System.out.println("La resta es: " + this.resta(this.valor1, this.valor2));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + this.multiplicacion(this.valor1, this.valor2));
                break;
            case 4:
                System.out.println("La division es: " + this.division(this.valor1, this.valor2));
                break;
            default:
                System.out.println("Esta opcion no esta disponible");
                break;
        }
    }

    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.ejecutar();
    }
}