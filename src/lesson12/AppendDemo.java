package lesson12;

public class AppendDemo {
    public static void main(String[] args) {
        calculate(3, 56);
    }

    private static void calculate(int a, int b) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(a).append("+").append(b).append("=").append(a + b).append("\n");
        stringBuilder.append(a).append("-").append(b).append("=").append(a - b).append("\n");
        stringBuilder.append(a).append("*").append(b).append("=").append(a * b).append("\n");
        System.out.println(stringBuilder);

        int pos = 0;
       /* while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно ");
        }*/

        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos,pos+1, " равно ");
           /* stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно ");*/
        }
        System.out.println(stringBuilder);
    }
}
