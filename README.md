MyList Interface
The MyList interface furnishes methods for administering a list of elements.

Methods:

add(T item): Appends an element to the end of the list.

set(int index, T item): Adjusts the element at the specified index.

add(int index, T item): Inserts the specified element at the specified position within the list.

addFirst(T item): Inserts the specified element at the outset of the list.

addLast(T item): Appends the specified element to the tail of the list.

get(int index): Retrieves the element at the designated index.

getFirst(): Retrieves the primary element within the list.

getLast(): Retrieves the ultimate element within the list.

remove(int index): Eliminates the element at the given index.

removeFirst(): Eliminates the initial element from the list.

removeLast(): Eliminates the final element from the list.

sort(): Arranges the list.

indexOf(Object object): Identifies the index of the first occurrence of the specified element.

lastIndexOf(Object object): Determines the index of the last occurrence of the specified element.

exists(Object object): Validates the presence of the specified element within the list.

toArray(): Converts the list into an array containing all of its elements.

clear(): Purges all elements from the list.

size(): Determines the count of elements within the list.

MyArrayList Class
MyArrayList constitutes an implementation of the MyList interface employing an array as its storage mechanism.

MyLinkedList Class
MyLinkedList represents an implementation of the MyList interface utilizing a doubly linked list for element storage.

MyStack Class
MyStack stands as a class embodying a stack data structure, implemented through MyLinkedList for element management.

MyQueue Class
MyQueue represents a class embodying a queue data structure, implemented via MyLinkedList for effective element handling.

MyMinHeap Class
MyMinHeap embodies a class representing a min-heap data structure, instantiated through MyArrayList for optimized element organization.

Main Class
Main serves as a class housing a main method devised to scrutinize the functioning of the aforementioned classes' implementations.
