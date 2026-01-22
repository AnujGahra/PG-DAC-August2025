using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofDelegateWithEvent
{

    class Test
    {
        public event EventHandler MyEvent
        {
            add
            {
                Console.WriteLine("add operation");
            }

            remove
            {
                Console.WriteLine("remove operation");
            }
        }

        class Program
        {
            static void Main(string[] args)
            {
                Test obj = new Test();
                obj.MyEvent += obj_MyEvent;
                obj.MyEvent -= obj_MyEvent;
                Console.ReadLine();
            }

            static void obj_MyEvent(object sender, EventArgs e)
            {
                //Console.WriteLine("Hello From Event");
                Console.ReadLine();
            }
           
          
        }

    }
}