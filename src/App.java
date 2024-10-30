public class App {
    public static void main(String[] args) throws Exception {
            Recursividad rec = new Recursividad();
            int resultado = rec.factorial(5);
            System.out.println("El resultado es: "+resultado);

            int  resultado2 = rec.sumaConsecutivos(5);
            System.out.println("El resultado es: "+resultado2);

            int resultado3 = rec.potencia(5, 3);
            System.out.println("Elresultado de la potencia es: " +resultado3);

            int  resultado4 = rec.sumaDigitos(456);
            System.out.println("El resultado de la suma de los digitos es: "+resultado4);

            int resultado5 = rec.fibonacci(5);
            System.out.println("El resultado de la secuencia de fibonacci es: "+resultado5);

            RenombrarDirectorios rd =  new RenombrarDirectorios();
            rd.RenombrarDirectorios("src/directorios");

    }
}
