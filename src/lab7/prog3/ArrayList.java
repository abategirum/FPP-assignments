package lab7.prog3;

import java.util.Arrays;

public class ArrayList {
    private final int INITIAL_LENGTH = 4;
    private Marketing[] markArray;
    private int size;

    public ArrayList() {
        markArray = new Marketing[INITIAL_LENGTH];
        size = 0;
    }
    // Add element in last
    public void add(Marketing s){
        if(s==null) return;
        if(size == markArray.length) resize();
        markArray[size++] = s;
    }

    public Marketing get(int i){
        if(i < 0 || i >= size){
            return null;
        }
        return markArray[i];
    }

    public boolean find(String s){
        if(s==null) return false;
        for(Marketing mark : markArray){
            if(mark.equals(s)) return true;
        }
        return false; // The element is not in the list
    }

    public void insert(Marketing s, int pos){
        if(pos > size || pos<0 ) return;
        if(pos == markArray.length||size+1 > markArray.length) {
            resize();
        }
        Marketing[] temp = new Marketing[markArray.length+1];
        System.arraycopy(markArray,0,temp,0,pos);
        temp[pos] = s;

        System.arraycopy(markArray,pos,temp,pos+1, markArray.length - pos);
        markArray = temp;
        ++size;
    }

    public boolean remove(Marketing s){
        if(size == 0) return false; // list is empty
        if(s==null) return false;
        int index = -1;
        for(int i = 0; i < size; ++i ){
            if(markArray[i].equals(s)){
                index = i;
                break;
            }
        }
        if(index==-1) return false; // s is not found in the list
        Marketing[] temp = new Marketing[markArray.length];
        System.arraycopy(markArray,0,temp,0,index);
        System.arraycopy(markArray,index+1,temp,index,markArray.length-(index+1));
        markArray = temp;
        --size;
        return true;
    }

    private void resize(){
        System.out.println("resizing");
        int len = markArray.length;
        int newlen = 2*len;
        Marketing[] temp = new Marketing[newlen];
        System.arraycopy(markArray,0,temp,0,len);
        markArray = temp;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(markArray[i]+", ");
        }
        sb.append(markArray[size-1]+"]");
        return sb.toString();
    }
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return(size==0);
    }
    public Object clone()
    {
        Marketing[] temp = Arrays.copyOf(markArray, size);
        return temp;

    }




    public static void main(String[] args) {

    }
}
