using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using ExofMVVM.Models;
namespace ExofMVVM.Controllers
{
    public class HomeController : Controller
    {
       
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult Show(Student obj)
        {
            StudentResult res = new StudentResult();
            res.Stno = obj.Stno;
            res.FullName = obj.Fname + " " + obj.Lname;
            res.MarksTaken = obj.Marks;
            if(obj.Marks>=35)
            {
                res.MarksColor = "green";
            }
            else
            {
                res.MarksColor = "red";
            }


            if (obj.Marks >= 35)
            {
                res.Result = true;
                res.ResultColor = "blue";
            }
            else
            {
                res.Result = false;
                res.ResultColor = "maroon";
            }
            return View(res);
        }
    }
}