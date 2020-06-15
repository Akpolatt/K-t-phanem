/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphanem;
import java.util.Random; 

/**
 *
 * 
 */
public class Kitaplarim {
    private String Adi;
    private String Yazar;
    private String Yayin;
    private String Durum;
    private String Tip;
   
    
    public Kitaplarim()
    {
        
    }
    public Kitaplarim(String Adi, String Yazar, String Yayin, String Durum, String Tip) {
        this.Adi = Adi;
        this.Yazar = Yazar;
        this.Yayin = Yayin;
        this.Durum = Durum;
        this.Tip = Tip;
    }
  
   
  

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String Adi) {
        this.Adi = Adi;
    }

    public String getDurum() {
        return Durum;
    }

    public void setDurum(String Durum) {
        this.Durum = Durum;
    }

    public String getTip() {
        return Tip;
    }

    public void setTip(String Tip) {
        this.Tip = Tip;
    }

    public String getYayin() {
        return Yayin;
    }

    public void setYayin(String Yayin) {
        this.Yayin = Yayin;
    }

    public String getYazar() {
        return Yazar;
    }

    public void setYazar(String Yazar) {
        this.Yazar = Yazar;
    }
            
  public String KitapSec()
  {
      String kitapTuru[]=new String[5];;
      String Sonuc;
      kitapTuru[0]="Korku";
      kitapTuru[1]="Gerilim";
      kitapTuru[2]="Deneme";
      kitapTuru[3]="Roman";
      Random rnd = new Random();
      int Uretilen=rnd.nextInt(5);
      switch(Uretilen)
      {
          case 1: Sonuc="Korku";
              break;
          case 2: Sonuc="Gerilim";
              break;
          case 3: Sonuc="Deneme";
              break;
          case 4: Sonuc="Roman";
              break;
          default : Sonuc="Roman";
              break;
              
      }
 
      return  Sonuc;
  }
    
}
