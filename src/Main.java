import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

////        Istifadeci imtahan balini daxil etdikde hansi herfle qiymetlendirildiyini oyrenir.
//
//        System.out.print("Imatahan balini daxil et: ");
//        int a = scanner.nextInt();
//        if (a <= 50) {
//            System.err.println("Imtahandan kece bilmediz.");
//        } else if (50 < a && a < 61) {
//            System.out.println("Imtahandan E aldiniz.");
//        }else if (a>=61 && a<71){
//            System.out.println("Imtahandan D aldiniz.");
//        }else if (a>=71 && a<81){
//            System.out.println("Imtahandan C aldiniz.");
//        }else if (a>=81 && a<91){
//            System.out.println("Imtahandan B aldiniz.");
//        }else if (a>=91 && a<=100){
//            System.out.println("Imtahandan A aldiniz.");
//        }else {
//            System.err.println("Imtahan bali duzgun daxil edilmiyib.");
//        }


////        Istifadecinin dogum ilinin alib yasinin hesablanmasi
//
//        System.out.print("Doguldugunuz ili daxil edin: ");
//        int a = scanner.nextInt();
//        int c = 2025 - a;
//        if (a>2025 || a<=0){
//            System.err.println("Dogum ilinizi duzgun daxil etmemisiniz.");
//        }else if (a == 2025) {
//            System.out.println("Yeni dogulmus usaq.");
//        }else {
//            System.out.println(c);
//        }


//        3 reqemli ededin mertebelere ayirilmasi


//        System.out.print("Ededi daxil edin: ");
//        int a = scanner.nextInt();
//        int yuzluk = a / 100;
//        int onluq = (a / 10) - (a / 100) * 10;
//        int teklik = a - ((yuzluk * 100) + (onluq * 10));
//
//        if (a >= 100 && a <= 999) {
//            System.out.println("Eded musbet ededdir");
//            System.out.println("Yuzluk: " + yuzluk);
//            System.out.println("Onluq: " + onluq);
//            System.out.println("Teklik: " + teklik);
//        } else if (a <= -100 && a >= -999) {
//            System.out.println("Eded menfi ededdir");
//            System.out.println("Yuzluk: " + yuzluk);
//            System.out.println("Onluq: " + onluq);
//            System.out.println("Teklik: " + teklik);
//        } else {
//            System.err.println("Eded 3 reqemli eded deyil.");
//        }

//        String a = scanner.next();
//        String b = a.toLowerCase();
//        if(b.startsWith("s") ){
//            System.out.println("S ile basdiyir");
//        }else {
//            System.out.println("Soz S herfi ile baslamir");
//            String c = a.substring(2);
//            System.out.println(c);
//        }


//        Random b = new Random();
//        System.out.print("Ededi daxil edin:" );
//        int a = scanner.nextInt();
//
//
//        int c = b.nextInt(20);
//        int d = a-c;
//        if(d<0){
//            System.out.println(d +" Eded menfidir");
//        }else {
//            System.out.println(d + " Eded musbetdir");
//
//        }



//        looplar dovrler

//        int a = 3;
//        while(a<=10){
//            System.out.println(a);
//            a+=2;
//        }


        for( int m = 10; m>=1; m--){
            System.out.println(m);
        }





    }
}