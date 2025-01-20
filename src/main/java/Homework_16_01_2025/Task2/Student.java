package Homework_16_01_2025.Task2;

import Homework_16_01_2025.Task1.MyStack;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

@AllArgsConstructor
@NoArgsConstructor
public class Student {
   private String name;
   private String surname;
   private int groupNumber;
   private boolean isOnline;

    public Student(String name, String surname, int groupNumber, boolean isOnline) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.isOnline = isOnline;

    }

    @StudentInfo(name = "John",surname = "Smith",groupNumber = 13,isOnline = true)
    String student1;



    public Student(String student1) {
        this.student1 = student1;
    }


    public String getStudent1() {
        return student1;
    }

    static class Injector {
        public static void inject(Object instance) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(StudentInfo.class)) {
                    StudentInfo annotation = field.getAnnotation(StudentInfo.class);
                    field.setAccessible(true); // should work on private fields
                    try {
                        field.set(instance, annotation.name());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "student1='" + student1 + '\'' +
                '}';
    }

    public void printField(Student student) throws NoSuchFieldException, IllegalAccessException {

        Class<? extends Student> studentClass = student.getClass();
        Field studentName = studentClass.getDeclaredField("name");
        Field studentSurname = studentClass.getDeclaredField("surname");
        Field studentGroupNumber = studentClass.getDeclaredField("groupNumber");
        Field studentIsOnline = studentClass.getDeclaredField("isOnline");
        String stName = (String) studentName.get(student);
        String stSurname = (String) studentSurname.get(student);
        int stGroupNumber = (int) studentGroupNumber.get(student);
        boolean stIsOnline = (boolean) studentIsOnline.get(student);
        System.out.println("Student name " + stName + " with family name " + stSurname + " has GroupNumber " +
                stGroupNumber + " and now is online: " + stIsOnline);


    }
}
