public class Student {
    int roll;
    String name;
   int age;
   int marks;

   Student(){
       this.age=age;
       this.name=name;
       this.marks=marks;
       this.roll=roll;





//               System.out.println(roll);
//               System.out.println(name);
//               System.out.println(age);
//               System.out.println(marks);


   }
    Student(int age,int marks){
       this.age=age;
       this.marks=marks;
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Abbas";
        s1.age=19;
       s1.marks=350;
        s1.roll=45;


        if((s1.age>18 && s1.age<60) &&(s1.marks>0 && s1.marks<500)){
            System.out.println(s1.name);
            System.out.println(s1.roll);
            System.out.println(s1.age);
            System.out.println(s1.marks);
        }
        else{
            System.out.println("enter valid age or marks");
        }



        Student s2=new Student(32,439);
        s2.name="Abbas";
//        s1.age=19;
//        s1.marks=350;
        s2.roll=45;
        if((s2.age>18 && s2.age<60) &&(s2.marks>0 && s2.marks<500)){
            System.out.println(s2.name);
            System.out.println(s2.roll);
            System.out.println(s2.age);
            System.out.println(s2.marks);
        }
        else{
            System.out.println("enter valid age or marks");
        }




    }




}
