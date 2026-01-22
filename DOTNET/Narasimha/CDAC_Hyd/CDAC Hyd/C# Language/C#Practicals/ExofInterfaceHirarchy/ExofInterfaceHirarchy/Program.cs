using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExofInterfaceHirarchy
{
    
    interface ICricket
    {
        void Game();
    }
    interface IBat:ICricket
    {
        void Batsman();
    }

    interface IBowl:IBat
    {
        void Bowler();
    }

    public class Test:IBowl
    {
        public void Game()
        {
            Console.WriteLine("Cricket is A Game Watched By Most Indians");
            Console.ReadLine();
        }
        public void Batsman()
        {
            Console.WriteLine("I Am a Batsman");
            Console.ReadLine();
        }
        public void Bowler()
        {
            Console.WriteLine("I am Bowler");
            Console.ReadLine();
        }
        public void Filder()
        {
            Console.WriteLine("Hello I Can Field Too");
            Console.ReadLine();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Test obj = new Test();
            obj.Game();
            obj.Batsman();
            obj.Bowler();
            obj.Filder();
        }
    }
}
