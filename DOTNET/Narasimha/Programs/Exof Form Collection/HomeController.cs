using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using ExofMVC.Models;
namespace ExofMVC.Controllers
{
    public class HomeController : Controller
    {
        
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Show(IFormCollection fc)
        {
            Students obj = new Students();
            obj.Stno = int.Parse(fc["Sno"]);
            obj.Stname = fc["Sname"];
            obj.Doa = DateTime.Parse(fc["Doa"]);
            obj.Fees = int.Parse(fc["Fee"]);
            ViewBag.St = obj;
            return View();
        }

    }
}