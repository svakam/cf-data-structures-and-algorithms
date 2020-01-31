package utilities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {
    AnimalShelter shelter;
    AnimalShelter.Dog d;
    AnimalShelter.Cat c;

    @Before
    public void setUp() {
        shelter = new AnimalShelter();
        d = new AnimalShelter.Dog();
        c = new AnimalShelter.Cat();
    }

    @Test
    public void testEnqueue() {
        shelter.enqueue(d);
        shelter.enqueue(d);
        shelter.enqueue(c);
        shelter.enqueue(d);
        assertEquals(3, shelter.getDogList().size());
        assertEquals(1, shelter.getCatList().size());
    }

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
