public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setEmail("arautucu@sabanciuniv.edu");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructor();
        instructorManager.signUp(instructor);

        Student student = new Student();
        student.setEmail("arautucu@sabanciuniv.edu");
        StudentManager studentManager = new StudentManager();
        studentManager.signUp(student);


        Student student1 = new Student();
        student1.setFirstName("Ahmet");
        student1.setLastName("Mehmet");


        Student student2 = new Student();
        student2.setFirstName("Fatih");
        student2.setLastName("Koray");

        Student student3 = new Student();
        student3.setFirstName("Ali");
        student3.setLastName("Veli");

        Student[] students = new Student[] {
                student1,
                student2,
                student3
        };

        studentManager.listEnrolledStudents(students);

    }
}
