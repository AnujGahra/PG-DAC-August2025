using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofInheritance
{
    public class Mycar
    {
        public int Tyres = 4;
        public int Steering = 1;
        public Mycar()
        {
            Console.WriteLine("Krishna Purchased Car");
            Console.ReadLine();
        }

        public void Features()
        {
            Console.WriteLine("It is A Luxury Vehicle");
            Console.ReadLine();
        }
        public void Fuel()
        {
            Console.WriteLine("It uses Petrol As Fuel");
            Console.ReadLine();
        }
    }

    public class Maruti:Mycar
    {
        public void NewFeatures()
        {
            Console.WriteLine("It Has A/c and Central Locking");
            Console.ReadLine();
        }

        public void Show()
        {
            Console.WriteLine("It Can Work on Disel and Lpg Also");
            Console.ReadLine();
        }
    }
    
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Parenent Class Details");
            Mycar obj1 = new Mycar();
            obj1.Features();
            obj1.Fuel();
            Console.WriteLine("Child  Class Details");
            Maruti obj2 = new Maruti();
            obj2.Features();
            obj2.Fuel();
            obj2.NewFeatures();
            obj2.Show();
            Console.WriteLine("Your Car Has Tyres  " + obj2.Tyres);
            Console.WriteLine("Your Car Has Steering  " + obj2.Steering);

           
            Console.ReadLine();
        }
    }
}
