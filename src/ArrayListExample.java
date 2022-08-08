import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(8);
        list.add(6);
        list.add(2);

        System.out.println(list);
        int el = list.get(0);
        System.out.println(el);
        // @add
        list.add(1, 1);
        System.out.println(list);

        // @set
        list.set(0, 7);
        System.out.println(list);

        // @remove
        list.remove(2);
        System.out.println(list);

        // @size
        int size = list.size();
        System.out.println(size);

        // @loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        // @sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
