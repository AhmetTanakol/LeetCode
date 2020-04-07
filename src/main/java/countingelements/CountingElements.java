package countingelements;

import java.util.HashMap;

public class CountingElements {

    public int countElements(int[] arr) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int num : arr) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int currentCount = map.get(num);
                map.put(num, currentCount + 1);
            }
        }

        return map.entrySet()
                .stream()
                .reduce(0, (subtotal, entry) -> {
                    if(map.containsKey(entry.getKey() + 1)) {
                        subtotal += (entry.getValue());
                    }
                    return subtotal;
                }, Integer::sum);
    }
}
