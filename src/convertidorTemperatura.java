import java.util.Scanner;

public class convertidorTemperatura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Conversión de Celsius a Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        // Mostrar el valor convertido en la consola
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaFahrenheit);

        // Crear una variable entera para mostrar la temperatura en Fahrenheit sin decimales
        int temperaturaFahrenheitEntera = (int) temperaturaFahrenheit;

        // Mostrar la temperatura en Fahrenheit como sin decimales
        System.out.println("La temperatura en Fahrenheit (sin decimales) es: " + temperaturaFahrenheitEntera);

        // Cerrar el scanner
        scanner.close();
    }
}
