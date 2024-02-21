package SelfPractices;

public abstract class VusaMember {
    private final String currency;

    private double courseBTC;

    public VusaMember(String currency) {
        this.currency = currency;
        setActualBtsCourse();
    }
    public void setActualBtsCourse(){
        this.courseBTC = 52_000;
    }

    public String getCurrency() {
        return currency;
    }

    public double getCourseBTS() {
        return courseBTC;
    }

    public void setCourseBTS(double courseBTS) {
        this.courseBTC = courseBTS;
    }
}
