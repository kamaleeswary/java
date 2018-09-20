public class HealthInsurenceSuryor implements Insurance{
    boolean flag;
//    HealthInsurenceSuryor(String cliamid)
//    {
//        this.claimid=claimid;
//    }
    public boolean validateClaim( String claimid) {
        if(claimid=="abcd1123")
            return true;
        else
            return false;
    }

}

