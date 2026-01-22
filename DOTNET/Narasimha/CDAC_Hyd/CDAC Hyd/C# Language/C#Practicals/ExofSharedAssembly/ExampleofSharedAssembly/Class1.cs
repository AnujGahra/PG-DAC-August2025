using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExampleofSharedAssembly
{
    public class TestShared
    {
        public TestShared()
        {
            Console.WriteLine("This is a Shared Assembly Constructor");
            Console.ReadLine();
        }

        public void Show(string name)
        {
            Console.WriteLine("Hello How Are  You"+name);
            Console.ReadLine();
        }
    }
}
