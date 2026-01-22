using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExofHashTable1
{
    class Program
    {
        static void Main(string[] args)
        {
            Hashtable ht = new Hashtable();
            ht.Add("1", "Akshay");
            ht.Add("2", "Karthik");
            ht.Add("3", "Shrindihi");
            ht.Add("4", "Zaheer");
            ICollection key = ht.Keys;
            Console.WriteLine("Retrieving all elements: ");
            Console.WriteLine();
            foreach (var k in key)
            {
                Console.WriteLine(k + ":" + ht[k]);
            }
            ArrayList al = new ArrayList(key);
            Console.WriteLine("Retrieving all keys in the arraylist");
            Console.WriteLine();
            foreach (var n in al)
            {
                Console.WriteLine(n);
            }
            Console.ReadKey();  
        }
    }
}
