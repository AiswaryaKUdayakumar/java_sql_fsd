package ustbatchno3.junit5testcases;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class Kthlargest {

	public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 5, 20, 30, 15, 25));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number  :   ");
        int n = sc.nextInt(); 
        //Optional<Integer> nthLargest = linkedList.stream().distinct().sorted().skip(n-1).findFirst(); 
        int nthLargest = linkedList.stream().distinct().sorted().skip(n-1).findFirst().orElseThrow(); 

        System.out.println( n + "th largest numberis "+nthLargest);
        }
	}

    
