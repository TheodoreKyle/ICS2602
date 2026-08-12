#include <iostream>

using namespace std;

int main() {
    int a, b, highest;
    int A[10][10]; 
    int B[11];

    cout << "Enter 100 integers." << endl;
    for (a = 0; a < 10; a++) {
        for (b = 0; b < 10; b++)
        cin >> A[a][b];
    }

    cout << "\nOutput:" << endl;
    for (a = 0; a < 10; a++) {
        for (b = 0; b < 10; b++)
        cout << A[a][b] << "\t";
        cout << endl;
    }

    for (a = 0; a < 10; a++) {
        highest = A[a][0]; 
        for (b = 1; b < 10; b++) {
            if (A[a][b] > highest)
            highest = A[a][b];
        }
        cout << "\nHighest in row " << a + 1 << " is " << highest << endl;
    }

    cout << "\nElements of the last row: ";
    for (a = 0; a < 10; a++) {
        B[a] = A[9][a];
        cout << B[a] << "\t"; 
    }

}