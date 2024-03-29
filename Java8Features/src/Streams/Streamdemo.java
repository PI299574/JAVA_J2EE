package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
the Stream API is used to process collections of objects.
A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
The features of Java stream are �

A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
Streams don�t change the original data structure, they only provide the result as per the pipelined methods.

Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate
operations can be pipelined. Terminal operations mark the end of the stream and return the result.


Different Operations On Streams-
Intermediate Operations:

map: The map method is used to map the items in the collection to other objects according to the Predicate passed as argument.
List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());

filter: The filter method is used to select elements as per the Predicate passed as argument.
List names = Arrays.asList("Reflection","Collection","Stream");

List result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

sorted: The sorted method is used to sort the stream.
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());


Terminal Operations:

collect: The collect method is used to return the result of the intermediate operations performed on the stream.
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());

forEach: The forEach method is used to iterate through every element of the stream.
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));

reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.
List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);*/

public class Streamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 		List nums=Arrays.asList("String",11,"p",12,23,45);
		
 		nums.stream.
		
		List<Integer> list=Arrays.asList(11,05,15,25,21);

		//Demonstration of ForEach

		list.stream().map(x->x*x).forEach(y->{
			System.out.print(y+" ");

		});
		System.out.println();
		//Demonstartion of return
		//// collect method returns a set

		Set<Integer> set=list.stream().map(x->x*x).collect(Collectors.toSet());

		System.out.println(set);

		//Demonstrate sorting

		List<Integer> list1=list.stream().sorted().collect(Collectors.toList());

		System.out.println(list1);

		//Demonstrate filter method

		List<Integer> list2=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(list2);


		Integer even=list.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println("Even "+even);
	}

}


/*Important Points/Observations:

A stream consists of source followed by zero or more intermediate methods combined together
(pipelined) and a terminal method to process the objects obtained from the source as per the methods described.
Stream is use d to compute elements as per the pipelined methods without altering the original value of the object.*/