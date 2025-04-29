public class Ejercicio {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos que desea ver: ");
        int cantidad = scanner.nextInt();
        
        int contador = 0;
        int numero = 2;
        
        System.out.println("Los primeros " + cantidad + " números primos son:");
        
        while (contador < cantidad) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
        
        scanner.close();
    }
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
