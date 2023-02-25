package concepts;
import java.util.ArrayList;
import java.util.Collections;


// Array list impllementation

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // adding values to arraylist
        list.add(2);
        list.add(3);
        list.add(4);

        // getting values from arraylist
        // int ele = list.get(0);

        // adding values to aspecific index
        list.add(0, 1);

        // sets the 2 index with value 33
        list.set(2, 33);

        // removes the specified index element
        list.remove(2);

        // return the size of the element
        int s = list.size();
        // System.out.println(s);

        // loops

        for(int i=0;i<s;i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
