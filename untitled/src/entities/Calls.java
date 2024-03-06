package entities;

public class Calls {

    //ATTRIBUTES LIST:
    private String number;
    private double duration;

    //CONSTRUCTOR:
    public Calls(String number, double duration) {
        this.number = number;
        this.duration = duration;
    }


    //  METHOD TO STRING:
    @Override
    public String toString() {
        return "Calls to " + number + " " + "(duration: " + duration + " minutes)";
    }
}
