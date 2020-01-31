package utilities;

import java.util.LinkedList;

// cited sources: Michelle Ferreirae (who provided code example)

public class AnimalShelter {
    // initialize inner classes of Dog and Cat
    static class Dog {}
    static class Cat {}

    // initialize global queues of dogs and cats
    private LinkedList<Dog> dogList;
    private LinkedList<Cat> catList;

    // constructor for queues
    public AnimalShelter() {
        this.dogList = new LinkedList<>();
        this.catList = new LinkedList<>();
    }

    // enqueue methods to add dog or cat object
    public void enqueue(Dog d) {
        this.dogList.add(d);
    }
    public void enqueue(Cat c) {
        this.catList.add(c);
    }

    public <T> T dequeue(Class<T> type) {
        if (type == Dog.class) {
            return (T)this.dogList.poll();
        } else if (type == Cat.class) {
            return (T)this.catList.poll();
        } else {
            throw new IllegalArgumentException("Exception: dogs and cats allowed only");
        }
    }

    public LinkedList<Dog> getDogList() {
        return dogList;
    }

    public LinkedList<Cat> getCatList() {
        return catList;
    }
}
