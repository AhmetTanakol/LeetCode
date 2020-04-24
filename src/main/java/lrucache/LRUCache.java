package lrucache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private LinkedHashMap<Integer, Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);

    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        map.remove(key);

        if (map.size() == capacity) {
            Map.Entry<Integer, Integer> lru = map.entrySet().iterator().next();
            map.remove(lru.getKey());
        }

        map.put(key, value);
    }
}
