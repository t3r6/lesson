package lesson5;

public class OddNumber {
    public static void main(String[] args) {
  /*      System.out.println(args[0]);
        System.out.println(args[1]);*/
        int i = Integer.parseInt(args [0]);
        if(i % 2 !=0){
            System.out.println("Число " + i + " нечетное");
        }
    }
}
