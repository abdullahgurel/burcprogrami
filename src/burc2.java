import java.util.Scanner; // Scanner eklentisi

public class burc2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner eklenmesi

        int month,day; // int değişkenleri
        String burc = ""; // string değişkenimiz
        boolean isError =false; // boolean değişkeni

        //kullanıcıdan değer isteme başlangıç
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Gün : ");
        day = input.nextInt();
        //kullanıcıdan değer isteme bitiş

        // Ocak Ayı Kod Başlangıcı
        if (month==1) {
            if (day>=1 && day<=31) {
                if (day<22) {
                    burc = "Oğlak";
                }else {
                    burc ="Kova";
                }
            }
        }
        // Ocak Ayı Kod Bitişi
        // Şubat Ayı Kod Başlangıcı
        else if (month==2) {
            if (day>=1 && day<=28) {
                if (day<20) {
                    burc ="Kova";
                }else {
                    burc = "Balık";
                }
            }
        }
        // Şubat Ayı Kod Bitişi
        // Mart Ayı Kod Başlangıcı
        else if (month==3) {
            if (day>=1 && day<=31) {
                if (day<21) {
                    burc ="Balık";
                }else {
                    burc = "Koç";
                }
            }
        }
        // Mart Ayı Kod Bitiş
        // Nisan Ayı Kod Başlangıcı
        else if (month==4) {
            if (day>=1 && day<=30) {
                if (day<21) {
                    burc ="Koç";
                }else {
                    burc = "Boğa";
                }
            }
        }
        // Nisan Ayı Kod Bitiş
        // Mayıs Ayı Kod Başlangıcı
        else if (month==5) {
            if (day>=1 && day<=31) {
                if (day<22) {
                    burc ="Boğa";
                }else {
                    burc = "İkizler";
                }
            }
        }
        // Mayıs Ayı Kod Bitiş
        // Haziran Ayı Kod Başlangıcı
        else if (month==6) {
            if (day>=1 && day<=30) {
                if (day<23) {
                    burc ="İkizler";
                }else {
                    burc = "Yengeç";
                }
            }
        }
        // Haziran Ayı Kod Bitiş
        // Temmuz Ayı Kod Başlangıcı
        else if (month==7) {
            if (day>=1 && day<=31) {
                if (day<24) {
                    burc ="Yengeç";
                }else {
                    burc = "Aslan";
                }
            }
        }
        // Temmuz Ayı Kod Bitiş
        // Ağustos Ayı Kod Başlangıcı
        else if (month==8) {
            if (day>=1 && day<=31) {
                if (day<23) {
                    burc ="Aslan";
                }else {
                    burc = "Başak";
                }
            }
        }
        // Ağustos Ayı Kod Bitiş
        // Eylül Ayı Kod Başlangıcı
        else if (month==9) {
            if (day>=1 && day<=30) {
                if (day<23) {
                    burc ="Başak";
                }else {
                    burc = "Terazi";
                }
            }
        }
        // Eylül Ayı Kod Bitiş
        // Ekim Ayı Kod Başlangıç
        else if (month==10) {
            if (day>=1 && day<=31) {
                if (day<23) {
                    burc ="Terazi";
                }else {
                    burc = "Akrep";
                }
            }
        }
        // Ekim Ayı Kod Bitiş
        // Kasım Ayı Kod Başlangıç
        else if (month==11) {
            if (day>=1 && day<=30) {
                if (day<22) {
                    burc ="Akrep";
                }else {
                    burc = "Yay";
                }
            }
        }
        // Kasım Ayı Kod Bitiş
        // Aralık Ayı Kod Başlangıç
        else if (month==12) {
            if (day>=1 && day<=31) {
                if (day<22) {
                    burc ="Yay";
                }else {
                    burc = "Oğlak";
                }
            }
        }
        // Aralık Ayı Kod Bitiş
        // İsError Ve Burç Ekrana Çıktı Kodu Başlangıç
        else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız.Tekrar Deneyiniz.");

        }else {
            System.out.println("Burcunuz : " + burc );
        }
        // İsError Ve Burç Ekrana Çıktı Kodu  Bitiş
    }
}
