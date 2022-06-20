import java.util.Scanner;

//Viết một chương trình nhận vào 1 trong 12 tháng làm input. Output là số ngày trong tháng từ input. Giả sử tháng 2 luôn chỉ có 28 ngày. Yêu cầu làm theo 2 cách:
//        Cách 1: Sử dụng enum và cấu trúc switch.
//        Cách 2: Không sử dụng enum.
public class Baitap1 {
    private final static Scanner in = new Scanner(System.in);
    public enum Month {
        January(31),February(28),March(31),April(30),May(31),June(30),July(31),
        August(31), September(30),October(31),November(30),December(31);
        private int day;
        private Month(int day){
            this.day = day;
        }
    }

    public static int checkInputMonth(){
        while (true) {
            try {
                int input = Integer.parseInt(in.next().trim());
                if (input >= 1 && input <= 12) {
                    return input;
                } else {
                    System.err.println("Nhap thang sai");
                    System.out.print("Nhap lai thang: ");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Nhap so thang tu 1 den 12");
                System.out.print("Nhap lai thang: ");
            }
        }
    }
    public static void cach1(int input) {
        Month m = Month.values()[input-1];
        switch (m){
            case January,February,March,April,May,June,July,August,September,October,November,December:
                System.out.println(m+ " has the number of days: " + m.day);
        }
    }

    public static void cach2(int input) {
        switch (input){
            case 1,3,5,7,8,10,12:
                System.out.println("Thang " + input + " co so ngay la: 31 ngay");
                break;
            case 2:
                System.out.println("Thang " + input + " co so ngay la: 28 ngay");
                break;
            case 4,6,9,11:
                System.out.println("Thang " + input + " co so ngay la: 30 ngay");
                break;
            default:
                System.out.println("Nhap thang khong hop le");
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhap thang: ");
        int input = checkInputMonth();
        cach1(input);
        cach2(input);
    }


}
