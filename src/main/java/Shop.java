public class Shop {
    public static void main(String[] args) {
        Category category1 = new Category("Pikantne", "Bardzo ostre");
        Category category2 = new Category("Łagodne", "Delikatny smak");

        Product product1 = new Product("Musztarda", 10, "Bardzo ostra, francuska", category1);
        SpecialOffer offer1 = new SpecialOffer(product1, "Promo w tym tygodniu", 7, 0.4);
        product1.showInfo();
        offer1.showOfferInfo();

        Product product2 = new Product("Ketchup", 30, "Bardzo ostry, polski", category1);
        product2.showInfo();

        Product product3 = new Product("Majonez", 10, "Kremowy, Polski smak", category2);
        product3.showInfo();

        Product product4 = new Product("Sos Barbecue", 12, "Amerykanski specjał");
        product4.showNoCategProductInfo();
    }
}

