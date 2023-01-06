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

    double addDiscount() {
        return discount = product.price * 0.80;
    }

    void ShowOfferInfo() {
        System.out.println("Rabat na produkt 20%");
        System.out.println("Promcja na: " + product.name + "/ Opis: " + description + "/ Czas promocji: " +
                promotionTime + " dni/ Cena po rabacie: " + discount + "zł" + "\n");

    }
}
