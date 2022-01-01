//package com.torryharris.practce.Contoller;
//
//import com.torryharris.practce.controller.EmployeeController;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//@SpringBootTest
//public class EmployeeControllerTest {
//
//    @Autowired
//    private EmployeeController employeeController;
//
//    // positive test case
//    @Test
//    public void testGetEmpById() {
//        HttpStatus expected = HttpStatus.OK;
//        HttpStatus actual = employeeController.getEmpById(1).getStatusCode(); // 200
//        assertEquals(expected, actual);
//    }
//
//    // negative test case
//    @Test
//    public void testGetEmpById2() {
//        HttpStatus unexpected = HttpStatus.NOT_FOUND;
//        HttpStatus actual = employeeController.getEmpById(1).getStatusCode(); // 200
//        assertNotEquals(unexpected, actual);
//    }
//}
//}
