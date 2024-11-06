public class App {
    public static void main(String[] args) throws Exception {
            Recursividad rec = new Recursividad();
            int resultado = rec.factorial(5);
            System.out.println("El resultado es: "+resultado);
            System.out.println("");

            int  resultado2 = rec.sumaConsecutivos(5);
            System.out.println("El resultado de la suma consecutiva es: "+resultado2);
            System.out.println("");

            int resultado3 = rec.potencia(5, 3);
            System.out.println("Elresultado de la potencia es: " +resultado3);
            System.out.println("");

            int  resultado4 = rec.sumaDigitos(456);
            System.out.println("El resultado de la suma de los digitos es: "+resultado4);
            System.out.println("");

            int resultado5 = rec.fibonacci(5);
            System.out.println("El resultado de la secuencia de fibonacci es: "+resultado5);
            System.out.println("");

            RenombrarDirectorios rd =  new RenombrarDirectorios();
            rd.RenombrarDirectorios("srcdirectorios");

            int[] arregloSecuencial = {74,84,42,49,85};
            int elementoBuscadoSecuencial = 85;
            int resultadoSecuencial = rec.busquedaSecuencialRecursiva(arregloSecuencial, elementoBuscadoSecuencial, 0);

            if (resultadoSecuencial != -1){
                System.out.println("");
                System.out.println("Valor encontrado en el elemento (búsqueda secuencial): " + resultadoSecuencial);
            } else {
                System.out.println("");
                System.out.println("Valor no encontrado (búsqueda secuencial).");
            }

            int[] arregloBinario = {15,80,46,98,78};
            int elementoBuscadoBin = 98;
            int resultadoBinario = rec.busquedaBinariaRecursiva(arregloBinario, elementoBuscadoBin, 0, arregloBinario.length - 1);

            if  (resultadoBinario != -1){
                System.out.println("");
                System.out.println("Valor encontrado en el elemento (búsqueda binaria): " + resultadoBinario);
                } else {
                    System.out.println("");
                    System.out.println("Valor no encontrado (búsqueda binaria).");
                }

    }
}
