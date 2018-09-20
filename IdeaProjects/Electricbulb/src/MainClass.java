public class MainClass {
    public static void main(String[] args) {
        ElectricBulb electricBulb=new ElectricBulb();
        Switch switch1=new Switch(electricBulb);
        switch1.toggle();
        switch1.toggle();
    }
}
