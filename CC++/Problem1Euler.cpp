

	
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#pragma hdrstop


void main(){

/*
Euler - Problem 1000
URL: https://projecteuler.net/problem=1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Limitd the sum of all the multiples of 3 or 5 below 1000.

*/


/*First version, By brute force*/
int sum = 0; // In this variable  will be store the result of the sums
int Limit = 1000; // In this variable will be define the end of the calculation

for(int i = 3; i < Limit ; i++){
 
     if( i % 3== 0 || i % 5 == 0){
 
        sum+= i;
     }
 
}//Limit for
 
printf(“%d”, sum);
 
 
/*Second version, optimize algorithm */ 
 
int X= 1000;  //In this variable will be define the end of the calculation
 
int sum_bythree = 1.5*(int)((x-1)/3)*(int)((x+2)/3) ; // The sum of all the numbers that can be divide by three
 
int sum_byfive = 2.5*(int)((x-1)/5)*(int)((x+4)/5) ;// The sum of all the numbers that can be divide by three 
 
int sum_product =  7.5*(int)((x-1)/15)*(int)((x+14)/15); // se halla la sum de los divisibles de la multiplicacion entre 3 y 5
// el resultado
 
int result = sum_bythree + sum_byfive - ssum_product; 

 
/*Third version, optimize algorithm in one line*/

int results = 1.5*(int)((x-1)/3)*(int)((x+2)/3) + 2.5*(int)((x-1)/5)*(int)((x+4)/5) - 7.5*(int)((x-1)/15)*(int)((x+14)/15);

 
 }//main