//Cankivanc Yigit N17136358 ;
package satirobjemethodsayma;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SatirObjeMethodSayma {

    public static void main(String[] args) throws IOException {

        satirveMetodSay("SatirSayma.java");
        MetodSatiriSay("SatirSayma.java");
        satirveMetodSay("OrtalamaveStandartSapma.java");
        MetodSatiriSay("OrtalamaveStandartSapma.java");
    }

    public static void satirveMetodSay(String Dosya) throws IOException {

        BufferedReader reader = null;
        int satirsayisi = 0, metodsayisi = 0;
        try {

            reader = new BufferedReader(new FileReader(Dosya));

            String satir = reader.readLine();
            while (satir != null) {
                //Asagida kosullar sayma standardina göre ic ice if yapilarina yazilmistir
                if (satir.length() > 0 && (satir.contains(";") || satir.contains("(") || satir.contains("class") || satir.contains("interface"))) {

                    satirsayisi++;

                    if (satir.startsWith("/") || satir.endsWith("/")) {
                        satirsayisi--;
                    }
                }

                if ((satir.contains("public") || satir.contains("private") || satir.contains("protected")) && (satir.contains("(") && satir.contains(")"))) {
                    metodsayisi++;
                    
                    if (satir.contains("main")) {
                        metodsayisi--;
                        
                    }
                    
                }

                satir = reader.readLine();

            }
        } catch (final IOException e) {
        }

        System.out.println(Dosya + " adlı dosyanın standarda göre okunan mantikli satir sayisi " + satirsayisi + " ve metod sayisi " + metodsayisi + " dir.");

    }

    public static void MetodSatiriSay(String Dosya) throws IOException {

        BufferedReader reader = null;
        int metodsatirsayisi = 0;
        String metodIsmi = null;
        try {
            reader = new BufferedReader(new FileReader(Dosya));

           String satir = reader.readLine();
            String[] metodismiArray = {};
            
            while (satir != null) {
                if (  (satir.contains("public") || satir.contains("private") || satir.contains("protected")) && (satir.contains("(") && satir.contains(")"))) {
                    
                    
                    metodismiArray = satir.split(" ");
                    metodIsmi = metodismiArray[3];
                    
                }
                if(satir.length() > 0 && (satir.contains(";") || satir.contains("(") || satir.contains("class") || satir.contains("interface"))) {

                    metodsatirsayisi++;

                    if (satir.startsWith("/") || satir.endsWith("/")) {
                        metodsatirsayisi--;
                    }
                }
                
                if (satir.contains("return") || satir.contains("System.out.println")) {
                    System.out.println(metodIsmi + " isimli metodun satir sayisi = " + metodsatirsayisi);
                    metodsatirsayisi = 0;
                    
                }
                
                 satir = reader.readLine();
                
            }
            
        } catch (FileNotFoundException ex) {
        }
    }
}














































































































