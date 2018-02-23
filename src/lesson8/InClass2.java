package lesson8;

public class InClass2 {
    public static void main(String[] args) {
        Student student = new Aspirant("Вася", "Галушкин", "666", 2.5, "HellResearch");
        Student student1 = new Student("Вася", "Галушкин", "666", 2.5);
        Aspirant student2 = new Aspirant("Вася", "Галушкин", "666", 2.5, "HellResearch");
        System.out.println(student.getFirtsName() + " " + student.getLastName() +" "+ student.getAvrMark());
        System.out.println(student1.getFirtsName() + " " + student1.getLastName() +" "+ student1.getAvrMark());
        System.out.println(student2.getFirtsName() + " " + student2.getLastName() +" "+ student2.getAvrMark() +" "+ student2.getScienceWork());
    }
}
