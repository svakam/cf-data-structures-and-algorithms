package utilities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {

    // initialize
    AnimalShelter shelter;
    AnimalShelter.Dog d;
    AnimalShelter.Cat c;

    // set up
    @Before
    public void setUp() {
        shelter = new AnimalShelter();
        d = new AnimalShelter.Dog();
        c = new AnimalShelter.Cat();
    }

    // test enqueueing and check if size of queues matches expected
    @Test
    public void testEnqueue() {
        shelter.enqueue(d);
        shelter.enqueue(d);
        shelter.enqueue(c);
        shelter.enqueue(d);
        assertEquals(3, shelter.getDogList().size());
        assertEquals(1, shelter.getCatList().size());
    }

    // test dequeueing and check if returned type is the correct type
    @Test
    public void testDequeue() {
        shelter.enqueue(d);
        shelter.enqueue(c);
        shelter.enqueue(d);
        shelter.enqueue(d);
        shelter.enqueue(c);
        assertEquals(AnimalShelter.Dog.class, shelter.dequeue(AnimalShelter.Dog.class).getClass());
        assertEquals(AnimalShelter.Cat.class, shelter.dequeue(AnimalShelter.Cat.class).getClass());
    }
}
