package hashtable;

import java.util.ArrayList;

public class HashTable {
    // # of buckets
    int size;

    // store array of lists (multiple values for 1 key)
    ArrayList<Entry> map;

    // constructor
    public HashTable(int n) {
        this.size = n;
        this.map = new ArrayList<Entry>();
        for (int i = 0; i < n; i++) {
            map.add(null);
        }
    }

    // add: takes in key and value, hashes key, adds key/value to table, and handles collisions
    public void add(String key, String value) {
        // hash key
        int hash = hash(key);

        // get beginning of list for given key
        Entry head = map.get(hash);
        if (head.getKey().equals(key)) {
            head.setValue(value);
        }

        System.out.println("head = " + head);
    }

    // takes in key and returns value from table
    public int get(String key) {
        int hash = hash(key);

        return hash;
    }

    // takes in key and returns boolean indicating if key exists in table already
//    public boolean contains(int key) {
//
//    }

    // takes in arbitrary key and returns index in collection
    public int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
            sum += i;
        }
        return sum % 599;
    }
}
