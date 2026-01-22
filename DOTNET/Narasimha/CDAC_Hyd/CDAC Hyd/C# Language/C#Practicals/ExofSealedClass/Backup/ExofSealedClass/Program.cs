using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofSealedClass
{
    public sealed class Liberty
    {
        public Liberty()
        {
            Console.WriteLine("Wel Come To Liberty");
        }

        public void Courses()
        {
            Console.WriteLine("We Teach Oracle Also");
            Console.ReadLine();
        }
    }

    public class Staff : Liberty
    {

    }
  
    class Program
    {
        static void Main(string[] args)
        {
            Liberty obj = new Liberty();
            obj.Courses();
        }
    }
}
