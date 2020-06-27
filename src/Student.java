public class Student implements Comparable{

    private String name;
    private int ID;
    private int mark;

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getMark() {
        return mark;
    }



    @Override
    public int compareTo(Object o) {
        Student e = (Student) o;
        return getMark() - e.getMark();
        //return getName().compareTo(e.getName());  //sort by Student name
        //return this.getRating() - e.getRating();  // Sort by Rating
    }


    public Student(String Studentname, int StudentID, int Studentmark) {
        this.name = Studentname;
        this.ID = StudentID;
        this.mark = Studentmark;
    }
}