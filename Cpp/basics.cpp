#include <iostream>
using namespace std ;

int main (){
    cout << " komalakrishna "<<" is good boy "<< endl;
    
    // type conversion
    // ascii value 
    char character = 'a';
    int integer = character ;
    cout<< integer << endl;

    // type casting 
    double price = 100.99 ;
    int newprice = (int)price ;
    cout<< newprice<<endl;
    

    // input from user 
    int age ; 
    cout<< "enter the age :" << endl;
    cin>>age;

    cout<< "your age is :"<< age << endl;
    return 0;
    
    
}
