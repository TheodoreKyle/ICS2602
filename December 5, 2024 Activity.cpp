#include <iostream>
#include <cstring>

using namespace std;

int main() {
    int i, length; 
    char text[21];

    cout << "Input any words: ";
    cin.get(text, 21);

    for (i = strlen(text) - 1; i >= 0; i--)
    cout << text[i]; 

    return 0; 
}