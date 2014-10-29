a-little-java
=============

reading notes


a little java, a few patterns

When specifying a collection of data, use abstract classes for datatypes and extended classes for variants.

An abstract method in an abstract class introduces an obligation, which says that all concrete classes that extend this abstract class must contain a matching method definition.

When writing a function over a datatype, place a method in each of the variants that make up the datatype. If a field of a variant belongs to the same datatype, the method may call the corresponding method of the field in computing the function.

When writing a function that returns values of a database, use new to create these values.


So
x.topAwC().remA()
is a way to substitute all anchovies with cheese by looking at each topping of a pizza and adding cheese on top of each anchovy and then looking at each topping again, including all the new cheese, and removing the anchovies.

We are going to separate the action from the datatype.

a protocol is an agreement on how classes that specify a datatype and its variants interact with classes that realize functions on that datatype.

When writing several functions for the same self-referential datatype, use visitor protocols so that all methods for a function can be found in a single class.

In functional programming, a visitor with fields is called a closure (or a higher-order function), which
would be the result of applying a curried verion of subset.




















