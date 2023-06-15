
import java.util.Scanner;


public class yolcu implements YurtDisiKurallari{
    private int harc;
    private  boolean siyasiYasak;
    private boolean vizeDurumu;

    public yolcu(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Yatirdiginiz Harc Bedeli:");
        this.harc= scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Herhangi bir siyasi yasaginiz bulunuyor mu(evet ya da hayir)?");
        
        String cevap =  scanner.nextLine();
        
        if (cevap.equals("evet")  ) {
            this.siyasiYasak= true;
        }
        else{
            this.siyasiYasak= false;
        }
        
        System.out.println("Vizeniz Bulunuyor mu? (evet ya da hayir)");
    
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet")) {
            this.vizeDurumu= true;
        }
        else{
            this.vizeDurumu = false;
        }
    
    }
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if (this.harc<15) {
            System.out.println("Lutfen yurt disi cikis harinizi tam yatiriniz");
            return false;
        }else{
            System.out.println("yurt disi harci islemi tamam");
            return true;
        }
       
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true) {
            System.out.println("Siyasi yasaginiz bulunuyor yurt disina cikamazsiniz");
            return false;
        }else{
            System.out.println("Siyasi yasaginiz bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (this.vizeDurumu == true) {
            System.out.println("Vize islemleri tamamlandi");
            return true;
        }
        else{
            System.out.println("Vizeniz Gideceginiz Ulkeye Bulunmamaktadir");
            return false;
        }
    }
            
}
