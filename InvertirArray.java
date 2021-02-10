public class Recursion {
    
    /*  Aitor Ventura Delgado
        12.03.2019
        
        Crearemos un método que invertirá un array pasado por parámetro de manera
        recursiva.  */
        
    private static void arrayaux (int[] a, int i, int j){
        /* Condición para salir de la recursión es que i (que empieza en 0, índice)
        del array sea menor que el índice final (que se va decrementando) */
        if (i < j){
            /*Creamos una variable temporal que nos guardará el número que se encuentra
            en el índice i del array inicial*/
            int b = a[i];
            //Que nos lo ponga al final
            a[i] = a[j];
            //Y luego el final será b
            a[j] = b;
            /*Y volvemos a llamar a la función, incrementando el valor de i y decrementando
            el valor de j.*/
            arrayaux(a, ++i, --j);
        }
    }
    
    public static void arrayReverse (int[] a){
        arrayaux(a, 0, a.length-1);
    }
}