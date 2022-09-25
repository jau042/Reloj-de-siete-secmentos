package reloj.de.siete.secmentos;

import java.util.Scanner;

public class RelojDeSieteSecmentos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dato = 0, horas = 0, minutos = 0, segundos = 0,numsecmentos = 0;;
        dato = leer.nextInt();
        String seg = "", min = "", hor = "";
        for (int i = 0; i <= dato; i++) {
            segundos = i;
            if (segundos > 59) {segundos = 0; minutos++;               
                if (minutos > 59) { minutos = 0;horas++;                                       
                    if (horas > 12) {horas = 0;}}}                        
            if (segundos < 10) {seg = "0" + segundos;}
            if (minutos < 10) {min = "0" + minutos;}
            if (horas < 10) {hor = "0" + horas;}
            String hora = hor + min + seg;
            for (int j = 0; j < hora.length(); j++) {
                char a = hora.charAt(j);
                switch (a) {
                    case '0':case '6':case '9':
                        numsecmentos = numsecmentos + 6;break;
                    case '1':
                        numsecmentos = numsecmentos + 2;break;
                    case '2':case '3':case '5':
                        numsecmentos = numsecmentos + 5;break;
                    case '4':case '7':
                        numsecmentos = numsecmentos + 4;break;
                    case '8':
                        numsecmentos = numsecmentos + 7;break;
                }
            }
        }
        System.out.println(numsecmentos);
    }
}