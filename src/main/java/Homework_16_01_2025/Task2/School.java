package Homework_16_01_2025.Task2;

public class School {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = new Student("student1");
        System.out.println(student);
        Student.Injector.inject(student);
        System.out.println(student.student1);
        student.printField(student);

        @StudentInfo(name = "Tom", surname = "Smith", groupNumber = 1101, isOnline = true)
        Student student2 = new Student();
        System.out.println(student2);
        @StudentInfo(name = "Mary", surname = "Jennings", groupNumber = 1102, isOnline = false)
         Student student3 = new Student();
        System.out.println(student3);

    }
}



/*
Имеется класс Student с полями String name, String surname, int groupNumber, boolean isOnline.
    Создать аннотацию @StudentInfo и соответствующий инжектор через рефлексию, чтобы с их помощью иметь возможность
     инициализировать поля типа Student. Например:


public class School {
    @StudentInfo(name = "Tom", surname = "Smith", groupNumber = 1101, isOnline = true)
    private Student student1;

@StudentInfo(name = "Mary", surname = "Jennings", groupNumber = 1102, isOnline = false)
private Student student2;
 */