package com.bilgeadam.controller;

import com.bilgeadam.dto.EmployeesDTO;
import com.bilgeadam.service.EmployeesService;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class EmployeesController {

    public static void main(String[] args) {
        EmployeesService  employeesService = new EmployeesService();
/*      List<EmployeesDTO> employeesDTOList = employeesService.findAll();
        employeesDTOList.forEach(System.out::println);
        EmployeesDTO employeesDTO = employeesService.findById(102l);
        System.out.println(employeesDTO.toString());


        List<EmployeesDTO> employeesDTOList = employeesService.findAllMinSalaryRange(1200.00,10_000.0);
        employeesDTOList.forEach(System.out::println);

        List<EmployeesDTO> employeesDTOList = employeesService.findAllOrderWithCriteria();
        employeesDTOList.forEach(System.out::println);

        List<EmployeesDTO> employeesDTOList = employeesService.findAllOrderByLimitWithCriteria(10);
        employeesDTOList.forEach(System.out::println);

                LocalDateTime localDateTime = LocalDateTime.of(2003,01,01,0,0);

        List<EmployeesDTO> employeesDTOList = employeesService.findAllByBiggerThanHireDate( Timestamp.valueOf(localDateTime));
        employeesDTOList.forEach(System.out::println);
        */


        List<EmployeesDTO> employeesDTOList = employeesService.findAllWithDepertmantsWithCriteria();
        employeesDTOList.forEach(System.out::println);
    }
}
