package hashtable;

import org.junit.Before;
import org.junit.Test;

public class HashTableTest {
    // test instantiate
    @Test
    public void testInstantiate() {
        HashTable ht = new HashTable(10);
        System.out.println("ht = " + ht);
    }

    HashTable ht;

    @Before
    public void setUp() {
        ht = new HashTable(16);
    }

    // test add
    @Test
    public void testAdd() {
        ht.add("abcdef", "1");
    }

    // test get
    @Test
    public void testGet() {
//        String value = ht.get("abdefc");

    }

    // test contains

    // test hash
    @Test
    public void testHash() {
        int index = ht.hash("fddeba");
    }
}
