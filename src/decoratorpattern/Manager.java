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
public class Manager extends EmployeeDecorator {

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + "tạo các yêu cầu dự án. ");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " giao nhiệm vụ cho các thành viên. ");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " quản lý tiến độ dự án. ");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }

}
