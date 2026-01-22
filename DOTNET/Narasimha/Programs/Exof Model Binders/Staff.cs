using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ExofModelBinders.Models
{
    public class Staff
    {
        public int Eno { get; set; }
        public string Ename { get; set; }
        public DateTime Doj { get; set; }
        public double Sal { get; set; }
    }
}