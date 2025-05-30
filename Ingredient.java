public class Ingredient {
    private String name;
    private double amount;
    private String unit;

    public Ingredient(){
    }

    public Ingredient(String name, double amount, String unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

//    getters
    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

//    setters
    public void setName(String name){
        this.name = name;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

}
