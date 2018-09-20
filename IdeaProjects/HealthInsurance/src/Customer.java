public class Customer  {
    //String claimid="abcd1123";
    public void claimInsurance(String claimid)
    {
        System.out.println("Claim for insurance");
        HealthInsurenceSuryor healthInsurenceSuryor=new HealthInsurenceSuryor();
        Manager manager=new Manager(healthInsurenceSuryor);
        manager.approved(claimid);
    }


}
