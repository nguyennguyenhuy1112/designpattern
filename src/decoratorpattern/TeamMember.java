/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

/**
 *
 * @author nguyennh
 */
public class TeamMember extends EmployeeDecorator {

    public TeamMember(EmployeeComponent employee) {
        super(employee);
    }
    
    public void reportTask() {
        System.out.println(this.employee.getName() + " báo cáo các task được giao.");
    }
 
    public void coordinateWithOthers() {
        System.out.println(this.employee.getName() + " công tác với các thành viên trong nhóm.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }

}
