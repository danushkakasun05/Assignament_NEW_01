package Assignment_01;
import java.util.*;
import java.sql.SQLOutput;

public class DuplicateFinder {
    private List<Student> studentsList;

    public DuplicateFinder(List<Student> list1) {
        this.studentsList = list1;

    }

    public List<Student> getDuplicates() {
        List<Student> duplicates = new ArrayList<>();
        for (int i = 0; i < this.studentsList.size() - 1; i++) {
            for (int j = i + 1; j < this.studentsList.size(); j++) {
                if (this.studentsList.get(i).getName().equals(studentsList.get(j).getName())) {
                    if (this.studentsList.get(i).getAge() == this.studentsList.get(j).getAge()) {
                        if (this.studentsList.get(i).getSchool().equals(this.studentsList.get(j).getSchool())) {
                            duplicates.add(this.studentsList.get(i));
                            //if (this.studentsList.get(i).equals((this.studentsList.get(j)))) {
                            //duplicates.add(this.studentsList.get(i));

                        }
                    }
                }

            }

        }
        return duplicates;
    }

    public List<Student> distictList() {
        List<Student> std = new ArrayList<>(this.studentsList);
        for (int k = 0; k < std.size(); k++) {
            for (int l = k + 1; l < std.size(); l++) {
                if (std.get(k).getName().equals(std.get(l).getName())) {
                    std.remove(std.get(l));
                }
            }

        }
        return std;
    }

    public void getStudentbyName(String name) throws CustomException {
        for (int i = 0; i <this.studentsList.size(); i++){
            if(this.studentsList.get(i).getName().equals(name)){
                System.out.println(this.studentsList.get(i).getName());
                System.out.println(this.studentsList.get(i).getAge());
                System.out.println(this.studentsList.get(i).getSchool());
                break;
            }else if(i==this.studentsList.size()-1){
                throw new CustomException("No such name");


            }else{

            }
        }

    }
}





