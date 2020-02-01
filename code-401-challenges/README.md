# Table of Contents
- Reverse an array
- Insert a value into the middle of an array (Shift array)
- Array binary search

# Reverse an Array
This code challenge tests our ability to reverse an array using the newly introduced language of Java. 

## Challenge
Given an array of integers, use a function to take in that array and output the reversed array in an old or new array. 

## Approach & Efficiency
I knew that a method would have to be declared within a class that takes in an array as a parameter and outputs an array with the old array's values reversed. Within the method, a for loop must be used to reversely iterate over the old array and assign values in the new array to the currently referenced old array's value. I knew that only one for loop must be used, and within it, both the old array's value and the new array's newly allocated memory at an index must be referenced at the same time. Therefore, assign the new array from the beginning to the old array's value from the end within this for loop. 

## Solution
[Whiteboard](./assets/arrayreverse.jpg)

# Shift array
This challenge tests our ability to insert a given value into the middle of an array using Java and the newly introduced Gradle framework. 

## Challenge
Given an array of integers and an integer, implement a function to take in that array and insert the integer into the middle of the array. 

## Approach & Efficiency
The array's midpoint would need to be calculated. The midpoint would have to be calculated based on the new array's length. Once the midpoint is found, loop through the new array. Set conditions that insert the values from the old array into the new array based on comparing the index of the new array to the midpoint. 

## Solution
[Whiteboard](./assets/array-shift.jpg)

# Array binary search
This challenge tests our knowledge on searching through an array for a value with a time complexity of O(log(n)). 

## Challenge
Given an array of integers and an integer, implement a function to take in that array and find whether the integer is in the array. If it is, return the index at which the integer is located at; if not, return -1. 

## Approach & Efficiency
Begin by finding an initial midpoint of the array as-is. If the integer is immediately found, return the index of the integer. If not, go into a while loop that attempts to find the integer. If the integer is smaller than the midpoint, calculate a new midpoint that is based on the left half of the existing array boundaries. If the integer is larger, calculate the midpoint for the right half. If integer is equal to new midpoint, return the index. If not, run the while loop again. 

## Solution
[Whiteboard](./assets/array-binary-search.jpg)

# Animal shelter
This challenge tests our ability to queue/dequeue objects using generics in Java. 

## Challenge
Given an animal object Cat or Dog, implement a function that enqueues animals to the shelter or dequeues an animal with the preferred animal type. 

## Approach & Efficiency
- I give credit to Michelle Ferreirae, who assisted me with this challenge. In an AnimalShelter class, initialize an empty static class for each Dog and Cat (these classes contain nothing since they have no definition). Initialize queue interfaces that implement linked lists, one for each type of animal. Instantiate the queues within a constructor. Define an overloaded enqueue method, which enqueues a dog into the dog list and a cat into cat list. Define dequeue method which returns the Dog or Cat if the input of dequeue was specified as such. If not, throw an exception that says must be a dog or cat. 
- Efficiency is O(1) time to enqueue() and dequeue() given that a new queue is instantiated for every type of object. Space is O(n) since n Dogs and Cats are being stored for every enqueue(). 

## Solution
[Whiteboard](./assets/fifo-animal-shelter.jpg)

[Whiteboard2](./assets/fifo-animal-shelter2.jpg)
- (Emulated Michelle's code)

# Multi bracket validation
This tests our ability to recognize the optimal data structure to use when presented with a problem that requires string parsing. 

## Challenge
Given a String, implement a function that returns a boolean for whether brackets {}()[] are used according to proper conventions in the string.

## Approach & Efficiency
- I realized that for every type of bracket opened, it must have a closing bracket before another type of bracket is opened. However, the same type of bracket can be opened as many times as needed while following the first rule and as long as it's being closed at the right time. For every bracket opened, push it to a stack and look at the next character. If the next character matches to its correct closing bracket, pop the stack. If it doesn't and it's another type of opening bracket, return false. If it's an opening bracket of the same type, add it to the stack. Return true only if nothing is left in the stack. 
- I consulted Michelle's code since her idea of storing the corresponding bracket types as key-values pairs in a hashmap circumvents the need to implement lengthy if-else statements that attempt to account for bracket matching. 
- Efficiency is O(n) time since there are n characters in the string that must be parsed. Space is O(1) best case assuming there are no brackets in the string and O(n) for n brackets in string. 

## Solution
[Whiteboard](./assets/multi-bracket-validation.jpg)

# FizzBuzzTree
This challenge tests our knowledge on traversing a tree appropriately and adding a new node to a new tree for every node on the original tree.

## Challenge
Given a tree, implement a function that takes in that tree. Examining the node of each tree, if the node is divisible by 3, add a new node to a new tree with the value of "fizz". If divisible by 5, add the node with the value of "buzz", else if divisible by 15, add the node with the value of "fizzbuzz", else stringify the original node's value. 

## Approach & Efficiency
I chose to recurse through the tree and 

## Solution
[Whiteboard](./assets/fizzbuzz-tree.jpg)
