using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExofHashTableViceVersa
{
    class Program
    {
        static Hashtable Show()
        {
            Hashtable hashtable = new Hashtable();

            hashtable.Add(10, "Amit");
            hashtable.Add("Karthik", 100);
            return hashtable;
        }

        static void Main()
        {
            Hashtable hashtable = Show();

            string value1 = (string)hashtable[10];
            Console.WriteLine(value1);

            int value2 = (int)hashtable["Karthik"];
            Console.WriteLine(value2);
            Console.ReadLine();
        }
    }
}
