using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using TagHelperDemoWithMVC.Models;

namespace TagHelperDemoWithMVC.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    
    public IActionResult Index()
    {
        
        return View();
    }
    /*
    [HttpPost] 
    public string Index(Employee e)
    {
        return "Name: " +e.Name + "Gender: " + e.Gender + "Age: " + e.Age + "Salary: " + e.Salary + "Designation: " + e.Designation;
    }
*/
    
    [HttpPost]
    public IActionResult Index(Employee e)
    {
         
        
        // Pass the submitted data back to the view
        return View(e);
    }
    
    
    [HttpPost]
    public IActionResult Contact(Employee e)
    {
        return View(e);
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