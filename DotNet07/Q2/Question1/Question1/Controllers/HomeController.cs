using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using Question1.Models;

namespace Question1.Controllers;

public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
    }

    public IActionResult Index(Address add)
    {
        /*
        Address address = new Address()
        {
            HouseNo =  1,
            Street = "123 Main Street",
            City = "London"
        };
        */
        
        return View(add);
    }
    [HttpPost]
    public IActionResult Details(Address add)
    {
        return View(add);
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