package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    Employee johnEnglish;
    Employee edwardClarckson;
    Employee lindaEvans;

    Company softwareMachine;
    Company dataMaesters;
    Company greyMatter;

    @Before
    public void before() {

        johnEnglish = new Employee("John", "English");
        edwardClarckson = new Employee("Edward", "Clarckson");
        lindaEvans = new Employee("Linda", "Evans");

        softwareMachine = new Company("Software Machine");
        dataMaesters = new Company("Data Maesters");
        greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnEnglish);
        dataMaesters.getEmployees().add(edwardClarckson);
        dataMaesters.getEmployees().add(lindaEvans);
        greyMatter.getEmployees().add(johnEnglish);
        greyMatter.getEmployees().add(lindaEvans);

        johnEnglish.getCompanies().add(softwareMachine);
        johnEnglish.getCompanies().add(greyMatter);
        edwardClarckson.getCompanies().add(dataMaesters);
        lindaEvans.getCompanies().add(dataMaesters);
        lindaEvans.getCompanies().add(greyMatter);
    }

    @Test
    public void testSaveManyToMany(){
        //Given

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
     }
    @Test
    public void testEmployeeNamedQuery() {

        //Given
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        String testName = "English";
        List<Employee> resultList = employeeDao.retrieveEmployeeByLastname(testName);

        //Then
        Assert.assertEquals(testName, resultList.get(0).getLastname());
        Assert.assertEquals(1, resultList.size());

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
            employeeDao.delete(employeeDao.retrieveEmployeeByLastname(testName));
        } catch (Exception e) {
            System.out.println("records not found");
        }
    }

    @Test
    public void testCompanyNamedQuery() {

        //Given
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> resultList1 = companyDao.retrieveCompaniesStartWith("Sof");
        List<Company> resultList2 = companyDao.retrieveCompaniesStartWith("xxx");

        //Then
        Assert.assertEquals(softwareMachine.getName(), resultList1.get(0).getName());
        Assert.assertTrue(resultList2.isEmpty());

        //CleanUp
        try{
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        } catch (Exception e) {
            System.out.println("records not found");
        }
    }

    }