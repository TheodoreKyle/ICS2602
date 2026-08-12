#include <iostream>
#include <cstring>
using namespace std;

int main() {
  char str1[10] = "Hello";
  char str2[10] = "World";
  char str3[10];
  int len;

  //copy str1 into str3 
  strcpy(str3, str1);
  cout << "strcpy (str3, str1): " << str3 << endl;

  //concatenates str1 and str2
  strcat(str1, str2);
  cout << "strcat (str1, str2): " << str1 << endl;

  // total length of str1 after concatenation
  len = strlen(str1);
  cout << "strlen(str1): " << len << endl;

  char grade;
  cout << "Enter your grade (Type 1 if >= 95, 2 if >= 90, 3 if >= 85, 4 if >= 80, 5 if >= 75, 6 if <= 74): ";
  cin >> grade;
  switch(grade){
    case '1':
    cout << "A";
    break;
    case '2':
    cout << "B";
    break;
    case '3':
    cout << "C";
    break;
    case '4':
    cout << "D";
    break;
    case '5':
    cout << "E";
    break;
    case '6':
    cout << "F";
    break;
    default:
    cout << "Wrong grade input.";
    break;
  }
  return 0;
}