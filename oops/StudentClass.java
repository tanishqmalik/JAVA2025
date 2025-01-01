package oops;

public class StudentClass{

    // public static class Student{

    //     //creating a new data type
    //     String name;
    //     int rno;
    //     double percent;
    // }

    public static class Car{
        String name;
        String type;
        int price;
    }

    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args) {


        // class Student{

        //     //creating a new data type
        //     String name;
        //     int rno;
        //     double percent;
        // }

        Student x = new Student();
        x.name = "Raghav";
        x.rno = 76;
        x.percent = 92.5;

        System.out.println(x.name + x.rno);

        Student s = new Student();
        s.name = "Akshit";
        s.percent = 97.2;
        s.rno = 3;


        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 400000;
        c1.type = "hatchback";


        fun(x);

    }
}