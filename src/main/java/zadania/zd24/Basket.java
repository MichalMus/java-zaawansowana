package zadania.zd24;

public class Basket {
    private Integer quantity;

    public Basket() {
        this.quantity = 0;
    }

    public Integer getQuantity() {
        return quantity;
    }

public void addToBasket(){
        this.quantity+=1;
}
}
