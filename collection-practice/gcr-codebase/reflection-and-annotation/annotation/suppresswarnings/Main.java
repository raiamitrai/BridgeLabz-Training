package annotation.suppresswarnings;

import java.util.ArrayList;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();   // warning hidden
        list.add(10);
        list.add("Hello");

        int num = (int) list.get(0);
        System.out.println(num);
    }
}
