package lesson8;

public class Aspirant extends Student {
    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    private String scienceWork;
    public Aspirant(String firtsName, String lastName, String group, double avrMark, String scienceWork) {
        super(firtsName, lastName, group, avrMark);
        this.scienceWork = scienceWork;
    }
}
