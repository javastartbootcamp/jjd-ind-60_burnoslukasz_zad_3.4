public class SpecialOffer {
    Product product;
    String description;
    int promotionTime;
    double discount;

    public SpecialOffer(Product product, String description, int promotionTime, double discount) {
        this.product = product;
        this.description = description;
        this.promotionTime = promotionTime;
        this.discount = discount;
    }

    double getDiscountPrice() {
        return product.price - product.price * discount;
    }

    void showOfferInfo() {
        System.out.println("Rabat na produkt 20%");
        System.out.println("Promcja na: " + product.name + "/ Opis: " + description + "/ Czas promocji: " +
                promotionTime + " dni/ Cena po rabacie: " + getDiscountPrice() + "zł" + "\n");
    }
}
