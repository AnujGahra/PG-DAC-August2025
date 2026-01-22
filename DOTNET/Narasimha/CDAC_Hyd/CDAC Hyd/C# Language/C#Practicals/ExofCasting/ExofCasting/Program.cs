using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofCasting
{
    class Program
    {
       

            static void Main(string[] args)
        {

            try
            {
                int x, y, z;
                //x = 10;
                //y = 15;
                x = 2147483647;
                y = 2147483647;
                z = checked(x + y);
                Console.WriteLine("Value of Z is  " + z.ToString());
                Console.ReadLine();
            }

            catch
            {
                Console.Write("Data Over Flow ");
                Console.ReadLine();
            }

        }

            

        }
    }

