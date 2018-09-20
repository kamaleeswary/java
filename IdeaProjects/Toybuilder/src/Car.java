import java.math.BigDecimal;

public class Car extends Toy implements Movalable {
    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price=price;
    }
    @Override
    public void move() {
        System.out.println("Car can move");
    }
}
