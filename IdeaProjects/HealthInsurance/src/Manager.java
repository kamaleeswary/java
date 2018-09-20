public class Manager{
    HealthInsurenceSuryor healthInsurenceSuryor;
   // boolean validate=healthInsurenceSuryor.validateClaim();
    public void approved(String claimid)
    {
        if(healthInsurenceSuryor.validateClaim(claimid))
            System.out.println("Approved");
        else
            System.out.println("Not approved");

    }
    Manager(HealthInsurenceSuryor healthInsurenceSuryor)
    {
         this.healthInsurenceSuryor =healthInsurenceSuryor;
    }

}

