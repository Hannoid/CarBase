package TestClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {



    static class Ab {
        int f;
        int b;
    }


    public static void main(String[] args) {
        Ab Abclass = new Ab();
        Abclass.b = 2;
        Abclass.f = 6;
        ArrayList<Integer> TestArray  = new ArrayList<Integer>();
        TestArray.add(15);
        TestArray.add(7);
        TestArray.add(10);
        TestArray.add(50);


        String[] arr = new String[]{"123123123123as","1","4","7","3","2","1","asdasd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);


        System.out.println(Arrays.toString(arr));


        System.out.println(TestArray);

        System.out.println(Abclass.b + Abclass.f);
        Collections.sort(TestArray);
        System.out.println(TestArray);
        Collections.reverse(TestArray);
        System.out.println(TestArray);

    }
}
