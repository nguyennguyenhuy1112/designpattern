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
public class Client {

    public static void main(String[] args) {
        //employee
        System.out.println("\n");
        EmployeeConcreteComponent employee = new EmployeeConcreteComponent("Nguyen");
        employee.showBasicInformation();
        employee.doTask();

        //teamleader
        System.out.println("\n");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        //manager
        System.out.println("\n");
        EmployeeComponent teamLeadAsManager = new Manager(teamLeader);
        teamLeadAsManager.showBasicInformation();
        teamLeadAsManager.doTask();
    }
}
