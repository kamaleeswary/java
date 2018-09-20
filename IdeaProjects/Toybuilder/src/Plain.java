import java.math.BigDecimal;

public class Plain extends Toy implements Flyable,Movalable {
    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price=price;
    }
    @Override
    public void fly() {
        System.out.println("Plain can fly");
    }

    @Override
    public void move() {
        System.out.println("Plain can move");
    }

}
