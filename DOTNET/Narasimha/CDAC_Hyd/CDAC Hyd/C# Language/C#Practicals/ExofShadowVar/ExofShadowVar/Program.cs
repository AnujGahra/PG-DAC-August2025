using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofShadowVar
{
    public class StudentNames
    {
        public string name = "Abhay";
        public void Showname()
        {
           string name = "Kartik";
         Console.WriteLine("Your Name is " + name);
         Console.WriteLine("Your Name is " + this.name);
          Console.ReadLine();
        }
   }
    class Program
    {
        static void Main(string[] args)
        {
            StudentNames obj = new StudentNames();
            obj.Showname();
        }
    }

}