# Table of Contents
- Linked List

# Singly Linked List
This is a data structure that contains objects called nodes. These nodes contain a value and a single pointer to another node. 

## Challenge
We are challenged to put our understanding of singly linked lists to the test. We are expected to instantiate a linked list, add values to the list, test if a value is included in the list, and print values in the list, and insert nodes at the end, and before and after a specified node. 

## Approach & Efficiency
I just followed the notes on the linked list notes by Code Fellows. Then I attempted to understand the content on my own by avoiding having to look at the notes and write commented steps in the program. Then I would check the notes to see if I missed steps. Efficiency of this singly linked list (insertion at the head) is O(1) in time and O(1) in space. 

## API
- insert() inserts a node at the head of the linked list. 
- includes() returns true if an input value is also a value in a node in the list. It returns false if the value is not present in the list. 
- toString() prints out all the values present in the list. 
- append() inserts a node at the end of the list. 
- insertBefore() inserts a node before a specified node's value. 
- insertAfter() inserts a node after a specified node's value. 
- kthFromEnd() returns the value of a node k nodes from the end of the list.

## Solution
- append, insert before, insert after ![1](../assets/ll-insertion(1).jpg) ![2](../assets/ll-insertion(2).jpg) ![3](../assets/ll-insertion(3).jpg)
- kth from end ![4](../assets/ll-kthfromend.jpg)
        