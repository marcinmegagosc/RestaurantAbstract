package pl.gornik.dish;

public class meatDish extends dish{

    private String meatType;

    public meatDish(String name, String price, String components, String meatType) {
        super(name, price, components);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("Przygotowuje danie " + getName());
    }

    @Override
    public void giveDish() {
        System.out.println("Podano danie " + getName());
    }
}
