package lab7.prog1;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    Person(String lastName, String firstName, int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return  firstName + lastName;
    }
}
