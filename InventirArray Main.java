import java.util.Arrays;

public class Main {
    /**
     * Prueba el método Recursion.arrayReverse
     * @param input - array a tratar
     * @param expected - resultado esperado
     */
    static void test(int[] input, int[] expected) {
        // Se informa del caso que se está probando
        System.out.println("probando: arrayReverse(" + Arrays.toString(input) + ")");
    	
        // Llamada al método a probar
        Recursion.arrayReverse(input);
        
        // Comprobación de los resultados
        if (!Arrays.equals(input, expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: " + Arrays.toString(expected) + "");
            System.out.println(" y es: " + Arrays.toString(input) + "");
        } else {
            System.out.println(">> Resultado correcto: " + Arrays.toString(input) + "");
        }        
    }

    /**
     * Invoca a test para realizar múltiples pruebas
     * @param args
     */
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {5, 4, 3, 2, 1};
        test(v1, v2);
   }
}
