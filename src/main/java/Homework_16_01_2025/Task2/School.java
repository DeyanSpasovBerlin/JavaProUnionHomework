package Homework_16_01_2025.Task2;

public class School {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student = new Student("student");
        System.out.println(student);
        Student.Injector.inject(student);
        System.out.println(student.student);
        student.printField(student);

        @StudentInfo(name = "Tom", surname = "Smith", groupNumber = 1101, isOnline = true)
        Student student2 = new Student();
        Student.Injector.inject(student2);
        System.out.println(student2);
        @StudentInfo(name = "Mary", surname = "Jennings", groupNumber = 1102, isOnline = false)
         Student student3 = new Student();
        Student.Injector.inject(student3);
        System.out.println(student3);
        student3.printField(student3);

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


https://github.com/IliaIliukovich/mavenMultiModuleExample

. Скачать проект https://github.com/IliaIliukovich/mavenMultiModuleExample
- открыть в среде разработки, изучить его устройство
- запустить тесты
- проверить, как связаны модули
- проверить запуск всех maven целей
- собрать jar и найти его в файловой системе
2. Создать новый maven-проект с одним классом.
Подключить зависимость от DesktopApp модуля проекта mavenMultiModuleExample
- вызвать метод app() класса DesktopApp.java
- запустить из командной строки
3. Добавить в проект mavenMultiModuleExample новый модуль MobileApp так, чтобы:
- модуль MobileApp имел один запускаемый класс
- модуль MobileApp имел junit тест
- модуль MobileApp мог использовать библиотеку lombok, классы модулей SharedLibrary и DesktopApp
Проверить, как запускается и собирается модуль из среды разработки, из командной строки

<!-- зависимость для сборки выполняемого JAR в maven проекте -->
<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-jar-plugin</artifactId>
<version>3.3.0</version>
<configuration>
<archive>
<manifest>
<addClasspath>true</addClasspath>
<classpathPrefix>lib/</classpathPrefix>
<mainClass>com.telran.Main</mainClass>
</manifest>
</archive>
</configuration>
</plugin>
</plugins>
</build>


<properties>
<maven.compiler.source>19</maven.compiler.source>
<maven.compiler.target>19</maven.compiler.target>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

</properties>
 */