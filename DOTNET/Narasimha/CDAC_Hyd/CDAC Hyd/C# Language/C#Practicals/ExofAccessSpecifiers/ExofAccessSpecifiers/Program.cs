using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofAccessSpecifiers
{
    public class Test
    {
        private void Display1()
        {
            Console.WriteLine("This is Private To Class Only");
        }

        public void Display2()
        {
            Console.WriteLine("This is Public  Can Be Accessed Any Where");
        }


        protected void Display3()
        {
            Console.WriteLine("This is Protected Works in  Class And Inherited Class");
        }

        internal void Display4()
        {
            Console.WriteLine("This is Internal Works Any Where in Project");
        }

        protected internal void Display5()
        {
            Console.WriteLine("This is Internal Works Any Where in Project And Internal Class");
        }

    }

    public class Example:Test
    {
        
        public void Show()
        {
            this.Display3();
            Console.WriteLine("This is Method of Child Class");
        }
    }




    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Object on Test Class");
            Test obj1 = new Test();
            obj1.Display2();
            obj1.Display4();
            obj1.Display5();
            Console.ReadLine();

            Console.WriteLine("Object on Example Inherited Class");

            Example obj2 = new Example();
            obj2.Show();
            obj2.Display2();
            obj2.Display4();
            obj2.Display5();
            Console.ReadLine();

            Console.WriteLine("Object on Student Class");
            Student obj3 = new Student();
            obj3.ShowDate();
            Console.ReadLine();
        }
    }
}
