#include <stdio.h>
#include <stdlib.h>

long double epsilon=1;
long double suma = 1;


/*
Algorithm to find the Machine Epsilon  in C

Machine epsilon gives an upper bound on the relative error due to rounding in floating point arithmetic. 
This value characterizes computer arithmetic in the field of numerical analysis, and by extension in the subject of computational science.
The quantity is also called macheps or unit roundoff, and it has the symbols Greek epsilon {\displaystyle \epsilon } \epsilon  or bold Roman u, respectively. 

URL: https://en.wikipedia.org/wiki/Machine_epsilon 


*/


int main(int argc, char *argv[])
{
   float machEps = 1.0f;
 
    printf( "Initial Epsilon, 1 + Initial Epsilon\n\n\n" );
    do {
       printf( "%G\t%.20f\n", machEps, (1.0f + machEps) );
       machEps /= 2.0f;
      
    }
    while ((float)(1.0 + (machEps/2.0)) != 1.0);
 
    printf( "\nThe Machine epsilon is: %G\n", machEps );
    
  
  
  system("PAUSE");	
  return 0;
}
