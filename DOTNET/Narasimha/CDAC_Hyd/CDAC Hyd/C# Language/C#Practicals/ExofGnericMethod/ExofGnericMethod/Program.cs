using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofGnericMethod
{

    public class TestGenericMethod
    {
        public void GenshowValue<T>(T val)
        {
            Console.WriteLine(val.ToString());
            Console.ReadLine();
        }
 
    }
    class Program
    {
        static void Main(string[] args)
        {
            TestGenericMethod obj = new TestGenericMethod();
            obj.GenshowValue<int>(10);
            obj.GenshowValue<string>("This is string");
            obj.GenshowValue<double>(10.7545);
            
        }
    }
}
