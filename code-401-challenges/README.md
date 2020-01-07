# Reverse an Array
This code challenge tests our ability to reverse an array using the newly introduced language of Java. 

## Challenge
Given an array of integers, use a function to take in that array and output the reversed array in an old or new array. 

## Approach & Efficiency
I knew that a method would have to be declared within a class that takes in an array as a parameter and outputs an array with the old array's values reversed. Within the method, a for loop must be used to reversely iterate over the old array and assign values in the new array to the currently referenced old array's value. I knew that only one for loop must be used, and within it, both the old array's value and the new array's newly allocated memory at an index must be referenced at the same time. Therefore, assign the new array from the beginning to the old array's value from the end within this for loop. 

## Solution
[Whiteboard](./assets/arrayreverse.jpg)
