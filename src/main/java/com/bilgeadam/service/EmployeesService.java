package com.bilgeadam.service;

import com.bilgeadam.dao.EmployeesDao;
import com.bilgeadam.dto.DepartmentsDTO;
import com.bilgeadam.dto.EmployeesDTO;
import com.bilgeadam.entity.Employees;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesService {
    private EmployeesDao employeesDao;

    public EmployeesService() {
        this.employeesDao = new EmployeesDao();
    }

    public List<EmployeesDTO> findAll(){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAll();
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                .build()).collect(Collectors.toList());
     return employeesDTOList;

    }

    public EmployeesDTO findById(Long id){
        Employees employees = employeesDao.findByIdWithCriteria(id);
        return EmployeesDTO.builder()
                .firstName(employees.getFirstName())
                .lastName(employees.getLastName())
                .email(employees.getEmail())
                .phoneNumber(employees.getPhoneNumber())
                .hireDate(employees.getHireDate())
                .salary(employees.getSalary())
                .commissionPct(employees.getCommissionPct())
                .build();
    }
    public List<EmployeesDTO> findAllMinSalaryRange(Double minSalary, Double maxSalary){
        List<Employees> employeesList = employeesDao.findAllMinSalaryRangeWhithCriteria(minSalary,maxSalary);
        List<EmployeesDTO> employeesDTOList;
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;
    }

    public List<EmployeesDTO> findAllOrder(){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllOrder();
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;

    }

    public List<EmployeesDTO> findAllOrderWithCriteria(){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllOrderWithCriteria();
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;

    }

    public List<EmployeesDTO> findAllOrderByLimit(int limit){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllOrderByLimit(limit);
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;
    }

    public List<EmployeesDTO> findAllOrderByLimitWithCriteria(int limit){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllOrderByLimitWithCriteria(limit);
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;
    }
    public List<EmployeesDTO> findAllByBiggerThanHireDate(Timestamp hireDate){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllByBiggerThanHireDate(hireDate);
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;
    }

    public List<EmployeesDTO> findAllWithDepertmants(){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllWithDepertmants();
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .departments(DepartmentsDTO.builder().departmentName(x.getDepartments().getDepartmentName()).build())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;
    }
    public List<EmployeesDTO> findAllWithDepertmantsWithCriteria(){
        List<EmployeesDTO> employeesDTOList;
        List<Employees> employeesList = this.employeesDao.findAllWithDepertmantsWithCriteria();
        employeesDTOList = employeesList.stream().map(x ->
                EmployeesDTO.builder()
                        .firstName(x.getFirstName())
                        .lastName(x.getLastName())
                        .email(x.getEmail())
                        .phoneNumber(x.getPhoneNumber())
                        .hireDate(x.getHireDate())
                        .salary(x.getSalary())
                        .commissionPct(x.getCommissionPct())
                        .departments(DepartmentsDTO.builder().departmentName(x.getDepartments().getDepartmentName()).build())
                        .build()).collect(Collectors.toList());
        return employeesDTOList;
    }

}


