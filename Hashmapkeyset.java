import java.util.*;
class Hashmapkeyset{
  public static void main(String[] args) {
      HashMap<String,String> names=new HashMap<String,String>();
      names.put("Teju","Tejaswi");
      names.put("Venkat","daddy");
      for(String i:names.keySet()){
        System.out.println(i);
      }
  }
}