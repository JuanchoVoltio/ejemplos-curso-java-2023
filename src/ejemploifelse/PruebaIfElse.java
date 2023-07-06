package ejemploifelse;

public class PruebaIfElse {
    public static void main(String[] args) {

        probandoElOperadorTernario();

    }


    static void probandoElOperadorTernario(){
        int goles = 1;
//        String s = (goles == 1 ? "gol" : "goles");

//        if(goles == 1){
//            s = "gol";
//        }else{
//            s = "goles";
//        }

        System.out.println("El jugador ha marcado " + goles + " " + (goles == 1 ? "gol" : "goles"));
    }

    static void comparacionIfSwitchConRangosDeEdades(){
        int edad = 10;

        if(edad >= 0 && edad < 10){
            System.out.println("Niño");
        }else if(edad >= 10 && edad < 18){
            System.out.println("Adolescente");
        }else if(edad >= 18 && edad < 60){
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto Mayor");
        }

        //Esto no lo podemos hacer con un switch porque estamos evaluando un rango de valores.
    }

    static void comparacionIfSwitchConCodigosDeColor(){
        char codigoDeColor = 'G';

        if(codigoDeColor == 'R'){
            System.out.println("Rojo");
        }else if(codigoDeColor == 'G'){
            System.out.println("Verde");
        }else if (codigoDeColor == 'B'){
            System.out.println("Azul");
        }

        System.out.println("----");

        switch (codigoDeColor){
            case 'R':
                System.out.println("Rojo");
                break;
            case 'G':
                System.out.println("Verde");
                break;
            case 'B':
                System.out.println("Azul");
                break;
        }
    }
}
