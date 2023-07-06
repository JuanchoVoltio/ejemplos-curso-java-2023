package ejemploDeCiclos;

public class PruebaDeCiclos {

    public static void main(String[] args) {
        int x = 5;
        int i = 5;

        int opcion = 0;

        while(opcion == 1 || opcion == 2){
            mostrarElMenu();
            opcion = 0; //El valor que digite el usuario
        }

        do{
            mostrarElMenu();
            opcion = 0; //El valor que digite el usuario
        } while (opcion != 1 && opcion != 2);
    }

    public static void mostrarElMenu(){
        System.out.println("Escoja la opción:");
        System.out.println("[1] Opcion 1\n[2] Opcion 2");
    }
}
