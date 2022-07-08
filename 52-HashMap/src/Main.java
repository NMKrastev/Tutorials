import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String, String> countries = new HashMap<String, String>();

        //add a key and value
        countries.put("Bulgaria", "Sofia");
        countries.put("Japan", "Tokyo");
        countries.put("Spain", "Madrid");
        countries.put("Germany", "Berlin");

        //System.out.println(countries);
        //countries.remove("Germany");
        //Gets (in this case) the county's capital
        //System.out.println(countries.get("Japan"));
        //System.out.println(countries);
        //countries.clear();
        //System.out.println(countries.size());
        //countries.replace("Germany", "Munich");
        //System.out.println(countries);
        //System.out.println(countries.containsKey("England"));
        //System.out.println(countries.containsValue("Tokyo"));

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }
    }
}
