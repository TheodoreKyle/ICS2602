#include <iostream>
#include <iomanip>
#include <cstring>
#include <string>

using namespace std;

int main() {
    int A[50]; // Array declaration
    int BB[3][4] = {2, 4, 6, 8, 10, 12, 1, 3, 5, 7, 9, 11};
    int C[3][4] = {{2, 4, 6, 8}, {10, 12, 1, 3}, {5, 7, 9, 11}}; 

    for (int a = 0; a < 3; a++){
        for (int b = 0; b < 4; b++)
        cout << BB[a][b] << "\t";
        cout << endl;
    }

    cout << endl; 
    char S1[20] = "C++ Programs";
    char S2[20];
    strcpy (S2, S1); 
    cout << S2; 

    strcpy(s3, "Hello");
    strcpy(s4, "hello"); 
    strcmp(s3, s4);

    strcpy(s5, "Beautiful"); 
    strcpy(s6, "brown cow"); 
    strncat(s5, s6, 5);
    cout << s5; 

    return 0; 
}