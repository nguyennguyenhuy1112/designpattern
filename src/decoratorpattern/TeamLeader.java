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
public class TeamLeader extends EmployeeDecorator {

    public TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " lên kế hoach.");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " hỗ trợ các thành viên trong nhóm.");
    }

    public void monitor() {
        System.out.println(this.employee.getName() + " giám sát chất lượng công việc.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
    }

}
