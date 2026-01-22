using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofShadowVar
{
    public class StudentNames
    {
        public string name = "Hanumant";
        public void Showname()
        {
            string name = "Asma";
           Console.WriteLine("Your Name is " + this.name);
           Console.WriteLine("Your Name is " + name.ToString());
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