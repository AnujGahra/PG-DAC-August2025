using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofInterfaceWithFiles
{

    public class Example:IFirst,ISecond
    {
        public void Display()
        {
            Console.WriteLine("Display From First Interface");
        }

       
        public void Show(string name)
        {
            Console.WriteLine("Hello  "+name+" From Second Interface");
        }

        public void AddNo(int x, int y)
        {
            Console.WriteLine("Result of Add Integers is " + (x + y).ToString());
        }

        
    }
    class Program
    {
        static void Main(string[] args)
        {
            Example obj = new Example();
            obj.Display();
            obj.Show("Karthik");
            obj.AddNo(10, 40);
            Console.ReadLine();
        }
    }
}
