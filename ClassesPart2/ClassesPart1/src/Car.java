import java.util.Locale;

public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private  int doors = 2;
    private boolean convertible = true;

    public  String getMake() {
       return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;

    }
    public boolean isConvertible(){
        return convertible;
    }
    public void setMake(String make){
        if (make == null) make = "Unknown";
        String lowercasemake = make.toLowerCase();
        switch (lowercasemake) {
            case "holden", "porshe", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }
    public void setModel(String model){
        if (model == null) model = "Unknown";
        String lowercasemake = model.toLowerCase();
        switch (lowercasemake) {
            case "holden", "porshe", "tesla" -> this.model = make;
            default -> {
                this.model = "Unsupported";
            }
        }

    }
    public void setColor(String color){
        this.color = color;
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public void setConvertible(boolean convertible){
        this.convertible = convertible;
    }

    public void  describeCar(){
        System.out.println(doors + "-Door" +color + "" + make + "" + model + "" + (convertible? "convertible": "" +
                ""));
    }
}
