
//Viết một chương trình tính tổng các số nguyên tố từ 1 đến 10_000 với 3 cách.
//Mỗi cách yêu cầu sử dụng 1 cấu trúc lặp khác nhau bao gồm: while, do while và for.

public class Baitap3 {
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int cach1(){
        int total = 0;
        for(int i=1;i<=10000;i++){
            if(isPrimeNumber(i)){
                total += i;
            }
        }
        return total;
    }
    public static int cach2(){
        int total = 0;
        int i = 0;
        while (i<=10000){
            if(isPrimeNumber(i)){
                total += i;
            }
            i++;
        }
        return total;
    }
    public static int cach3(){
        int total = 0, i = 0;
        do{
            if (isPrimeNumber(i)){
                total += i;
            }
            i++;
        }while (i<=10000);
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Tong cac so nguyen to tu 1 den 10000 la: " + cach1());
        System.out.println("Tong cac so nguyen to tu 1 den 10000 la: " + cach2());
        System.out.println("Tong cac so nguyen to tu 1 den 10000 la: " + cach3());
    }
}
