import java.util.Scanner;

public class Cursos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String opcion;

        System.out.println("Escoge una opción sobre los cursos: (abrir / cerrar)");
        opcion = entrada.nextLine();

        Cursos c = new Cursos();

        switch (opcion) {

            case "abrir":
                c.abrirCurso();
                break;

            case "cerrar":
                c.cerrarCurso();
                break;

            default:
                System.out.println("Opción inválida");
        }
    }


    public void abrirCurso() {

        Scanner entrada = new Scanner(System.in);

        String instructor, horario;

        System.out.println("Escoge un instructor: (Pablo, Laura, Manuel, Yeyo)");
        instructor = entrada.nextLine();

        System.out.println("Escoge horario: (semanal, quincenal, mensual)");
        horario = entrada.nextLine();

        System.out.println("Se registró tu curso");
        System.out.println("Instructor: " + instructor);

        switch (horario) {

            case "semanal":
                System.out.println("Duración: 1 semana");
                break;

            case "quincenal":
                System.out.println("Duración: 15 días");
                break;

            case "mensual":
                System.out.println("Duración: 1 mes");
                break;

            default:

        }
    }


    public void cerrarCurso() {

        Scanner entrada = new Scanner(System.in);
        String confirmar;

        System.out.println("¿Confirma cerrar su curso? (si/no)");
        confirmar = entrada.nextLine();

        if (confirmar.equalsIgnoreCase("si")) {
            System.out.println("Su curso se ha cerrado exitosamente ✔");
            System.out.println("Ya no tiene cursos vigentes");
        } else {
            System.out.println("El curso sigue abierto");
        }
    }
}
//kjhgfg