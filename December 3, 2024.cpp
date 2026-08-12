#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    cout << setw(10) << right << 2175 << endl;
    cout << setw(10) << left << -2175 << endl;
    cout << setw(10) << right << setfill('^') << +217519 << endl;
    cout << setw(10) << left << setfill('*') << showpos << 217519 << endl;
    cout << setw(3) << setfill('*') << +21719 << setw(5) << left << 13 << endl;
    cout << endl;

    cout << setw(10) << setprecision(4) << right << fixed << showpoint << 217.5 << endl;
    cout << setw(12) << setprecision(2) << left << setfill('#') << fixed << -217.52849 << endl;
    cout << setw(12) << setprecision(3) << left << setfill('+') << fixed << +17.52849 << endl;
    cout << setw(3) << setprecision(4) << right << fixed << showpoint << 217.5 << endl;
    cout << endl; 

    cout << "field" << setw(10) << "check" << endl;
    cout << setw(10) << setfill('~') << "field" << setw(10) << left << "check" << endl;
    cout << setw(3) << "check" << endl;
    cout << setw(5) << "123.456789"; 
    
    return 0;
}