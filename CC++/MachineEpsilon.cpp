#include <cstdlib>
#include <iostream>
#include <iomanip>

using namespace std;

long double epsilon=1;
long double suma = 1;


/*
Algorithm to find the Machine Epsilon  in C++

Machine epsilon gives an upper bound on the relative error due to rounding in floating point arithmetic. 
This value characterizes computer arithmetic in the field of numerical analysis, and by extension in the subject of computational science.
The quantity is also called macheps or unit roundoff, and it has the symbols Greek epsilon {\displaystyle \epsilon } \epsilon  or bold Roman u, respectively. 

URL: https://en.wikipedia.org/wiki/Machine_epsilon 


*/


int main(int argc, char *argv[])
{
    
    
while(epsilon+1.0>1.0){
	epsilon=epsilon/2.0;
}

cout.setf(ios::scientific);


cout <<std::setprecision(20)<<epsilon<<'\n';
    
    system("PAUSE");
    return EXIT_SUCCESS;
}
