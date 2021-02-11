import java.util.Scanner; //Libreria para tomar valores de consola

public class tarea1 {

    public static void main(String args[]) {
        int paisRiesgo, tos, cuadroSintoma; // Variables de sintomas
        Scanner sc = new Scanner(System.in); // Scanner en una variable para posterior uso

        System.out.println("Si el pasiente proviene de un pais de riesgo dijite 1 en caso contrario 0");
        paisRiesgo = sc.nextInt(); // Toma el valor introducido
        System.out.println("Si el pasiente tiene tos dijite 1 en caso contrario 0");
        tos = sc.nextInt();
        System.out.println("Si el pasiente tiene un cuadro sintomatico dijite 1 en caso contrario 0");
        cuadroSintoma = sc.nextInt();

        if (paisRiesgo == 1 || tos == 1 || cuadroSintoma == 1) {
            if (paisRiesgo == 1 && tos == 1 && cuadroSintoma == 1) { // Comprueba si se tiene todo los sintomas
                System.out.println("Enviar muestra de sangre para analisis de covid-19");
            } else { // comprueba si se tiene < 3 sintomas
                System.out.println("Enviar paciente a casa con los tratamientos pertinentes");
            }
        } else { // el paciente no tiene ningun sintoma
            System.out.println("Paciente sin ningun sintoma");
        }

    }
}