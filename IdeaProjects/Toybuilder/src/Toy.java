import java.math.BigDecimal;
import java.math.BigInteger;
public class Toy implements ToyProperties {
String color;
BigDecimal price;

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setPrice(BigDecimal price) {
    this.price=price;
    }
}
