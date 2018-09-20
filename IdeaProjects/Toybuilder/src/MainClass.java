import java.math.BigDecimal;

public class MainClass {
    public static void main(String[] args) {
        Toy toy=new Toy();
        toy.setColor("red");
        toy.setPrice(BigDecimal.valueOf(120000));
        Car car=new Car();
        car.move();
        car.setColor("blue");
        car.setPrice(BigDecimal.valueOf(1200));
        Train train=new Train();
        train.move();
        train.setColor("red");
        train.setPrice(BigDecimal.valueOf(1300));
        Plain plain=new Plain();
        plain.fly();
        plain.move();
        plain.setColor("White");
        plain.setPrice(BigDecimal.valueOf(1205));
    }
}
