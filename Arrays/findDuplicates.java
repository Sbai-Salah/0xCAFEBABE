package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;


public class findDuplicates {
    

    public static void main(String[] args) {
        
        String infra[] = {"Amazon", "GCP", "Azure", "Ali Baba", "Azure", "Amazon", "Airbnb", "GCP"};

        //1- brute force approache : O(n^2)
        System.out.println("-- brute force --");
        for(int i=0; i<infra.length; i++){
            for(int j=i+1; j<infra.length; j++){
                if(infra[i].equals(infra[j])){
                    System.out.println(infra[i]);
                }
            }
        }


        //2- HashSet
        System.out.println("-- HashSet --");
        Set<String> data = new HashSet<String>();
        for(String e: infra){
            if(!data.add(e)){
                System.out.println(e);
            }
        }

        //3- HashMap
        System.out.println("-- HashMap --");
        Map<String,Integer> dataMap = new HashMap<>();
        for(String e : infra){
            Integer counter = dataMap.get(e);
            if(counter==null){
                dataMap.put(e, 1);
            }else{
                dataMap.put(e, ++counter);
            }
        } 
        Set<Entry<String, Integer>> entrySet = dataMap.entrySet();  
        for(Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }    
        }

        //4- Streams with HashSet 
        System.out.println("--- Streams set and filter ---");
        Set<String> dataStream = new HashSet<String>();
        Set<String> dupSet = Arrays.asList(infra).stream().filter((e) -> !dataStream.add(e)).collect(Collectors.toSet());
        System.out.println(dupSet);

        System.out.println("--- Streams set grouping by -_- ---");
        Set<String> dupSet2 = Arrays.asList(infra)
                                    .stream()
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                    .entrySet()
                                    .stream()
                                    .filter(e->e.getValue() > 1)
                                    .map(Map.Entry::getKey)
                                    .collect(Collectors.toSet());

        System.out.println(dupSet2);

        System.out.println("--- Streams set using frequecy -_- ---");
        List<String> list = Arrays.asList(infra);
        Set<String> eleList   = list.stream()
                                    .filter(e->Collections.frequency(list, e) > 1)
                                    .collect(Collectors.toSet());
        System.out.println(eleList);

    }
}
