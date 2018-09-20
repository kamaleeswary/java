

public class ElectricBulb implements ElectricAppliance {
    @Override
    public boolean turnon() {
        System.out.println("Light is on");
        return false;
    }

    @Override
    public boolean turnoff() {
        System.out.println("Light is off");
        return false;
    }
}
