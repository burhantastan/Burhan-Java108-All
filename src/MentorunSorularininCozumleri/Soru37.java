package MentorunSorularininCozumleri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru37 {


        /*Soru 37-)
        --BONUS--  ---SORU AŞKIYLA YANIP TUTUŞANLAR İÇİN :-))---
                (Eliminate duplicates)
        ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
                On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
                ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5

         */

        public static void main(String[] args) {
            int[] arr={1, 2 ,3 ,2 ,1, 6 ,3 ,4, 5 ,2,5,8};
            System.out.println(Arrays.toString(eliminateDuplicates(arr)));
        }
        public static int[] eliminateDuplicates(int[] list) {
            List<Integer> tekrarsiz = new ArrayList<>();
            for (int i = 0; i <list.length; i++) {
                if (!tekrarsiz.contains(list[i])){
                    tekrarsiz.add(list[i]);
                }

             }
            int []eliminateDuplicates=new int[tekrarsiz.size()];
            for (int i = 0; i <tekrarsiz.size() ; i++) {
                eliminateDuplicates[i]=tekrarsiz.get(i);
            }
            return eliminateDuplicates;//[1, 2, 3, 6, 4, 5, 8]

        }
}
