package com.kodilla.hibernate.manytomany.facade;

public class SearchServiceException extends Exception {
    public static final String ERR_EMPLOYEE_NOT_FOUND = "No results for such employee ";
    public static final String ERR_COMPANY_NOT_FOUND =  "No results for such company ";

    public SearchServiceException(String message) {
        super(message);
    }
}
