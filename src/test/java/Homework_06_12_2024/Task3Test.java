package Homework_06_12_2024;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

   Task3 task3;
   @BeforeEach
    public void init(){
       task3 = new Task3();
   }
   @Test
     public void validateLoginPass(){
        assertTrue(task3.validateLoginPass("dsgsAjhsksk","0dak1jli5i9","0dak1jli5i9"));
        assertFalse(task3.validateLoginPass("dsgs1Ajhsksk","0dak1jli5i9","0dak1jli5i9"));
       assertFalse(task3.validateLoginPass("dsgsAjhsksk","0da","0da"));
       assertFalse(task3.validateLoginPass("dsgsAjhsksk","0daj18od4","0daj19od4"));
       assertFalse(task3.validateLoginPass("dsgs1Ajhsksk","0dak1jl i5i9","0dak2jli5i9"));
       assertTrue(task3.validateLoginPass("john","1234a","1234a"));
       assertFalse(task3.validateLoginPass("john","12345","123456"));
       assertFalse(task3.validateLoginPass("john","12345@","12345@"));
       assertFalse(task3.validateLoginPass("john1","12345","12345"));
   }
}
//assertThrows(WrongLoginException.class,() ->
//        task3.validateLoginPass("dsgs1Ajhsksk","0dak1jli5i9","0dak1jli5i9"));
// Почему ето команда не работает!?