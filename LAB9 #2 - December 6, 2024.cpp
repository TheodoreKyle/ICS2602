#include <iostream>
using namespace std;
int main () {
    const int SENTINEL = 0; 
    int num, ctr, lowestOdd;
    cout << "Enter integers (it will stop when you enter an integer less than 1):" << endl;

    while (cin >> num && num > SENTINEL) { 
        if (num % 2 != 0) { 
            if (ctr == 0)
            lowestOdd = num;

            else if (num < lowestOdd) 
            lowestOdd = num;

            ctr++; 
        }
    }
    if (ctr == 0)
        cout << "No odd integer" << endl;
    else 
        cout << "The lowest odd integer is: " << lowestOdd << endl;
   
    return 0;
}