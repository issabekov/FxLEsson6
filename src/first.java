//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class first {
//    public static void main(String [] args){
//        //PROBLEMS Task4 - Abiturent
//        ArrayList<Abiturent> abiturentArrayList = new ArrayList<>();
//        Abiturent abiturent1 = new Abiturent(1, "Sovetaly", "Doni", "Armanuly",  "Taraz", "87478647080", 91);
//        Abiturent abiturent2 = new Abiturent(2, "Smagul", "Nurik", "Zhannaruly",  "Taraz", "87079091236", 92);
//        Abiturent abiturent3 = new Abiturent(3, "Berikkazy", "Madi", "Mukhitzhanuly",  "Taraz", "87024587891", 93);
//        Abiturent abiturent4 = new Abiturent(4, "Kenes", "Dias", "Abdyseituuly",  "Taraz", "87056428404", 95);
//        Abiturent abiturent5 = new Abiturent(5, "Aldabay", "Zhomart", "Zhanalykuly",  "Taraz", "87056408505", 89);
//
//        abiturentArrayList.add(abiturent1);
//        abiturentArrayList.add(abiturent2);
//        abiturentArrayList.add(abiturent3);
//        abiturentArrayList.add(abiturent4);
//        abiturentArrayList.add(abiturent5);
//
//        //didn't pass
//        for (Abiturent s : abiturentArrayList){
//            if (s.getGrade() < 70){
//                System.out.println(s.getName() + " " + s.surname + " doesn't have enough grades to 70: " + s.getGrade());
//            }
//        }
//
//        //passed
//        for (Abiturent s : abiturentArrayList){
//            if (s.getGrade() >= 70){
//                System.out.println(s.getName() + " " + s.surname + " has more grades than 70: " + s.getGrade());
//            }
//        }
//
//        //TOP 3 highest grades
//        Collections.sort(abiturentArrayList, new SortByGrade());
//        System.out.println("students with TOP 3 highest scores: ");
//        for ( int i = 0; i < 3; i++){
//            System.out.println(abiturentArrayList.get(i));
//        }
//    }
//}
//
////task4 - Abiturent
//class Abiturent{
//    int id;
//    String surname;
//    String name;
//    String middleName;
//    String adress;
//    String phoneNum;
//    int grade;
//
//    public Abiturent(int id, String surname, String name, String middleName, String adress,
//                     String phoneNum, int grade) {
//        this.id = id;
//        this.surname = surname;
//        this.name = name;
//        this.middleName = middleName;
//        this.adress = adress;
//        this.phoneNum = phoneNum;
//        this.grade = grade;
//    }
//
//    @Override
//    public String toString() {
//        return "Abiturent{" +
//                "id=" + id +
//                ", surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", middleName='" + middleName + '\'' +
//                ", adress='" + adress + '\'' +
//                ", phoneNum='" + phoneNum + '\'' +
//                ", grade=" + grade +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName = middleName;
//    }
//
//    public String getAdress() {
//        return adress;
//    }
//
//    public void setAdress(String adress) {
//        this.adress = adress;
//    }
//
//    public String getPhoneNum() {
//        return phoneNum;
//    }
//
//    public void setPhoneNum(String phoneNum) {
//        this.phoneNum = phoneNum;
//    }
//
//    public int getGrade() {
//        return grade;
//    }
//
//    public void setGrade(int grade) {
//        this.grade = grade;
//    }
//}
//
////Sorting by grades - abiturent
//class SortByGrade implements Comparator<Abiturent> {
//    @Override
//    public int compare(Abiturent o1, Abiturent o2) {
//        if (o1.getGrade() == o2.getGrade())
//            return 0;
//        if (o1.getGrade() > o2.getGrade())
//            return -1;
//        else
//            return 1;
//    }
//}