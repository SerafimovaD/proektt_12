package proektt_12;

public class Vehicle1 {
    private String color;

    Vehicle1(String a) {
        color = a;
    }
    Vehicle1(){
    	color="Blue";
    }
    @Override
    public String toString() {
        return color;
    }
}
