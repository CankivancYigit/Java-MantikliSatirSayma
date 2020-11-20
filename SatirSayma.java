//Cankivanc Yigit N17136358
package satirsayma;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class SatirSayma {

    
    public static void main(String[] args) throws IOException {
        
        satirSay("OrtalamaveStandartSapma.java");
        satirSay("SatirSayma.java");
        
        }
    
    public static void satirSay(String Dosya) throws IOException{
    
        BufferedReader reader = null ;
        int satirsayisi = 0;
        try {
            
        reader = new BufferedReader(new FileReader(Dosya));
        
        String satir = reader.readLine();
            while (satir != null) {                
    //Asagida kosullar sayma standardina göre ic ice if yapilarina yazilmistir
              if (satir.length()>0 && (satir.contains(";") || satir.contains("(") || satir.contains("class") || satir.contains("interface"))){
                
                  satirsayisi++;
                
                  if (satir.startsWith("/") || satir.endsWith("/")) {
                      satirsayisi--;
                  }
              }
                
              satir = reader.readLine();
                
            }
        } catch (final IOException e) {
        }
        
        System.out.println("Standarda göre okunan mantikli satir sayisi :" + satirsayisi);}
    
}











