#include <iostream>

using namespace std;

int main() {
    int a, b, c, d, tmp;
    double median;
    int B[6]; 
    int A[6][6];
    
    for (a = 0; a < 6; a++) {
        for (b = 0; b < 6; b++) {
            cout << "Enter [" << a << "][" << b << "]: ";
            cin >> A[a][b];
        }
    }
    for (a = 0; a < 6; a++)
    B[a] = A[a][5 - a];
    
    cout << "\nPrinting array A:" << endl;
    for (a = 0; a < 6; a++) {
        for (b = 0; b < 6; b++)
            cout << A[a][b] << "\t";
        cout << endl;
    }
    
    for (a = 0; a < 6; a++) { // Sorting each row using bubble sort
        for (c = 0; c < 5; c++) {
            for (d = 0; d < 5 - c; d++) {
                if (A[a][d] > A[a][d + 1]) {
                    tmp = A[a][d];
                    A[a][d] = A[a][d + 1];
                    A[a][d + 1] = tmp;
                }
            }
        }
    }

    cout << endl;
    for (a = 0; a < 6; a++) {
        for (b = 0; b <= 6; b++) {
            if (b % 2 == 0) 
            median = (A[a][b / 2 - 1] + A[a][b / 2]) / 2.0;
            else 
            median = A[a][6 / 2]; 
        } 
        cout << "Median of row " << a + 1 << " = " << median << endl;
    }
    
    cout << "\nPrinting array B:" << endl;
    for (a = 0; a < 6; a++) 
    cout << B[a] << "\t";
    
    return 0;
}