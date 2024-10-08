import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_Java {
    public static void main(String[] args) {
        //Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa nhập và tính tổng của nó
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while (true){
            System.out.println("Nhap vao so thuc: ");
            double in = sc.nextDouble();
            list.add(in);
            sc.nextLine();
            System.out.println("Ban co muom nhap them khong? (Y/N)");
            String luaChon =sc.nextLine();
            if (luaChon.equals("N")|| luaChon.equals("n")){
                break;
            }
        }
        System.out.println("check "+ list);
        double sum=0;
        for (int i =0; i < list.size();i++){
            sum += list.get(i);
        }
        System.out.println("check "+sum);
    }
}
