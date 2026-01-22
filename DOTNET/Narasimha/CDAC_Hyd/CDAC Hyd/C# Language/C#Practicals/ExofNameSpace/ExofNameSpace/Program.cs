using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Second;
namespace First
{
    public class Test
    {
        public void Hello(string st)
        {
            Console.WriteLine("Hello From First NameSpace " + st);
            Console.ReadLine();
        }
    }
}


namespace Second
{
    public class Test
    {

        public void Hello(string st)
        {
            Console.WriteLine("Hello From Second Namespace   " + st);
            Console.ReadLine();
        }
        public void Hi(string st)
        {
            Console.WriteLine("Hi " + st);
            Console.ReadLine();
        }
    }
namespace ExofNameSpace
{

    

    class Program
    {
        static void Main(string[] args)
        {
            First.Test obj1 = new First.Test();
            obj1.Hello("Amit");
            Test obj2 = new Test();
            obj2.Hi("Karthik");
            obj2.Hello("Krishna");
        }
    }

}

}
