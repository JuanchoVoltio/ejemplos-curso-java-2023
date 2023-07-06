package ejemploConstructores;

public class Person {
    private String name;
    private int age = -1;

    private String bloodType;

    //Constructor A
    public Person(){
        setAge(1);
        setName("N/A");
        setBloodType("N/A");
    }

    //Constructor B
    public Person(String name){
        setName(name);
    }

    //Constructor D
    public Person(String name, String bloodType, int age){
        this(name, age); //Ejecutar el constructor C
        setBloodType(bloodType);
    }

    //Constructor C
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
}
