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
            Console.WriteLine("Hello Laxman This is Cobra");
            Console.ReadLine();
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            Fish obj = new Fish();
            obj.Movement();

            Snake obj1 = new Snake();
            obj1.Movement();
            obj1.Show();
        }
    }
}
