import java.util.HashSet;
import java.util.Iterator;
public class file9 {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Chennai");
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String city:cities){
            System.out.println(city);
        }
    }
}
