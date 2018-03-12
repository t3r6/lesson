package lesson12;

public class StringDemo {
    public static void main(String[] args) {
        verifyString("I like Java!!!");
        verifyString("I hate Java");
        lastChar("I like Java!!!");
        find("I like Java!!!");
        modifyString("I like Java!!!");
        System.out.println("I like Java!!!".substring(7,11));
    }
    public static void verifyString(String str){
        System.out.println(str);
        System.out.println("Ends with: " + str.endsWith("!!!"));
        System.out.println("Starts with: " + str.startsWith("I like"));
        /*System.out.println(str.charAt(0));*/
    }
    public static void lastChar(String str){
        int len = str.length()-1;
        System.out.println(str.charAt(len));
    }
    public static void find (String str){
        System.out.println(str.indexOf("Java"));
    }
    public static void modifyString(String str){
        System.out.println(str.replace('a','o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
