using Microsoft.AspNetCore.Mvc;

namespace InstallingBootstrap.Controllers;

public class HomeController : Controller
{
    // GET
    public IActionResult Index()
    {
        return View();
    }
}