using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestUmeshClass
{
    class Program
    {
        static void Main(string[] args)
        {
            UmeshLibrary.Umesh obj1 = new UmeshLibrary.Umesh();
            obj1.Work();

            UmeshLibrary.Liberty obj2 = new UmeshLibrary.Liberty();
            obj2.Courses();
            obj2.Address();
        }
    }
}
