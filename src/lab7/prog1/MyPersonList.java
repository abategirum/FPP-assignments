package lab7.prog1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPersonList {

    private final int INITIAL_LENGTH = 4;
    private static Person[] personArray;
    private int size;

    public MyPersonList() {
        personArray = new Person[INITIAL_LENGTH];
        size = 0;
    }
    // Add element in last
    public void add(String firstName, String lastName, int age){
        Person person = new Person(firstName,lastName,age);
//        if(firstName == null && lastName == null && age == null) return;
        if(size == personArray.length) resize();
        personArray[size++] = person;
    }

    public Person get(int i){
        if(i < 0 || i >= size){
            return null;
        }
        return personArray[i];
    }

    public boolean find(String lastName){
        if(lastName==null) return false;
        for(Person p : personArray){
            if(p.getLastName().equals(lastName)) return true;
        }
        return false; // The element is not in the list
    }

    public void insert(Person s, int pos){
        if(pos > size || pos<0 ) return;
        if(pos == personArray.length||size+1 > personArray.length) {
            resize();
        }
        Person[] temp = new Person[personArray.length+1];
        System.arraycopy(personArray,0,temp,0,pos);
        temp[pos] = s;

        System.arraycopy(personArray,pos,temp,pos+1, personArray.length - pos);
        personArray = temp;
        ++size;
    }

    public boolean remove(Person s){
        if(size == 0) return false; // list is empty
        if(s==null) return false;
        int index = -1;
        for(int i = 0; i < size; ++i ){
            if(personArray[i].equals(s)){
                index = i;
                break;
            }
        }
        if(index==-1) return false; // s is not found in the list
        Person[] temp = new Person[personArray.length];
        System.arraycopy(personArray,0,temp,0,index);
        System.arraycopy(personArray,index+1,temp,index,personArray.length-(index+1));
        personArray = temp;
        --size;
        return true;
    }

    private void resize(){
        System.out.println("resizing");
        int len = personArray.length;
        int newlen = 2*len;
        Person[] temp = new Person[newlen];
        System.arraycopy(personArray,0,temp,0,len);
        personArray = temp;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(personArray[i]+", ");
        }
        sb.append(personArray[size-1]+"]");
        return sb.toString();
    }
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return(size==0);
    }

    public Person[] searchByLastName(String lastName) {
        if (lastName == null) {
            return new Person[0];
        }
        List<Person> matchingPersons = new ArrayList<>();
        for (Person p : personArray) {
            if (p != null && lastName.equals(p.getLastName())) {
                matchingPersons.add(p);
            }
        }
        return matchingPersons.toArray(new Person[matchingPersons.size()]);
    }


    public static void main(String[] args) {
        MyPersonList myP = new MyPersonList();
        myP.add("Jorge","Simon",23);
        myP.add("Brook","Burg",55);
        myP.add("Stive","Bell",33);
        System.out.println(myP.searchByLastName("Burg"));





    }
}
