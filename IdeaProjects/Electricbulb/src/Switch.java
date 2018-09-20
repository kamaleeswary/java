import java.security.spec.ECField;

public class Switch {
    boolean flag;
    ElectricAppliance electricAppliance;
    Switch(ElectricAppliance electricAppliance)
    {
        this.electricAppliance=electricAppliance;
    }
    public void toggle()
    {
        if(flag){
            electricAppliance.turnoff();
            flag=false;
            }
            else{
                electricAppliance.turnon();
            flag=true;}
    }
}
