# Table of Contents
- Linked List

# Singly Linked List
This is a data structure that contains objects called nodes. These nodes contain a value and a single pointer to another node. 

## Challenge
We are challenged to put our understanding of singly linked lists to the test. We are expected to instantiate a linked list, add values to the list, test if a value is included in the list, and print values in the list, and insert nodes at the end, and before and after a specified node. 

## Approach & Efficiency
- For each method, I ensure that I'm following the steps meticulously, since misplacing a tracker node or dereferencing when you shouldn't can lead to errors and loss of data. 
- Efficiency of insert() is O(1) time and O(1) space since the node is always being inserted at the get-go. 
- Efficiency of includes() is O(n) time and O(1) space since no additional space is being used to return a boolean, and worst case scenario is the search value is at the end of the list. 
- Efficiency of toString() is O(n) time and O(1) space since you must traverse the list fully to get the values to print. 
- Efficiency of append() is O(n) time and O(1) space since 1 node is being inserted and you must traverse the list of n nodes. 
- Efficiency of insertBefore() and insertAfter() is O(n) time and O(1) space since 1 node is being inserted, and worst case is the node to search for is at the end of the list of n nodes. 
- Efficiency of kthFromEnd() is O(n) time and O(1) space since no additional space is being used, but worst case k is 0, which means you must traverse the list fully to get the last value. 
- Efficiency of mergeLists() is O(n) time and O(1) space since you must traverse both lists fully, but no additional space is being used to get the merged list - however, the original data is mutated. 

## API
- insert() inserts a node at the head of the linked list. 
- includes() returns true if an input value is also a value in a node in the list. It returns false if the value is not present in the list. 
- toString() prints out all the values present in the list. 
- append() inserts a node at the end of the list. 
- insertBefore() inserts a node before a specified node's value. 
- insertAfter() inserts a node after a specified node's value. 
- kthFromEnd() returns the value of a node k nodes from the end of the list.
- mergeLists() takes in two linked lists and returns the first linked list that will contain the merge. Original data is mutated. 

## Solution
- append, insert before, insert after ![1](../assets/ll-insertion(1).jpg) ![2](../assets/ll-insertion(2).jpg) ![3](../assets/ll-insertion(3).jpg)
- kth from end ![4](../assets/ll-kthfromend.jpg)
- merge two linked lists ![5](../assets/ll-merge.jpg)
        