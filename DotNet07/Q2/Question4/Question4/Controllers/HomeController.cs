using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Authorization;

namespace Question4.Controllers
{
    public class HomeController : Controller
    {
        
        
        public IActionResult Index()
        {
            ViewBag.Message = "Welcome to Index Page";
            return View();
        }

        [HttpPost]
        
        public IActionResult Index(string name)
        {
            ViewBag.Message = $"Hello {name}.";
            return View();
        }

        [ActionName("ShowDetails")]
        public IActionResult Details()
        {
            ViewBag.Message = "This is the Details action, but accessible as ShowDetails.";
            return View("Index"); 
        }
    }
}