import java.util.HashMap;
/**
 * Created by gp2746me on 9/26/2018.
 */
    public class HashMapExamples{
        public static void main(String[] args) {
            HashMap<String,Integer> snowfall = new HashMap();
            snowfall.put("January",3);
            snowfall.put("February",10);
            snowfall.put("March",4);
            snowfall.put("April",0);


            //System.out.println("In January", + snowfall.get("January") + " inches of snow fell");
                for (String s:snowfall.keySet()){
                System.out.println("Month:" + s);
                System.out.println("Snowfall inches: " + snowfall.get(s));
        }

    }
}
