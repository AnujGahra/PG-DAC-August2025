using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofInterFace
{
    interface IAnimals
    {
       
        void Movement();
       
    }

    public class Fish:IAnimals
    {
        public void Movement()
        {
            Console.WriteLine("Fish Movement Means It Swims");
            Console.ReadLine();
        }
    }


    public class Snake : IAnimals
    {
        public void Movement()
        {
            Console.WriteLine("Snake Movement Means It Crawls");
            Console.ReadLine();
        }
        public void Show()
        {
            Console.WriteLine("Hello How Are U");
            Console.ReadLine();
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            IAnimals obj = new Fish();
            obj.Movement();

            IAnimals obj1 = new Snake();
            obj1.Movement();
            Snake obj2 = new Snake();
            obj2.Show();
        }
    }
}
