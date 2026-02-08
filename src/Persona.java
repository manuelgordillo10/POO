import java.util.Scanner;
public class Persona {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String  registro ;
        System.out.println("¿Deseas registrarte? (si/no)");
        registro = entrada.nextLine();
Persona p= new Persona();
p.registrarse(registro);
    }
    public void registrarse(String registro){
        String nombre, numeroTelefono;
        Scanner entrada=new Scanner(System.in);
        switch (registro) {
            case "si":
                System.out.println("ingresa tu nombre y apellidos");
                nombre=entrada.nextLine();
                System.out.println("ingresa tu numero de telefono");
                numeroTelefono=entrada.nextLine();
                int d1=(int) (Math.random()*10);
                int d2=(int) (Math.random()*10);
                int d3=(int) (Math.random()*10);
                int d4=(int) (Math.random()*10);
                System.out.println("registro exitoso");
                System.out.println("Nombre: "+nombre);
                System.out.println("Numero telefonico: "+numeroTelefono);
                System.out.println("Tu pin de acceso es: "+d1+d2+d3+d4);
                break;
            case "no":
                System.out.println("Se cancelo el registro");
            default:




        }

    }


}
