# Graph implementation
Implement a graph's methods (addNode, addEdge, getNodes, getNeighbors, size). 

## Challenge Description
addNode(): adds new node to graph, takes in value of node, returns added node. 

addEdge(): adds new edge between two nodes in graph, include ability to have weight, take in two nodes to be connected, both nodes already in graph. 

getNodes(): return all nodes in graph as collection. 

getNeighbors(): return collection of all nodes connected to given node, including weight of connection in returned collection. 

size(): return size of the graph (number of nodes that exist in it). 

## Approach & Efficiency
addNode(): Instantiate a node given a value, add it to a pre-instantiated list of nodes in a graph, and return that node. O(1) time and O(n) space for every node added. 

addEdge(): Since every graph contains a node or nodes, and each node contains a set of edge or edges it connects to, specify that a new edge
must contain a weight and the node it will connect to. Also use the second node to create the same edge but pointing to the first node. These 
are technically two edges with how I implemented this, but it's a way to satisfy the requirements for a standard bidirectional graph. O(1) time
for a set of two nodes and O(n) space for the new edges and weight of each created. 

getNodes(): for every node in the list of nodes, get its value and add it to an arraylist to return it. O(n) time to iterate through each node
to add to arraylist and O(n) space for the arraylist created. 

getNeighbors(): return the collection of neighbors for a given node. O(n) time worst case assuming the node is connected to every other node in the graph. 
O(n) space for the array made to contain the nodes and weights of the edges. 

size(): iterate through the list of nodes in the graph to get the size O(n) time and O(n) space for containing those nodes in a list. 
