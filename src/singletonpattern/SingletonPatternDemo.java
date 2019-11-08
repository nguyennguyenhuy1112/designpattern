/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author nguyennh
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //Lỗi do phương thức khởi tạo private
        //SingleObject object = new SingleObject("Nguyen");

        //Lấy đối tượng duy nhất sẵn có 
        SingleObject object1 = SingleObject.getInstance("Nguyen");
        SingleObject object2 = SingleObject.getInstance("VUong");

        System.out.println(object1.getName());
        System.out.println(object2.getName());

    }
}
