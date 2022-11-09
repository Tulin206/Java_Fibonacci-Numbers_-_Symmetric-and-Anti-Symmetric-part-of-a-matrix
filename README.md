# Java_Fibonacci-Numbers_-_Symmetric-and-Anti-Symmetric-part-of-a-matrix


1. Arrays of Fibonacci-Numbers

      a) Implement a class method fiboNumbers(n) with an integer argument n of type int that generates an one-dimensional array of n + 1 elements of type long. The method computes the first n + 1 Fibonacci numbers f 0 , f 1 , . . . , f n iteratively and stores them in the array that
         finally is returned. Test this method using an appropriate modification of the class method main.
         
      b) Extend the method fiboNumbers with an error detection for the case that a Fi-bonacci number is going to be computed that would result in an integer overflow in the range of long numbers, i.e., that would exceed the range [−2 63 , 2 63 − 1]. Only correctly computed numbers should be stored in the result array. The first non-
         computable element should be set to a negative number. Ensure that the output of the Fibonacci numbers in the main method detects that case of overflow, stops printing Fibonacci numbers and instead prints an error message.
         
      c) In order to avoid the integer overflow, extend the class Fibo by a class method bigFiboNumbers that computes the first n + 1 Fibonacci numbers using the helper class BigInteger. The result of that method should be an array of BigInteger elements. The BigInteger class can be imported using the line
                                        
                                        import java.math.BigInteger;
         
         
         
         
2. Symmetric and anti-symmetric part of a matrix


      a) Implementation of a java class MatrixD representing a matrix of double elements.
      
      
      b) Performing operations of Matrix multiplication, division, addition, transpose of a matrix, symmetric and antiSymmetric of a matrix etc.
