package lesson10;

public enum Season {
    WINTER(0), SPRING(15), SUMMER(27){
        public String getDescription(){
            return "Теплое время года";}
    }, AUTUMN(14);

    private double temperature;

    Season(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }
}
