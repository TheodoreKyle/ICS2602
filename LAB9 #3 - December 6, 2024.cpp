#include <iostream>

using namespace std;

void twentyGrades(){
    double grade[20];
    int i;
    double average = 0, sum = 0;
    for (i = 0; i < 20; i++){
        cout << "Enter grade for student number " << i + 1 << ": ";
        cin >> grade[i];
        sum += grade[i];
        if (grade[i] > 100 || grade[i] < 0) {
            cout << "Invalid grade value";
            break;
        }
    }
    cout << "\nNumber Grade\tLetter Grade" << endl;
    for (i = 0; i<20; i++) {
        cout << "\t" << grade[i] << "\t\t\t\t";
        if (grade[i] >= 90 && grade[i] <= 100) 
            cout << 'A';
        else if (grade[i] >= 80 && grade[i] <=89)
            cout <<'B';
        else if (grade[i] >= 70 && grade[i] <= 79)
            cout <<'C';
        else if (grade[i] >= 60 && grade[i] <= 69)
            cout << 'D';
        else
            cout << 'F';
        cout << "\n";
    }
    average = sum / 20;
    cout << "\nSum = " << sum <<"\nAverage = " << average <<"\nBelow Average Grades: "<<endl;
       
    for (i = 0; i < 20; i++) {
        if (grade[i] < average){
            cout << grade[i] << endl;
        }
    }
}

int main()
{
    twentyGrades();
    return 0;
}