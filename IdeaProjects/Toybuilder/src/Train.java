import java.math.BigDecimal;

public class Train extends Toy implements Movalable {
    @Override
    public void move() {
        System.out.println("Train can move");
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price=price;
    }
}
