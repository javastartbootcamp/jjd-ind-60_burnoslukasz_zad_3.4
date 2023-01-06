public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;

    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    void showInfo() {
        System.out.println("Produkt: " + name + "/ Cena: " + price + "zł/ Opis: " + description + "/ Kategoria: " +
                category.name + "/ Opis: " + category.description + "\n");
    }

    void showNoCategProductInfo() {
        System.out.println("Produkt: " + name + "/ Cena: " + price + "zł/ Opis: " + description + "\n");

    }
}
