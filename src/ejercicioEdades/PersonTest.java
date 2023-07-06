package ejercicioEdades;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        extractUnderAgePersonWithArrayList();
        System.out.println("------");
        extractUnderAgePersonWithArrays();
    }


    public static void extractUnderAgePersonWithArrays(){
        int n = 4;
        int legalAge = 18;

        //Crear cuatro personas
        Person p1 = new Person();
        p1.setName("Persona 1");
        p1.setAge(40);
        Person p2 = new Person();
        p2.setName("Persona 2");
        p2.setAge(16);
        Person p3 = new Person();
        p3.setName("Persona 3");
        p3.setAge(20);
        Person p4 = new Person();
        p4.setName("Persona 4");
        p4.setAge(15);

        Person[] initialPeople = {p1, p2, p3, p4};
        Person[] underAgePeople = new Person[n];

        for (int i = 0; i < initialPeople.length; i++) {
            if(initialPeople[i].getAge() < legalAge){
                underAgePeople[i] = initialPeople[i];
            }
        }

        for (Person p : underAgePeople) {
            if(p != null) {
                System.out.println(p.getName() + " -> " + p.getAge());
            }
        }
    }

    public static void extractUnderAgePersonWithArrayList(){
        int n = 4;
        int legalAge = 18;

        //Crear cuatro personas
        Person p1 = new Person();
        p1.setName("Persona 1");
        p1.setAge(40);
        Person p2 = new Person();
        p2.setName("Persona 2");
        p2.setAge(16);
        Person p3 = new Person();
        p3.setName("Persona 3");
        p3.setAge(20);
        Person p4 = new Person();
        p4.setName("Persona 4");
        p4.setAge(15);

        ArrayList<Person> initialPeople = new ArrayList<>();
        if(initialPeople.isEmpty()) {
            initialPeople.add(p1);
            initialPeople.add(p2);
            initialPeople.add(p3);
            initialPeople.add(p4);
        }

        ArrayList<Person> underAgePeople = new ArrayList<>();

        for (int i = 0; i < initialPeople.size(); i++) {
            Person p = initialPeople.get(i);
            if(p.getAge() < legalAge){
                underAgePeople.add(p);
            }
        }

        for (Person p : underAgePeople) {
                System.out.println(p.getName() + " -> " + p.getAge());
        }
    }

}
