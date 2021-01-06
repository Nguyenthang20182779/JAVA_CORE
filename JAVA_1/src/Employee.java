/*
public class Employee {
    int id;
    String name;
    float salary;

    void insert(int i, String n, float s){
        id = i;
        name = n;
        salary = s;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}


 */


class Rectangle {
    int WIDTH;
    int HEIGHT;

    void insert(int WIDTH, int HEIGHT){
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    void displayArea(){
        System.out.println(WIDTH*HEIGHT);
    }
}