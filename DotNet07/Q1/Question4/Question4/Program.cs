using System;


interface IDisplay
{
    void ShowDetails(); 
}

class Person
{
    public string Name { get; set; }

    public void GetPersonInfo()
    {
        Console.WriteLine("Enter Name:");
        Name = Console.ReadLine();
    }
}




class Student : Person
{
    public int RollNo { get; set; }

    public void GetStudentInfo()
    {
        Console.WriteLine("Enter Roll Number:");
        RollNo = Convert.ToInt32(Console.ReadLine());
    }
}


class Result : Student, IDisplay
{
    public double Marks { get; set; }

    public void GetResultInfo()
    {
        Console.WriteLine("Enter Marks:");
        Marks = Convert.ToDouble(Console.ReadLine());
    }

    
    public void ShowDetails()
    {
        Console.WriteLine("\n--- Student Details ---");
        Console.WriteLine($"Name   : {Name}");
        Console.WriteLine($"RollNo : {RollNo}");
        Console.WriteLine($"Marks  : {Marks}");
    }
}


class Program
{
    static void Main()
    {
        Result r = new Result();

        // Collecting data
        r.GetPersonInfo();
        r.GetStudentInfo();
        r.GetResultInfo();

        
        r.ShowDetails();
    }
}