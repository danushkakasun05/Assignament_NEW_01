package Assignment_01;
import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Vimukthi", 20, "Hilwood");
        Student std2 = new Student("Kasun", 21, "HighSchool");
        Student std3 = new Student("Danushka",20,"HighSchool");
        Student std4 = new Student("Ruwan",20,"Hilwood");
        Student std5 = new Student("Chamara",20,"HighSchool");
        Student std6 = new Student("Lakshan",20,"HighSchool");
        Student std7 = new Student("Ruwan",20,"Hilwood");
        Student std8 = new Student("Amara",20,"HighSchool");
        Student std9 = new Student("Kasun",21,"HighSchool");
        Student std10 = new Student("Chamara", 20, "HighSchool");
        //List <Student> Stdlst =new ArrayList<>();
        try{
        List Stdlst = List.of(new Student[]{std1, std2, std3, std4, std5, std6, std7, std8, std9, std10});
        DuplicateFinder dpfd = new DuplicateFinder(Stdlst);
        System.out.println("Duplicate List: ");
        for (int i = 0; i < dpfd.getDuplicates().size(); i++) {
            System.out.println(dpfd.getDuplicates().get(i).getName());
        }
        System.out.println("Distinct List: ");
        for (int i = 0; i < dpfd.distictList().size(); i++) {
            System.out.println(dpfd.distictList().get(i).getName());
        }
            System.out.println("name checker");
        dpfd.getStudentbyName("Heshan");

    }
        catch (CustomException e) {
            System.out.println("errror:"+e);

        }


    }
}
