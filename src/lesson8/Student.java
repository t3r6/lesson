package lesson8;

public class Student {
    private String firtsName, lastName, group;
    private double avrMark;

    public Student(String firtsName, String lastName, String group, double avrMark) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.group = group;
        this.avrMark = avrMark;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAvrMark() {
        return avrMark;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAvrMark(double avrMark) {
        this.avrMark = avrMark;
    }
}
