import sun.reflect.generics.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> autoList = Arrays.asList(
                "Audi", "BMW", "Mercedes", "Audi", "Toyota", "Volkswagen",
                "Opel", "Subaru", "Toyota", "Volkswagen", "BMW", "Audi",
                "Toyota", "Subaru", "Toyota", "Subaru");
        System.out.println(autoList);

        Set<String> uniqueAuto = new HashSet<>();
        autoList.forEach (auto -> uniqueAuto.add(auto));
        System.out.println(uniqueAuto);

        HashMap<String, Integer> countAuto = new HashMap<>();
        uniqueAuto.forEach (auto -> countAuto.put(auto, 0));
        autoList.forEach (auto -> countAuto.put(auto, countAuto.get(auto)+1));
        System.out.println(countAuto);
        
    }
}

