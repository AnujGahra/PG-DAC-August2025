using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofTryCatch
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                int x, y;

                Console.Write("Enter First Number :");
                x = int.Parse(Console.ReadLine());

                Console.Write("Enter Second Number :");
                y = int.Parse(Console.ReadLine());

                Console.WriteLine("Result of Div is  " + (x / y).ToString());
              }

            catch (FormatException fx)
            {
                Console.WriteLine(fx.Message);
            }

            catch (OverflowException ox)
            {
                Console.WriteLine(ox.Message);
            }

            catch (DivideByZeroException dx)
            {
                Console.WriteLine(dx.Message);
            }
            finally
            {
                Console.WriteLine("Program Execution Over");
                Console.ReadLine();
            }

        }
    }
}
