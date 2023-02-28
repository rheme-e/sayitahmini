package HarmonikOrt;
import java.util.Arrays;
import java.util.Scanner;
public class tahminoyunu {




    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner inp=new Scanner(System.in);
        int chance=0;
        int[] wrong=new int[5];

        System.out.println(number);

        while(chance<5){
            System.out.println("Bir sayı tahmin ediniz:");
            int selected= inp.nextInt();

            if(selected == number){
                System.out.println("Tebrikler doğru bildiniz!");
                break;
            }else if(selected <0 || selected >100){
                System.out.println("Girdiğiniz sayı 0-100 aralığında olmalıdır!");

                if(chance==5){
                    System.out.println("Hakkınız bitti");
                }
            }else if(selected<number){
                System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür!");
                wrong[chance]=selected;
                chance++;
                System.out.println("Kalan hakkınız: "+(5-chance));
                if(chance==5){
                    System.out.println("Hakkınız bitti");
                }
            }else if(selected>number){
                System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür!");
                wrong[chance]=selected;
                chance++;
                System.out.println("Kalan hakkınız: "+(5-chance));
                if(chance==5){
                    System.out.println("Oyun bitti");
                    break;
                }
            }

        }
        if(wrong[0]!=0){
            System.out.println("Hatalı girilen değerler:"+ Arrays.toString(wrong));
            System.out.println("Gizli Sayı:"+number);
        }



    }
}
