using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofGenerics
{
    public class TestGenerics<T>
    {
        public  bool CompareSame(T x, T y)
        {
            if (x.Equals(y))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            TestGenerics<int> obj1 = new TestGenerics<int>();
            bool b1;
            b1 = obj1.CompareSame(10, 10);
            Console.WriteLine(b1);
            Console.ReadLine();
            TestGenerics<string> obj2 = new TestGenerics<string>();
            bool b2;
            b2 = obj2.CompareSame("Vijay", "Vijay");
            Console.WriteLine(b2);
            Console.ReadLine();


            TestGenerics<double> obj3 = new TestGenerics<double>();
            bool b3;
            b3 = obj3.CompareSame(5.5,5.1);
            Console.WriteLine(b3);
            Console.ReadLine();
        }
    }
}
