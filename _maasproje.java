package task5;

import java.util.Scanner;

public class _maasproje {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float tplmMaas;
        float sbtMaas;
        float prim;
        float satisKazanci;
        float primOrani;
        float performans;

        System.out.print("Sabit Maaşınız Nedir=");
        sbtMaas=scanner.nextFloat();
        System.out.print("Satış Kazancınız Nedir=");
        satisKazanci=scanner.nextFloat();
        System.out.print("Performans Seviyesini Giriniz=");
        performans=scanner.nextFloat();

        if (satisKazanci>performans){
            primOrani=0.10F;
        } else {
            primOrani=0.05F;
        }
        prim=satisKazanci*primOrani; //prim hesaplama kuralı
        tplmMaas=sbtMaas+prim;

        System.out.println("MAAŞ="+tplmMaas);
        scanner.close();

    }
}
