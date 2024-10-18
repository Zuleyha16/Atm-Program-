import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int bakiye = 2000;
        String islemler = "1. İşlem: Bakiye Sorgulama\n"
                        + "2. İşlem: Para Çekme\n"
                        + "3. İşlem: Para Yatırma\n"
                        + "Çıkış için a'ya basınız";
        
        System.out.println("**********");
        System.out.println(islemler);
        System.out.println("**********");
        
        while (true) {
            System.out.println("Lütfen İşlem Seçiniz: ");
            String islem = scanner.nextLine();        // *
            
            if (islem.equals("a")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();     
                                        
                if (bakiye-tutar < 0) {
                    System.out.println("Yeterli Bakiye Yok. Bakiyeniz: " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz: " + bakiye);
                }
            }                           
            else if (islem.equals("3")) {
                System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                bakiye += tutar;
                System.out.println("Yeni Bakiyeniz: " + bakiye);
            }
            else {
                System.out.println("Geçersiz İşlem...");
            }
            
        }
    }
}