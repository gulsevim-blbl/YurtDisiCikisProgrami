


public class Main {

    public static void main(String[] args) throws InterruptedException {
       
        System.out.println("Sabiha Gokcen Havalimanina Hos geldiniz..");
        
        String sartlar = "Yurt Disi Cikis Kurallari...\n"
                +"Herhangi bir siyasi yasaginiz bulunmamaktadir\n"
                +"15 tl harc bedelinizi tam olarak yatirmaniz gerekiyor\n"
                +"Gideceginiz ulkeye vizenizin bulunmasi gerekir...";
        
        String message = "Yurt Disi Sartlarindan hepsini saglamaniz Gerekmektedir.";
   
                
             while (true) {            
                 System.out.println("******************************");
                  System.out.println(sartlar);
                 System.out.println("******************************");
                 
                 
             
                 yolcu Yolcu = new yolcu();
                 
                 System.out.println("Harc bedeli kontrol ediliyor....");
                 
                 Thread.sleep(3000); // 3 sn bekletme amaçli
                 
                 if (Yolcu.yurtDisiHarciKontrol() == false) {
                     System.out.println(message);
                     continue; //döngünün hemen ilk başına gider!!!!
                 }
                 System.out.println("Siyasi yasak Kontrol ediliyor...");
                 Thread.sleep(3000);
                 
                 if (Yolcu.siyasiYasakKontrol() == false) {
                     System.out.println(message);
                     continue;
                }
                 System.out.println("Vize Durumu Kontrol Ediliyor....");
                 Thread.sleep(3000);
                 
                 if (Yolcu.vizeDurumuKontrol() == false) {
                     System.out.println(message);
                     continue;
                 }
                 System.out.println("Tum Sartlari Sagliyorsunuz,Islemleriniz Tamamalanmistir! Yurt Disina Cikabilirsiniz,Hoscakalin...");
                 break;
    }
    
    }
}