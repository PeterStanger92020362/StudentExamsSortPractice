import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Arrays.sort;

public class StudentExamSortPractice {

    private static int parseCounter = 0;
    private static int swapCheckCounter = 0;

    /* Prints the array */
    void printArray(Student[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i].getName() + " ");
        System.out.println();
        if ( parseCounter > 0){
            System.out.println("Amount of array passes is: " + parseCounter);
            System.out.println("Amount of array swaps is: " + swapCheckCounter);
            parseCounter = 0;
            swapCheckCounter = 0;
        }
        System.out.println();
    }


    public void doOptimisedBubbleSort(Student[] arr, String criteria) {
        int lastSwap = arr.length - 1;


        for (int i = 1; i < arr.length; i++) {
            boolean is_sorted = true;
            int currentSwap = -1;


            for (int j = 0; j < lastSwap; j++) {
                parseCounter ++;

                if (arr[j].getChosenData(criteria) > arr[j + 1].getChosenData(criteria)) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    is_sorted = false;
                    currentSwap = j;

                    swapCheckCounter ++;
                }
            }

            if (is_sorted) {

                return;
            }
            lastSwap = currentSwap;

        }

    }



    public static void main(String[] args)
    {


        StudentExamSortPractice ob = new StudentExamSortPractice();
        Student arr[] = {
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

        /*

        // apply Bubble Sort
        System.out.println("The Student array sorted using Bubblesort");
        ob.doOptimisedBubbleSort(arr,"mark");
        ob.printArray(arr);

        */

        // apply built-in Java sort
        sort(arr);
        System.out.println("The Student array sorted using built in Java Sorts is");
        ob.printArray(arr);
        int failedCount =0;


        for (Student each : arr){
            if (each.getMark() < 50){
                failedCount++;
            }

        }
        Student[] failedArr = new Student[failedCount];

        for (int i = 0; i < failedArr.length ; i++) {
            failedArr[i] = arr[i];
        }


        System.out.println("The students that failed are: ");
        ob.printArray(failedArr);
        System.out.println("The failed students sorted by ID: ");
        //ob.doOptimisedBubbleSort(failedArr,"id");
        sort(failedArr);  // not working - only sorts by Marks still :|
        ob.printArray(failedArr);








    }
}


