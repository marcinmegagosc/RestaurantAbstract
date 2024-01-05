package pl.gornik.dish;

public abstract class dish {
    private String name;
    private String price;
    private String components;

    public dish(String name, String price, String components) {
        this.name = name;
        this.price = price;
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public abstract void prepare();
    public abstract void giveDish();
    public void displayInfo(){
        System.out.println("danie: " + name + " kosztuje " + price + " składa się z " + components);
    }

    public void changeComponents(String components){
        this.components = components;
    }
}


