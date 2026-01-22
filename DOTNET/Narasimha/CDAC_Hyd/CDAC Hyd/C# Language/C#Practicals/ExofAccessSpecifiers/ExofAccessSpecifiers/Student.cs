using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofAccessSpecifiers
{
   public class Student
    {
        Test obj = new Test();
        public void ShowDate()
        {
            Console.WriteLine("Today's Date is " + DateTime.Now.ToShortDateString());
            obj.Display4();
            obj.Display2();
            obj.Display5();
        }
    }
}
