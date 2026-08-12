#include <iostream>
#include <cstring>

using namespace std;

int main() {
    int i, j, length; 
    char name[5][11];

    cout << "Enter 5 names: ";
    for (i = 0; i < 5; i++) 
    cin.getline(name[i], 11); // Inputting names 

    cout << "Names and their corresponding length" << endl;
    for (i = 0; i < 5; i++)
    cout << name[i] << "\t" << "Length: " << strlen(name[i]) << endl;

    cout << "\nNames that start with A" << endl;
    for (i = 0; i < 5; i++) {
        if (name[i][0] == 'A' || name[i][0] == 'a')
        cout << name[i] << endl;
    }

    cout << "\nNames that end with S" << endl;
    for (i = 0; i < 5; i++) {
        if (name[i][strlen(name[i]) - 1] == 'S' || name[i][strlen(name[i]) - 1] == 's')
        cout << name[i] << endl; 
    }

    return 0; 
}