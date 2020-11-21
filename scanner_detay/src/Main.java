
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
          Scanner scn = new Scanner(System.in);
      objemiz oluştu
        int yas = scn.nextInt();
        String isim = scn.nextLine();
        System.out.println("yaş : " +yas);
        System.out.println("isim : " +isim);,
        bu duru çalıştırıldığında yaş girildiğinde isim sorulmaksızın işlem sona eriyor...
        enter java tarafından \n olarak algılanıyor hatanın sebebi budur.
        hatanın çözümü aşağıdaki bloktadır.
        
        */
        Scanner scn = new Scanner(System.in);
        int yas = scn.nextInt();
        scn.nextLine();//Dummy
        String isim = scn.nextLine();
        System.out.println("yaş : " +yas);
        System.out.println("isim : " +isim);
        /*
        Bu sorun next intten sonra nextLine almaya çalıştığımız zaman meydana geliyor nextLine ardından nextInt alırken böyle bir sorunla karşılaşmıyoruz...
        alttaki yapı kurulmuş olsaydı ekstra bir işlem olan Dummy gerekmeyecekti.
        */
        String isim1 = scn.nextLine();
        int yas1 = scn.nextInt();
      
        System.out.println("yaş : " +yas1);
        System.out.println("isim : " +isim1);
        
        //new operation 
        
        int Tyson = scn.nextInt();
        int jordan = scn.nextInt();
        int james = scn.nextInt();
        System.out.println("age of Tyson" +Tyson);
        System.out.println("age of jordan" +jordan);
        System.out.println("age of james" +james);


    
    
    }
    
}
