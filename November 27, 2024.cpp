#include <iostream>
#include <cmath>
#define PI 3.1416

using namespace std;

int main() {
    double radius, A;
    cout << "Enter radius: ";
    cin >> radius;
    cout << "Area = " << PI * pow(radius, 2) << endl;

    return 0; 
}
