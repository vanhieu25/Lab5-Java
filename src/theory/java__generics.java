package theory;

import java.util.ArrayList;

public class java__generics {
    public static void main(String[] args) {
        System.out.println("run");
        ArrayList<Integer> a = new ArrayList<Integer>();// cu phap generic
        ArrayList<String> b= new ArrayList<String>();
        // java diamond
        ArrayList<String> c = new ArrayList<>();// thay the cho cu phap tren
    }
}
