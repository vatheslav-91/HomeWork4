public class Main {
    public static void main(String[] args){

         int year = 2021;
         if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             System.out.printf("Год %s високосный", year);
         }else {
             System.out.printf("Год %s не високосный",year);
         }

 }
            }



