package theory;

import java.util.ArrayList;
import java.util.Arrays;

public class arrylist {
    // dinh nghia
    public static void main(String[] args) {
        // khong khai bao type
        ArrayList a = new ArrayList();
        a.add("hieu");
        a.add(26);
        // khai bao cu the
        ArrayList<String> b = new ArrayList<>();
        b.add("nguyen van hieu");
        b.add("hieudeptraibodoiqua!!");
        // cac method hay dung
        b.add("them phan tu vao cuoi");
        b.remove(1);// xoa dua vao index
        b.remove("nguyen van hieu"); // xoa obj
        b.get(1);// truy cap phan tu tai bi tri index
        b.clear();// xoa tat ca
    }
}
