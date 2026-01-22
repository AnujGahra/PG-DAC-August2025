using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ExofMVVM.Models
{
    public class StudentResult
    {
        public int Stno { get; set; }
        public string FullName { get; set; }
        public int MarksTaken { get; set; }
        public string MarksColor { get; set; }
        public bool Result { get; set; }
        public string ResultColor { get; set; }
    }
}