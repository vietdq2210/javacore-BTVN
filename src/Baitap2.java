import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Viết chương trình tính ra số ngày giữa 2 mốc thời điểm người dùng nhập vào. Dữ liệu nhập vào của người dùng
//        sẽ có dạng y1 m1 d1 y2 m2 d2. Với điều kiện mốc thời gian 1 lớn hơn mốc thời gian 2

public class Baitap2 {

    private final static Scanner in = new Scanner(System.in);

    public static String checkInputDate() {
        while(true){
            try{
                String result = in.next().trim();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format.parse(result);
                if(result.equalsIgnoreCase(format.format(date))){
                    return result;
                }else {
                    System.err.println("Re-input");
                }
            }catch (NumberFormatException ex){
                System.err.println("Re-input");
            }catch (ParseException ex){
                System.err.println("Re-input");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        long time ;
        long day = 0;
        System.out.print("Nhap ngay thang nam theo dinh dang 'yyyy-MM-dd': ");
        String input1 = Baitap2.checkInputDate();
        System.out.print("Nhap ngay thang nam theo dinh dang 'yyyy-MM-dd': ");
        String input2 = Baitap2.checkInputDate();
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(input1);
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(input2);
        if(date1.after(date2)){
            time = date1.getTime() - date2.getTime();
            day = TimeUnit.MILLISECONDS.toDays(time);
        }else if(date1.before(date2)){
            time = date2.getTime() - date1.getTime();
            day = TimeUnit.MILLISECONDS.toDays(time);
        }else if(date1.equals(date2)){
            day = 0;
        }else{
            System.out.println("Not found");
        }
        System.out.println("So ngay giua " + input1 + " va " + input2 + " la: " + day + " ngay");
    }


}
