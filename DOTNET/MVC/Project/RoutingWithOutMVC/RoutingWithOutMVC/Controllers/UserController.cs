using Microsoft.AspNetCore.Mvc;

namespace RoutingWithOutMVC.Controllers;

public class UserController : Controller
{
    // GET
    public IActionResult Index()
    {
        return View();
    }
    
    
    public IActionResult UserDetails()
    {
        return View();
    }
}