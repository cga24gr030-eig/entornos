
import java.util.Scanner;


public class Repaso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una de las siguientes funciones:");
        System.out.println("1: Hola Mundo!");
        System.out.println("2: Sumar dos números");
        System.out.println("3: Identificar número par o impar");
        System.out.println("4: Identificar el mayor de 3 números");
        System.out.println("5: Calcular la tabla de multiplicar de un número");
        System.out.println("6: Calcular el factorial de un número");
        System.out.println("7: Calcular si un número es primo");
        System.out.println("8: Invertir una cadena de texto");
        System.out.println("9: Promedio de números");
        System.out.println("10: Adivina el número");
  
        int choice = scanner.nextInt();
        System.out.println("====================================================");
        
        switch (choice) {
            case 1 -> helloWorld();
            case 2 -> addNumbers();
            case 3 -> oddEven();
            case 4 -> largestNumber();
            case 5 -> timesTable();
            case 6 -> factorial();
            case 7 -> isPrime();
            case 8 -> reverseString();
            case 9 -> getAverage();
            case 10 -> guessRandom();
            default -> {
                System.out.println("Entrada inválida, vuelve a intentarlo:");
                main(args);
                break;
            }
        }
    }

    private static void helloWorld() {
        System.out.println("Hello World!");
    }

    private static void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sumar dos números:");
        System.out.print("introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("introduce el segundo número: ");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + result);
    }

    private static void oddEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Identificar si un número es par o impar:");
        System.out.print("introduce tu número: ");
        int input = scanner.nextInt();
        String result = (input % 2 == 0) ? "El número " + input + " es par" : "El número " + input + " es impar";
        System.out.println(result);
    }
    
    private static void largestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Identificar el mayor de tres números");
        System.out.print("Introduce un número y pulsa intro: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el último número: ");
        int num3 = scanner.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("El mayor número de los tres es: " + max);
    }

    private static void timesTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Generar la tabla de multiplicar de un número");
        System.out.print("Introduce un número y pulsa intro: ");
        int num = scanner.nextInt();
        for(int i = 0; i <= 10; i++){
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular el factorial de un número");
        System.out.print("Introduce un número y pulsa intro: ");
        int num = scanner.nextInt();
        int original = num;
        for(int i=(num-1); i>0; i--){
            num = num * i;
        }
        System.out.println("El factorial de " + original + " es: " + num);
    }

    private static void isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Identificar si un número es primo");
        System.out.print("Introduce un número y pulsa intro: ");
        int num = scanner.nextInt();

        if(num < 2) {
            System.out.println("Entrada inválida.");
            return;
        }

        boolean isPrime = true;
        for (int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) System.out.print("El número " + num + " es primo.");
        else System.out.print("El número " + num + " no es primo.");
        
    }

    private static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Invertir una cadena");
        System.out.print("Introduce una linea de texto y pulsa intro: ");
        String input = scanner.nextLine();
        char[] array = input.toCharArray();

        int start = 0; 
        int end = array.length-1;
        char temp;
        while(end>start){
            temp = array[start];
            array[start]=array[end];
            array[end] = temp;

            end--;
            start++;
        }

        String output = new String(array);

        System.out.print("La cadena '" + input + "' invertida es: '" + output + "'.");
    }

    private static void getAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular el promedio de una serie de números");
        System.out.print("Introduce de cuántos números quieres hacer la media: ");
        int amt = scanner.nextInt();

        float[] values = new float[amt];
        for (int i=0; i<amt; i++){
            System.out.print("Introduce el " + i+1 + "º numero. Utiliza comas ',' para los decimales.");
            values[i] = scanner.nextFloat();
        }

        float total = 0.0f;
        for (int i=0; i<amt; i++){
            total += values[i];
        }

        float avg = total / amt;

        System.out.print("La media estos los números es: " + avg);
    }

    private static void guessRandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el número");
        int num = (int)(Math.floor(Math.random() * 10) + 1);
        
        boolean isRight = false;
        while (!isRight) {
            System.out.print("Introduce un número de 1 a 10: ");
            int guess = scanner.nextInt();

            if(guess == num){
                isRight = true;
                System.out.print("Acertaste!");
            } else System.out.println("Incorrecto, vuevle a intentarlo.");
        }
    }
}
