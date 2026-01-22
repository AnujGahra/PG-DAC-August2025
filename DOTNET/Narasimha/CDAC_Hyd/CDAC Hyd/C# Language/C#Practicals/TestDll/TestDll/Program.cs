using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace TestDll
{
    class Program
    {
        static void Main(string[] args)
        {
            SagarLibrarary.Liberty obj1 = new SagarLibrarary.Liberty();
            obj1.Courses();
            obj1.Address();

            SagarLibrarary.Student obj2 = new SagarLibrarary.Student();
            obj2.Stname("Alwin");
            obj2.CourseDetails("Oracle");
        }
    }
}
