using Microsoft.AspNetCore.Mvc;

namespace RoutingWithOutMVC.Controllers;

[Route("[Controller]")]
public class HomeController : Controller
{
    // GET
    
    [Route("")]
    //[Route("Home")]
    [Route("[action]")]
    //[Route("Anuj")]
    [Route("~/")]
    public IActionResult Index()
    {
        return View();
    }
    
    [Route("[action]")]
    public IActionResult About()
    {
        return View();
    }

    [Route("[action]/{id?}")]
    public int Details(int? id)
    {
        return id ?? 1;
    }
    
}

