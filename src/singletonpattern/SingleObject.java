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
public class SingleObject {

    private String name;

    //Khởi tạo một đối tượng của SingleObject
    private static SingleObject instance;

    //tạo phương thức khởi tạo private để lớp này không thể được khởi tạo
    private SingleObject(String name) {
        this.name = name;
    }

    //Trả về đối tượng duy nhất sẵn có 
    public static SingleObject getInstance(String name) {
        if (instance == null) {
            instance = new SingleObject(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

}
