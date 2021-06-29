
package pe.edu.upeu.mavenproject1adzm;
import pe.edu.upeu.mavenproject1adzm.resexamen;
public class App {
 
    public static void main(String[] args) {
        int opcion;
        pe.edu.upeu.mavenproject1adzm.leerteclado lc = new pe.edu.upeu.mavenproject1adzm.leerteclado();
        resexamen Ejercicios = new resexamen();
        try {
            opcion = lc.leer(0, "Que ejercicio quieres que se ejecute? 2-5: ");

            switch (opcion) {
                case 2:
                    System.out.println("   EJERCICIO 2             ");
                    Ejercicios.ejercicio2();
                    break;
                case 3:
                    System.out.println("   EJERCICIO 3           ");
                    Ejercicios.ejercicio3();
                    break;
                case 4:
                    System.out.println("  EJERCICIO 4             ");
                    Ejercicios.ejercicio4();
                    break;
                case 5:
                    System.out.println("  EJERCICIO 4  ");
                    int n = lc.leer(0, "Ingrese numero");
                    int m = lc.leer(0,"Ingrese la potencia");
                    int respuesta = Ejercicios.ejercicio5(n , m);
                    System.out.println("el resultado es: "+respuesta);
            }        
        }catch (Exception e) {
            lc.leer(0, "Debes insertar un número válido");
        }
    }
}
