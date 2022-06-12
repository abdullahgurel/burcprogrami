import java.util.Scanner; // Scanner eklentisi
public class burc1 {
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

        // Switch Başlangıç
        switch (month) {
            // Ocak Ayı Kod Başlangıcı
            case 1 :
                if (day>=1 && day<=31) {
                    if (day<22) {
                        burc = "Oğlak";
                    }else {
                        burc ="Kova";
                    }
                 }
                else {
                    isError = true;;
                }
            // Ocak Ayı Kod Bitişi
                    break;
            // Şubat Ayı Kod Başlangıcı
            case 2 :
                if (day>=1 && day<=28) {
                    if (day<20) {
                        burc ="Kova";
                    }else {
                        burc = "Balık";
                    }
                }
                else {
                    isError = true;;
                }
             // Şubat Ayı Kod Bitişi
                    break;
            // Mart Ayı Kod Başlangıcı
            case 3 :
                if (day>=1 && day<=31) {
                    if (day<21) {
                        burc ="Balık";
                    }else {
                        burc = "Koç";
                    }
                }
                else {
                    isError = true;;
                }
                // Mart Ayı Kod Bitiş
                break;
                // Nisan Ayı Kod Başlangıcı
            case 4 :
                if (day>=1 && day<=30) {
                    if (day<21) {
                        burc ="Koç";
                    }else {
                        burc = "Boğa";
                    }
                }
                else {
                    isError = true;;
                }
                // Nisan Ayı Kod Bitişi
                break;
                // Mayıs Ayı Kod Başlangıç
            case 5 :
                if (day>=1 && day<=31) {
                    if (day<22) {
                        burc ="Boğa";
                    }else {
                        burc = "İkizler";
                    }
                }
                else {
                    isError = true;;
                }
                // Mayıs Ayı Kod Bitişi
                break;
            // Haziran Ayı Kod Başlangıç
            case 6 :
                if (day>=1 && day<=30) {
                    if (day<23) {
                        burc ="İkizler";
                    }else {
                        burc = "Yengeç";
                    }
                }
                else {
                    isError = true;;
                }
                // Haziran Ayı Kod Bitişi
                break;
            case 7 :
                // Temmuz Ayı Kod Başlangıç
                if (day>=1 && day<=31) {
                    if (day<24) {
                        burc ="Yengeç";
                    }else {
                        burc = "Aslan";
                    }
                }
                else {
                    isError = true;;
                }
                // Temmuz Ayı Kod Bitişi
                break;
            case 8 :
                // Ağustos Ayı Kod Başlangıç
                if (day>=1 && day<=31) {
                    if (day<23) {
                        burc ="Aslan";
                    }else {
                        burc = "Başak";
                    }
                }
                else {
                    isError = true;;
                }
                // Ağustos Ayı Kod Bitişi
                break;
            case 9 :
                // Eylül Ayı Kod Başlangıç
                if (day>=1 && day<=30) {
                    if (day<23) {
                        burc ="Başak";
                    }else {
                        burc = "Terazi";
                    }
                }
                else {
                    isError = true;;
                }
                // Eylül Ayı Kod Bitişi
                break;
            case 10 :
                // Ekim Ayı Kod Başlangıç
                if (day>=1 && day<=31) {
                    if (day<23) {
                        burc ="Terazi";
                    }else {
                        burc = "Akrep";
                    }
                }
                else {
                    isError = true;;
                }
                // Ekim Ayı Kod Bitişi
                break;
            case 11 :
                // Kasım Ayı Kod Başlangıç
                if (day>=1 && day<=30) {
                    if (day<22) {
                        burc ="Akrep";
                    }else {
                        burc = "Yay";
                    }
                }
                else {
                    isError = true;;
                }
                // Kasım Ayı Kod Bitişi
            case 12 :
                // Aralık Ayı Kod Başlangıç
                if (day>=1 && day<=31) {
                    if (day<22) {
                        burc ="Yay";
                    }else {
                        burc = "Oğlak";
                    }
                }
                else {
                    isError = true;;
                }
                // Aralık Ayı Kod Bitişi
                break;
            // default başlangıç
            default:
                isError = true;
                    break;

            // default bitiş

        }// Switch Bitiş

        // error ve burç ekrana yazdırma başlangıç
        if (isError) {
            System.out.println("Hatalı giriş yaptınız.Tekrar Deneyiniz.");
        }else {
            System.out.println("Burcunuz : " + burc );
        }
        // error ve burç ekrana yazdırma bitiş
    }
}
