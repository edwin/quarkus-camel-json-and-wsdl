package com.edw.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.4
 * 2024-06-16T21:28:21.998+07:00
 * Generated source version: 4.0.4
 *
 */
@WebService(targetNamespace = "http://localhost/employee", name = "EmployeeServicePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EmployeeServicePortType {

    @WebMethod(operationName = "GetEmployeesByName", action = "http://localhost/employee/GetEmployeesByName")
    @WebResult(name = "EmployeesResponse", targetNamespace = "http://localhost/employee", partName = "parameters")
    public EmployeesResponse getEmployeesByName(

        @WebParam(partName = "parameters", name = "EmployeeByNameRequest", targetNamespace = "http://localhost/employee")
        EmployeeByNameRequest parameters
    );

    @WebMethod(operationName = "GetEmployeeById", action = "http://localhost/employee/GetEmployeeById")
    @WebResult(name = "EmployeeResponse", targetNamespace = "http://localhost/employee", partName = "parameters")
    public EmployeeResponse getEmployeeById(

        @WebParam(partName = "parameters", name = "EmployeeByIdRequest", targetNamespace = "http://localhost/employee")
        EmployeeByIdRequest parameters
    );
}