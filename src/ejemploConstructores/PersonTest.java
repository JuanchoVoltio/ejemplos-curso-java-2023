package ejemploConstructores;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
//        probandoConstructores();


        SerVivo humanoTerricola = new SerVivo("Homo sapiens sapiens", "Henry");
        SerVivo klingonAndromeda = new SerVivo("Klingon sapiens", "Henry");
        SerVivo otroHumanoTerricola = new SerVivo("Neardenthal", "Henry");


//        humanoTerricola.NOMBRE_CIENTIFICO = "Terricola sapiensa";
//        klingonAndromeda.NOMBRE_CIENTIFICO = "Klingon bla";

        humanoTerricola.nombre = "Luis";
        klingonAndromeda.nombre = "Henry";
    }

    public static void probandoConstructores(){

        //Crear cuatro personas
        Person p1 = new Person("Persona 1");
        p1.setAge(40);
        Person p2 = new Person();
        Person p3 = new Person("Persona 3", "O-", 20);
        Person p4 = new Person("Persona 4", 38);

        p1.getName();
        p1.getName();

        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}
