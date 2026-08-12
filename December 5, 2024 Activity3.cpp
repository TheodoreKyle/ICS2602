#include <iostream>
// #include <cstring>

using namespace std;

int main() {
    int a, b, L, s;
    int x[4][3];

    for (a = 0; a < 4; a++) {
        for (b = 0; b < 3; b++) {
            cout << "Input [" << a << "][" << b << "]: ";
            cin >> x[a][b];
        }
    }

    for (b = 0; b < 3; b++) {
        L = x[0][b]; 
        s = 0;
        for (a = 1; a < 4; a++) {
            if (x[a][b] <= L) {
                L = x[a][b]; 
                s = a; 
            }
        }
        cout << "Subscript of the lowest element in column " << b << " is [" << s << "][" << b << "]" << endl;
    }

    return 0;
}