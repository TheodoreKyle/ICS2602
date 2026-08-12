#nullable disable
using System;
namespace Input
{
  class Program
  {
    static void Main(string[] args)
    {
      string userName; 
      Console.Write("Enter username: ");
      userName = Console.ReadLine();
      Console.WriteLine("Username is: " + userName);
    }
  }
}