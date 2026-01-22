using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using ExofModelBinders.Models;
namespace ExofModelBinders.Controllers
{


    public class HomeController : Controller
    {
      
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Show(Staff obj)
        {
            return View(obj);
        }

    }
}