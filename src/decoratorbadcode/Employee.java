/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorbadcode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nguyennh
 */
public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void doTask() {
        //Chưa được giao nhiệm vụ 
    }

    public void join(Date joinDate) {
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(this.getName() + " làm việc tại công ty vào: " + dfm.format(joinDate));
    }

    public void terminate(Date terminateDate) {
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(this.getName() + " làm việc tại công ty vào: " + dfm.format(terminateDate));
    }

}
