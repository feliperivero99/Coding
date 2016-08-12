#include <stdio.h> 
#include <string.h>
#include <conio.h> 
#include <stdlib.h> 
#include <math.h>  
 
 
void main (){ 

/*
Euler - Problem 6
URL: https://projecteuler.net/problem=6

The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/

/*First Version by brute force*/
 
int sum_square =0;
int sum_number=0; 
 
// The variable "n" will contain the value of the limit.  
int n=100; 

 
// The sum of the natural nummbers

for(int i = 1 ; i <= n ; i++){ 
 
sum_square +=  (i*i); 
sum_number  +=  i;
 
}//

//subtraction
 
int result = ( sum_number * sum_number ) - sumacuadrados;
  
printf(” %d “, result); 
 
/*Second Version by an optimize algorithm*/ 
 

int lim= 100; //The variable "lim" will contain the value of the limit
 
result =0;
int sum= ( lim * (lim + 1) ) / 2;     // The sum of the natural nummbers

int sum_s= ( ( 2*lim +1) * (lim +1) * lim )/ 6; // The sum of the square

// Subtraction and result.

int result = ( sum * sum ) - sum_s ;

printf(” %d “, result); 
 
 
 
}//main