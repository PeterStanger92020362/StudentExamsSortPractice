
import static java.util.Arrays.sort;


public class StudentExamSortPractice {

    /* Prints the array */
    void printArray(Student[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getName() + " ");
        System.out.println();
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args)
    {
        StudentExamSortPractice ob = new StudentExamSortPractice();
        Student[] arr = {
                new Student("Kelly",12349,49),
                new Student("Beyonce",76634,23),
                new Student("Michelle",34535,16),
                new Student("Mick",94523,66),
                new Student("Keith",22334,87),
                new Student("Ronnie",64346,96),
                new Student("Charlie",87574,42),
                new Student("Bill",19453,66),
                new Student("Liam",45734,78),
                new Student("Zayn",59020,68),
                new Student("Harry",59345,50),
                new Student("Niall",63259,34),
                new Student("Louis",23456,43),
        };

        System.out.println("The Unsorted array of students is");
        ob.printArray(arr);

        // apply sort
        sort(arr);
        System.out.println("The Student array sorted by name is");
        ob.printArray(arr);


    }
}


