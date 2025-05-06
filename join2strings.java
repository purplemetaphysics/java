public class join2strings{
    public static void main(String[] args){
        String firstname = "Tony";
        String secondname = "stark";
        // concatination means addition of 2 or more then 2 string.

        String fullname = firstname + " " + secondname;
        System.out.println(fullname);

        // .length() is used to find the length of the string.

        System.out.println(fullname.length());

        //  .charAt() function use to read each and every index of the string.

        for(int i = 0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}