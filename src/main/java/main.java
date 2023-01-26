import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(rnd.nextInt(100));
        }
        for (int i = 0; i < 20; i++) {
            list2.add(rnd.nextInt(100));
        }
        System.out.println(list1);
        System.out.println(list2);
        list1.removeAll(list2);
        System.out.println(list1);
        System.out.println(list2);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }

        });
        System.out.println(list1);
    }
    }





