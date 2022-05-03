package testArraylist;


import java.util.ArrayList;
import java.util.Arrays;

public class TestArray {

    private String name;

    public TestArray(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestArray{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<TestArray> testremove = new ArrayList<>();
//        testremove[0] = new TestArray("asdasd");
//        testremove[1] = new TestArray("asdasd 2");
//        testremove[1].r
        TestArray test1 = new TestArray("test 1");
        TestArray test2 = new TestArray("test 2");


        testremove.add(test1);
        testremove.add(test2);
        //testremove.remove(1);
        testremove.remove(test1);
        System.out.println(testremove.toString());
    }
}
