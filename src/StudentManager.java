public class StudentManager extends UserManager{
    public void listEnrolledStudents(Student[] students){
        for (Student student:students) {
            System.out.println(student.getFirstName() + " " +  student.getLastName() + " is enrolled to the class.");
        }
    }
}
