package InterviewQuestion;
/*
public class Questions {


    
OOPS Concepts 
A.P.I.E.
SOLID
Class design

Core Java

Abstract Class
Inner class / static inner class
Immutable class
Interface
Marker Interface
Exception handling
Garbage Collection
Class loader/ static and dynamic loading
Comparable / Comparator Interface
String pool / String Buffer/ String Builder
Constructor chaining / in case of abstract class/ interface
This and super keywords
Serialization 
Iterator / List Iterator
Rules of overloading and overriding
Reflection 
Exception Hierarchy and finally Method, ConcurrentModificationException
Pass by value / pass by reference
Locking(class level vs instance level) 
Synchronization
Locking mechanisms
Serializable & Externalizable and cloanable Interfaces
Finalize/clone  method of object class

Collection Framework(internals)
Array / Array List
Linked List
Vector (rarely asked)
Hash Map
hash Table  

Linked Hash Map
Tree Map
Sorted Map
WeakHashMap
All kinds of Sets/ Hash Set/Tree Set
LinkedHashSet
Stack / Queue/ Priority Queue/ Blocking Queue
Condition Interface
Fail safe and fail fast iterator
CopyOnWriteArrayList
ConcurrentSkipListMap
ConcurrentHashMap
Collections.unmodifiableCollection()

Multithreading and Concurrency
Thread lifecycle and basics
Volatile
Synchronize
Race condition
Deadlocks
BlockingQueue / Producer Consumer problem
Synchronizers like CyclicBarrier, CountdownLatch
Phaser
Atomic classes

Java 8 topics

Design Patterns / Sorting Algorithms
Singletons
Visitor
Template
Decorator
Strategy
Observer
Façade /session Façade
Factory /Abstract Factory
DAO


Spring Core
Bean Factory
Application Context
Bean Life Cycle
Init / destroy methods
Bean Listeners
Processors
Scopes
Loading mechanisms 
IOC

Database (SQL/PLSQL)
DDL
DML
Delete/truncate/Drop
Union / Union All
Index/ clustered- non clustered  index (including implementations at DS level)
Procedure
Group by/ having
Count(*) Max , Avg, etc
Join (types of joins)
Primary Kay / Unique Key
Isolation levels 
ACID properties

Java Performance Tuning
GC algorithm names only
Heap memory settings 
strong, soft, weak and Phantom reference
Stack and Heap Concept

Analytical/Logical /Scenario Based questions.
LRU dictionary or Cache 
ATM/Library/HR dept design
Parking allocation
Find most frequently used word from text file
Sorting 10 MB file using 1 MB memory:

The data can be sorted using external sorting which uses merging technique. This can be done as follows:
1. Divide the data into 10 groups each of size 100.
2. Sort each group and write them to disk.
3. Load 10 items from each group into main memory.
4. Output the smallest item from the main memory to disk. Load the next item from the group whose item was chosen.
5. Loop step #4 until all items are not outputted.
The step 3-5 is called as merging technique.

1 billion cellphone numbers to finds duplicates
Hash all these numbers into 1000 files using hash(num)%1000, then the duplicates should fall into the same file.
After the hashing, I got 1000 small files, each of which contains 1 million numbers at most, right? I'm not sure about this, I simply do it 1 billion / 1000 = 1 million.
Then for each file, build a hash table to store each number and a flag representing its occurrence.
I guess, it will take 5 B to represent the number, 4 B for the lower 8 digits and 1 B for the upper 3 digits; and actually 1 bit will suffice the flag, because I just need to find out whether duplicate exists, only how many times. But how can I apply the 1 bit flag to each number? I'm stumbled, so I choose bool to be the flag, 1 B is taken. So finally, each number in the hash table will take 5B<for number> + 1B<for flag> + 4B<for the next-pointer> = 10B, then each file will take 10M for the hash table.

FOLLOW UP:
	If there are no duplicates in these 1 billion phone numbers, given one phone number, how to find out the given one is or is not in these 1 billion numbers? Use as few memory as possible.
I came up with 2 solutions,
    The phone number can be represented using 5B as I said above, scan through the file, read one number a time, and xor the given number with the one read from the file, if the result is 0, then the given one is in the file, it'll take O(n) time, right?
    Partition these numbers into 2 small files according to the leading bit, which means, those numbers with a leading 1-bit go to a file, leading 0-bit go to another file, meanwhile count how many numbers in each file, if the given number fall into the 1-bit file and the 1-bit file's count is not full, then again partition the 1-bit file according to the secondary leading-bit, and check the given number recursively; if the 1-bit file is full, then the given number gotta be in the file, it'll take O(logn) time, right?




Find duplicate number in Integer Array


Identify palindrome

Fibonacci series printing using recursive

Calculate factorial using recursive and  iterative
Implement single elevator , double elevator
Simulate DVD renting system
etc


Sample questions below:

Question Set 1

1. Design a stack that supports getMin() in O(1) time and O(1) extra space.

2. Program for n’th node from the end of a Linked List

3. Semaphore in java 8, print odd and even number using semaphore

4. How ArrayList works internally in Java 8

5. find second largest number in array without sorting in java

6. Sort an array of 0s, 1s and 2s

7. Reverse a linked list

8. Garbage collection algorithms

9. Implement two stacks in an array

10. Producer-Consumer solution using threads in Java


Question Set 2

1. Implement database connection pooling using semaphore

2. Countdown latch/cyclic barrier -explain, difference between cyclic barrier and countdown latch

3. How HashMap works internally in Java 8

4. Function to check if a singly linked list is palindrome

5. Atomic variable -How it works internally

6. Difference between Callable and Runnable

7. Detect and Remove Loop in a Linked List

8. CopyOnWriteArrayList implementation

9. Find first unique character in a String

10. Implement Multithreading application which demonstrates deadlocks and how to avoid deadlocks.


Question Set 3:

1. Find position of an element in a sorted array of infinite numbers
If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, 
first we find bounds and then apply binary search algorithm.
Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element,
->if it is greater than high index element then copy high index in low index and double the high index.
->if it is smaller, then apply binary search on high and low indices found.


2. How ConcurrentHashMap works internally in Java 8

3. BlockingQueue-Expalin, implement own ArrayBlockingQueue

4. ReentrantLock implementation

5. Intersection point of two Linked Lists.

6. Creating custom exceptions

7. Design a vending machine

8. Java Reference- Soft, Weak, Strong and Phantom

9. Sort an array of 0s, and 1s

10. Different and best approach for Singleton Pattern

Queue Set 4:

1. Search an element in a sorted and rotated array

2. How TreeSet works internally in Java 8

3. UnModifiable collection own implementation

4. Java 8 new features

5. largest-sum-contiguous-subarray

6. Tree traversal with implementation [preorder, postorder, inorder and mirror]

7. Design multi-level parking system

8. Map sort by value

9. Design Principle

10. find the middle element in a linked list

11. Implement StringPool -Flyweight Design Pattern


}
*/