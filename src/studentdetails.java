

public class studentdetails {
    int  roll;
    String name;
    String address;
    String collageName;
//    studentdetails(int roll,String name,String address,String collageName){
//        this.roll=roll;
//        this.name=name;
//        this.address=address;
//        this.collageName=collageName;
//    }
//    studentdetails(int roll,String name,String address){
//        this.roll=roll;
//        this.name=name;
//        this.address=address;
//        collageName="NIT";
//    }

    public  void getStudent(boolean check){
        if(check==true){


            this.roll=roll;
            this.name=name;
            this.address=address;
            collageName="NIT";
            System.out.println(roll);
            System.out.println(name);
            System.out.println(address);
            System.out.println(collageName);


        }
        else{
            this.roll=roll;
            this.name=name;
            this.address=address;
            this.collageName=collageName;
            System.out.println(roll);
            System.out.println(name);
            System.out.println(address);
            System.out.println(collageName);
            System.out.println("not from nit");

        }
    }

    public static void main(String[] args) {
        studentdetails s1 = new studentdetails();
        s1.name = "abbas";
        s1.collageName = "msu";
        s1.roll=45;
        s1.address="bang";

        boolean check = false;
        if (s1.collageName == "NIT") {
            check = true;
        }
        s1.getStudent(check);

        studentdetails s2 = new studentdetails();
        s2.name = "raj";
        s2.collageName = "NIT";
        s2.roll=75;
        s2.address="mumbau";

        boolean check1 = false;
        if (s2.collageName == "NIT") {
            check1 = true;
        }
        s2.getStudent(check1);


    }

}
