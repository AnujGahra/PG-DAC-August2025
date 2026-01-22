using Microsoft.AspNetCore.Mvc;

namespace ControllerAndActios.Controllers;

public class HomeController : Controller
{
    // GET
    public IActionResult Index()
    {
       // ViewData["Message"] = "Welcome to Program ki Duniya";
       // ViewData["Message2"] = "Welcome to Program ki Duniya2";
       // ViewData["Message3"] = "Welcome to Program ki Duniya3";
       // ViewData["DateTime"] = DateTime.Now.ToLongDateString();
       // string[] arr = { "Anuj", "Kumar", "Gahra" };
       // ViewData["Array"] = arr;

/*
       ViewBag.data1 = "AnujGahra";
       ViewBag.data2 = 23;
       ViewBag.data3 = "REC Azamgarh";
       
*/
    
        
        ViewData["Message"] = "Welcome to Program ki Duniya";
        ViewBag.Message2 = "Welcome to Program ki Duniya2 from viewBag";
        TempData["Message3"] = "Welcome to Program ki Duniya3 from TempData";
        return View();
    }
    
    
    public IActionResult About()
    {
        return View();
    }
    
    
    public IActionResult Contact()
    {
        return View();
    }
    
    
    public string Display()
    {
        return "Welcome to Program ki Duniya";
    }
    
    
    public int DisplayId(int id)
    {
        return id;
    }
}