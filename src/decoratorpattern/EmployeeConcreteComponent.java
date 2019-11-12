/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguyennh
 */
public class EmployeeConcreteComponent implements EmployeeComponent {

    private String name;

    public EmployeeConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doTask() {
        //Chưa được giao công việc 
    }

    @Override
    public void join(Date joinDate) {
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(this.getName() + " làm việc tại công ty vào: " + dfm.format(joinDate));
    }

    @Override
    public void terminate(Date terminateDate) {
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(this.getName() + " làm việc tại công ty vào: " + dfm.format(terminateDate));
    }

}
