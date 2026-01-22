using ModelASPCore.Models;

namespace ModelASPCore.Repository;

public class StudentRepository : IStudent
{
    public List<StudentModel> GetAllStudents()
    {
        return DataSource();
    }

    public StudentModel GetStudentById(int id)
    {
        return DataSource().Where(x => x.rollo == id).FirstOrDefault();
    }

    private List<StudentModel> DataSource()
    {
        return new List<StudentModel>
        {
            new StudentModel { rollo = 1, Name = "Kumar", Gender = "Male", Standard = 11 },
            new StudentModel { rollo = 2, Name = "Anuj", Gender = "Male", Standard = 12 },
            new StudentModel { rollo = 3, Name = "Priya", Gender = "Female", Standard = 10 },
            new StudentModel { rollo = 4, Name = "Ravi", Gender = "Male", Standard = 11 },
            new StudentModel { rollo = 5, Name = "Sneha", Gender = "Female", Standard = 12 }


        };
    }
}