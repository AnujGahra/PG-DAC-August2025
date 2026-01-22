using ModelASPCore.Models;

namespace ModelASPCore.Repository;

public interface IStudent
{
    List<StudentModel> GetAllStudents();
    StudentModel GetStudentById(int id);
}