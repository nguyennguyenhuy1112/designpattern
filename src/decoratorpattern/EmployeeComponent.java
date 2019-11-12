/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nguyennh
 */
public interface EmployeeComponent {

    String getName();

    void doTask();

    void join(Date joinDate);

    void terminate(Date terminateDate);

    default void showBasicInformation() {
        System.out.println("Thông tin cơ bản của : " + getName());
        join(Calendar.getInstance().getTime());

        Calendar terminateDate = Calendar.getInstance();
        terminateDate.add(Calendar.MONTH, 6);
        terminate(terminateDate.getTime());
    }
}
