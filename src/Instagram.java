

public class Instagram {

    /*
    Instagram
        Name
        Address
        Followers
        ID
        Photos
        Videos
        Status

        Follower
            Profile
                Address
                    Street


    */

    String name;
    String address;
//    static Address myAddress = new Address();
    static int id;
//    Photos photos;

    Instagram(){

    }

    Instagram(String name, String address, int id){
        this.name = name;
        this.address = address;
        this.id = id;
//        this.photos = photo;
    }

    Instagram(String name,  int id, String address){
        this.name = name;
        this.address = address;
        this.id = id;
    }


    void changeName(String name){
        this.name = name;
    }

    /**
     * Number of parameters
     * Type of parameters
     * Order of parameters
     *
     * Return type doesn't matter
     */

    void add(int num1){
        System.out.println(num1);
    }


    void add(int num1, int num2){
        System.out.println(num1);
    }

    void add(int num1, float num2){
        System.out.println(num1);
    }

    void add(float num1, int num2){
        System.out.println(num1);
    }


    public static void main(String[] args) {

//        Photos photos1 = new Photos("nature", "selfie", "India", "9 AM");

        Instagram insta = new Instagram("New name", 777, "Ban");
        System.out.println(insta.name);



    }
}

