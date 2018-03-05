package lesson10;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(season);
        print(Season.AUTUMN);
        print();
        System.out.println();
        Season myFavSeason = Season.valueOf("AUTUMN");
        System.out.println(myFavSeason);
    }

    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Люблю зиму");
                break;
            case SPRING:
                System.out.println("Люблю весну");
                break;
            case SUMMER:
                System.out.println("Люблю лето");
                break;
            case AUTUMN:
                System.out.println("Люблю осень");
                break;
            default:
                System.out.println("Ошибка");
        }

    }

    public static void print() {
        Season[] values = Season.values();
        for (Season season : values) {
            System.out.println(season);
        }
    }


}

