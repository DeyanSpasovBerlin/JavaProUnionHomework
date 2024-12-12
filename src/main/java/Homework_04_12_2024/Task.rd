Описание задания.
 1 уровень сложности: 1. Создайте файл с текстом: "This is my first experience when I work with IO API. I can do everything!"
Откройте и прочтите файл, напечатав его содержимое в консоль.



  2  Один метод вызывает три других метода, которые выбрасывают проверяемые и непроверяемые исключения:
    public static void method1() {
        System.out.println(1 / 0);
    }
    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }
    public static void method3() throws IOException {
        throw new IOException("File not found");
    }
    Отловить эти исключения и выбросить вместо них MyAppException, который содержал бы информацию о типе
    исходного исключения и его сообщение.

   3 В некотором методе возникает Exception. Реализовать логирование стектрейса Exception со временем ошибки в файл errors.log.
    Логи всех возникших Exception должны накапливаться в файле, не перезаписываясь при перезапуске программы.

