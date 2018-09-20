import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapValue {
    //public static void main(String[] args) {
    public Map<String,String> mapvalue(Map<String,String> hm ){
//        String str1 = "";
//        int count = 0;
//        Map<String, String> hm = new HashMap<String, String>();
//        hm.put("val1", "C++");
//        hm.put("val2", "java");
        if(hm.get("val1")!=null) {
            hm.put("val2",hm.get("val1"));
            hm.put("val1"," ");
        }
        System.out.println(hm);
        return hm;
    }
}


