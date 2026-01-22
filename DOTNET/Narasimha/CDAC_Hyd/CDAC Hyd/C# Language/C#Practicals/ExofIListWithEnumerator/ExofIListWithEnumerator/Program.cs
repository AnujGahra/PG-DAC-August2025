using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;
namespace ExofIListWithEnumerator
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> Students = new List<string>();
                Students.Add("Sourav");
                Students.Add("Karthik");
                Students.Add("Amit");
                Students.Add("shyam");
                Students.Add("Sachin");

                IEnumerable names = from n in Students where (n.StartsWith("S")) select n;
                foreach (string name in names)
               {

                  Console.WriteLine(name);

                }
               Console.ReadLine();

            }

        }
    }

