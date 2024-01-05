package pl.gornik.dish;

public class vegetarianDish extends dish{

    public vegetarianDish(String name, String price, String components) {
        super(name, price, components);
    }

    @Override
    public void prepare() {
        System.out.println("przygotowuje danie wegetariańskie " + getName());
    }

    @Override
    public void giveDish() {
        System.out.println("Podano danie wegetariańskie " + getName());
    }
}
