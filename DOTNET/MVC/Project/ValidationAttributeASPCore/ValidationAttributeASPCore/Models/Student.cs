using System.ComponentModel.DataAnnotations;

namespace ValidationAttributeASPCore.Models;

public class Student
{
    [Required(ErrorMessage = "The field {0} is required")]
    [StringLength(15, MinimumLength = 3, ErrorMessage = "The field {0} must be between 3 and 15 characters")]
    public string Name { get; set; }
}