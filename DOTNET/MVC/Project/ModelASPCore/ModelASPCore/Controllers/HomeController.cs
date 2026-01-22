using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using ModelASPCore.Models;
using ModelASPCore.Repository;


namespace ModelASPCore.Controllers;


public class HomeController : Controller
{
    private readonly ILogger<HomeController> _logger;
    private readonly StudentRepository _studentRepository = null;

    public HomeController(ILogger<HomeController> logger)
    {
        _logger = logger;
        _studentRepository = new StudentRepository();
    }
    
    public List<StudentModel> getAllStudents()
    {
        return _studentRepository.GetAllStudents();
    }

    public StudentModel getStudentById(int id)
    {
        return _studentRepository.GetStudentById(id);
    }

    public IActionResult Index()
    {
        /*
        var students = new List<StudentModel>
        {
            new StudentModel { rollo = 1, Name = "Kumar", Gender = "Male", Standard = 11 },
            new StudentModel { rollo = 2, Name = "Anuj", Gender = "Male", Standard = 12 },
            new StudentModel { rollo = 3, Name = "Priya", Gender = "Female", Standard = 10 },
            new StudentModel { rollo = 4, Name = "Ravi", Gender = "Male", Standard = 11 },
            new StudentModel { rollo = 5, Name = "Sneha", Gender = "Female", Standard = 12 }
            
            
        };
        ViewData["myStudents"] = students;
        */
        return View();
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