package com.reservationmanagment;

//import com.reservationmanagment.guest.Guest;
//import com.reservationmanagment.person.Platform;
//import com.reservationmanagment.person.ReservationType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. Soru
        /* 「SORU」
            UML nedir? En yaygın kullanılan UML nedir? İşlevleri ile yazınız.
        */
        /* 「AÇIKLAMA」
            UML (Unified Modeling Language), geliştiricilerin yazılım sistemlerinin sanal olarak tasarlanmasına, görselleştirilmesine,
            oluşturulmasına ve belgelenmesine yardımcı olan standartlaştırılmış bir modelleme dilidir. Programlama dili değildir,
            bir görsel dildir. OOP'in önemli bir parçasıdır.

            En yaygın UML diyagramını OOP için öneminden dolayı sınıf diyagramı olarak sayabiliriz.

            UML'nin temel işlevleri:
            * Modelleme: Karmaşık sistemleri daha anlaşılır hale getirmek ve geliştiricilerin, analistlerin ve daha fazla kişinin ortak bir fikre
            sahip olmalarını sağlamak.
            * İletişim: Geliştiricisinden tasarımcısına, analistinden müşterisine ortak bir dilde konuşma imkanı verir.
            * Tasarım: Sınıf diyagramları, durum diyagramları, etkinlik diyagramları ve diğer türdeki UML diyagramları, bu aşamalarda önemli
            rol oynar.
            * Belgelendirme: Modeller, yazılımın nasıl çalıştığını ve nasıl yapılandırıldığını anlatan ayrıntılı belgelendirme sağlar.
            * Test Etme: Senaryo oluşturma, kullanım durumu diyagramları ve sıra diyagramları gibi UML araçları, test senaryolarının tasarlanmasına
            yardımcı olabilir.
            * Proje Yönetimi: UML, yazılım projelerinin yönetilmesine yardımcı olabilir. Proje ilerlemesini takip etmek ve kaynak elde etmek için
            kullanılabilir.
        */

        // 2. Soru
        /* 「SORU」
            ArrayList, LinkedList, HashMap, HastSet farklarını ve kullanış amaçlarını belirtiniz.
        */
        /* 「AÇIKLAMA」
            -> ArrayList, yeniden boyutlandırılabilir dizi sınıfıdır. Elemanları indeks ile bağlıdır ve hızlıca erişilebilirler.
            Eleman ekleme çıkarma işlemleri sondan kolaydır ancak dizi başında ve ortasında zor olabilir.
            Verilere hızlıca erişmek ve bu sırada performansı göz önünde tutmak önemliyse kullanılabilir.
            -> LinkedList, çift yönlü bağlı koleksiyon sınıfıdır. Elemanlar arasında bağlantılar vardır ve bu sebeple liste başı
            ve sonunda eleman ekleme/çıkarma işlemi hızlıdır. Elemanlara indeksle erişmek daha zor olabilir.
            Sıkılıkla eleman ekleme ve çıkarma işlemi yapılacaksa kullanılabilir.
            -> HashMap, "key/value" ilişkisi ile değer tutan koleksiyondur. Anahtarın tek bir değer için kullanılmasına dikkat edilmelidir.
            Elemanlar rastgele sıralanmıştır. Verileri hızlı bir şekilde aramak ve erişmek gerektiğinde kullanılır.
            -> HashSet, benzersiz elemanları saklayan bir koleksiyon sınıfıdır. Elemanlar sırasızdır. Her eleman sadece bir tanedir.
            Verilerin benzersiz olması gerektiği durumlarda kullanılır.
        */

        System.out.println(changeCase("Deneme Yazısı!"));
        System.out.println(squeeze("Seni sıkacağım yazı!", "Sıktım"));
    }

    public static String changeCase(String text) {
        // 4. Soru
        /* 「SORU」
            Parametresi ile aldığı yazının içindeki küçük harfleri büyük harfe, büyük harfleri ise küçük harfe çevirip yeni bir
            String ile geri dönen changeCase isimli metodu yazınız.
        */
        /* 「AÇIKLAMA」
            "changeCase" fonksiyonu gelen String parametresini ArrayList'te bölerek depolar. Ardından for döngüsüne girilir.
            Eğer girilen yazının karakteri o lokasyonda küçük harf ise dizide aynı lokasyondaki eleman büyük harfe dönüştürülür.
            Aynı işlem tam tersi durumda da yapılır. En son caseArr dizisi birleştirilir ve geriye String olarak döndürülür.
        */
        ArrayList<String> caseArr = new ArrayList<>(Arrays.asList(text.split("")));

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) caseArr.set(i, caseArr.get(i).toUpperCase());
            else caseArr.set(i, caseArr.get(i).toLowerCase());
        } return String.join("", caseArr);
    }

    public static String squeeze(String squeezed, String squeezer) {
        // 5. Soru
        /* 「SORU」
            Parametresi ile aldığı iki yazının birincisi içerisinden ikincisindeki karakterlerin silinmiş olduğu yeni
            bir String döndüren squeeze isimli metodu yazınız ve test ediniz
        */
        /* 「AÇIKLAMA」
            "squeeze" fonksiyonu gelen iki parametredeki (sıkılacak ve sıkacak) stringleri ArrayListle ayırılmış halde saklar.
            Ardından sıkacak dizisinin her karakteri teker teker enhanced for döngüsüne girer. İçinde diğer for döngüsünde
            sıkılacak dizisi boyunca değerlendirme yapılır. EĞER sıkılanın o karakteri büyük ya da küçük halde şuan dönen sıkılacak
            array elemanı ile aynıysa eleman geçici olarak "@/-" olarak değiştirilir.
            Döngü bitince geçici olarak koyduğumuz "@/-" elemanlarının tamamı diziden atılır. En son sıkılacak dizisi
            birleştirilerek ve String haline geri getirilerek döndürülür.
        */
        ArrayList<String> squeezedArr = new ArrayList<>(Arrays.asList(squeezed.split(""))),squeezerArr = new ArrayList<>(Arrays.asList(squeezer.split("")));

        for(String c: squeezerArr) {
            for (int i = 0; i < squeezedArr.size(); i++) {
                if (squeezedArr.get(i).contains(c.toLowerCase()) || squeezedArr.get(i).contains(c.toUpperCase())) squeezedArr.set(i, "@/-");
            }
        }

        squeezedArr.removeAll(Collections.singleton("@/-"));
        return String.join("", squeezedArr);
    }
}
