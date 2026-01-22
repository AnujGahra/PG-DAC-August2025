using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofOperatorOverLoading
{
    public class TestOp
    {
        public int no;
        public string st = "";
        public static TestOp operator +(TestOp obj1, TestOp obj2)
        {
            TestOp obj3 = new TestOp();
            obj3.no = obj1.no + obj2.no;
            obj3.st = obj1.st + obj2.st;
            return obj3;

        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            TestOp obj1 = new TestOp();
            obj1.no = 10;
            obj1.st = "Liberty ";

            TestOp obj2 = new TestOp();
            obj2.no = 15;
            obj2.st = " Computers";

            TestOp obj3 = new TestOp();
            obj3 = obj1 + obj2;
            Console.WriteLine("Result of Add is  "+obj3.no.ToString());
            Console.WriteLine("Result of Concatination is  " + obj3.st.ToString());
            Console.ReadLine();
        }
    }
}
