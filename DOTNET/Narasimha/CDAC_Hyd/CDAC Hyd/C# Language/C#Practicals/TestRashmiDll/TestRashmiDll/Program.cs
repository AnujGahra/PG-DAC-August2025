using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestRashmiDll
{
    class Program
    {
        static void Main(string[] args)
        {
            RashmiLibrary.Liberty obj1 = new RashmiLibrary.Liberty();
            obj1.Courses();
            obj1.Address();

            RashmiLibrary.Test obj2 = new RashmiLibrary.Test();
            obj2.AddNumbers(10, 15);

        }
    }
}
