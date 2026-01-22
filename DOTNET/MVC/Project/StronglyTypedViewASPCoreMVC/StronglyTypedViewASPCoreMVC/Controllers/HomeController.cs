using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using StronglyTypedViewASPCoreMVC.Models;

namespace StronglyTypedViewASPCoreMVC.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index()
    {
        
        /*
        Employee obj = new Employee()
        {
            EmpId = 101,
            EmpName = "John Doe",
            Designation = "Designation",
            Salary = 25000
        };
        
        */
        
        var myEmployees = new List<Employee>
        {
            new Employee { EmpId = 101, EmpName = "John Doe", Designation = "Software Engineer", Salary = 10000 },
            new Employee { EmpId = 102, EmpName = "Anuj Kumar", Designation = "Frontend Developer", Salary = 12000 },
            new Employee { EmpId = 103, EmpName = "Priya Sharma", Designation = "HR Executive", Salary = 11000 },
            new Employee { EmpId = 104, EmpName = "Ravi Patel", Designation = "Backend Developer", Salary = 13000 },
            new Employee { EmpId = 105, EmpName = "Sneha Verma", Designation = "UI/UX Designer", Salary = 12500 }
        };
        return View(myEmployees);
    }

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
    }
}