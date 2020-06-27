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

    public int getChosenData(String criteria){
        if (criteria.toLowerCase().equals("id")){
            return ID;
        }
        else if (criteria.toLowerCase().equals("mark")){
            return mark;
        }
        else {
            System.out.println("Bad data type specified");
            return 0;
        }
    }


    @Override
    public int compareTo(Object o) {
        Student e = (Student) o;

        return getMark() - e.getMark();
        //return getName().compareTo(e.getName());  //sort by Student name
        //return getID() - e.getID();
    }

    public int sortByMarks(Object o) {
        Student e = (Student) o;
        return getMark() - e.getMark();
    }


    public Student(String Studentname, int StudentID, int Studentmark) {
        this.name = Studentname;
        this.ID = StudentID;
        this.mark = Studentmark;
    }
}