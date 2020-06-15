/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kutuphanem;
/**
 *
 * 
 */
public class Kutuphanem {

    /**
     *
     */
    public static void main(String[] args) {
        
       // hocam arayüz yapamadım. Örnek olsun diye 10 adet kitap yaptım 
        Kitaplarim[] myKitap=new Kitaplarim[10];
        for(int i=0; i<myKitap.length; i++)
        {
        myKitap[i]=new Kitaplarim();
        myKitap[i].setAdi(i+". kitap Adı");
        myKitap[i].setYazar(i+". Yazar Adı");
        myKitap[i].setYayin(i+".ci yayın evi");
        myKitap[i].setDurum(i+ ". kitap Yayında");
        myKitap[i].setTip(myKitap[i].KitapSec());
        }
        
     
        for(int j=0; j<myKitap.length; j++)
        {
          System.out.println(myKitap[j].getAdi() + " "  + myKitap[j].getYazar() + " " + myKitap[j].getYayin() + " Türü :" + myKitap[j].getTip() + "Durum :"  + myKitap[j].getDurum());
          
        }
}

}