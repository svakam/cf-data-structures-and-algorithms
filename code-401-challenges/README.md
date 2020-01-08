# Table of Contents
- Reverse an array
- Insert a value into the middle of an array (Shift array)

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
