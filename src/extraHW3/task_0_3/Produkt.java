package extraHW3.task_0_3;

public class Produkt {

    String name;
    double regularPrice;
    double discount;

    public Produkt(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice (double regularPrice, double discount){
        double discountPrice = regularPrice -((regularPrice * discount)/ 100);
        return discountPrice;
    }


}
