package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	//Task 1
		ArrayList<Integer> numberList = new ArrayList<Integer>(10);
		
		public ArrayListAssignment() {
			numberList.add(1);
			numberList.add(2);
			numberList.add(3);
			numberList.add(4);
			numberList.add(5);
			numberList.add(6);
			numberList.add(7);
			numberList.add(8);
			numberList.add(9);
			numberList.add(10);
			
		}
		//Task 2
		public void displayArrayList(ArrayList<Integer> list) {
			for(Integer num : list) {
				System.out.print(num+ " ");
			}
		}
		//Task 3
		public void addElement(int element) {
			numberList.add(element);
			
		}
		//Task 4
		public void removeElement(int element) {
			// numberList.remove(element);  It will remove the index's value 
			numberList.remove(Integer.valueOf(element)); // it will remove the value not the index
			
		}
		//Task 5
		public void reverseArrayList() {
			 Collections.reverse(numberList); 
		}
		
		//Task 6
		public int findSum(ArrayList<Integer> mylist) {
			int sum =0;
			for(Integer num : mylist) {
				sum = sum + num;
			}
			return sum;
		}
		//Task 7
		public int findMaximum(ArrayList<Integer> mylist) {
			if(mylist.isEmpty()) {
				return -1;
			}
			int max = mylist.get(0);  // setting max value as index zero(0) for now
			for(Integer num  :mylist) {
				if(num > max) {
					max = num;
				}
				
			}
			return max;
		}
		
		public int findMinimum(ArrayList<Integer> mylist) {
			if(mylist.isEmpty()) {
				return -1;
			}
			int min = mylist.get(0);  // setting max value as index zero(0) for now
			for(Integer num  :mylist) {
				if(num < min) {
					min = num;
				}
				
			}
			return min;
		}
		
		// Task 8
		 public void sortArrayList() {
    	Collections.sort(numberList);
		 }
		 
		 //  Task 10:
	  public int findElement(int value)
    {
    	return numberList.indexOf(value);
    }
		 
		 //Task 11
	public void removeDuplicates() {
		ArrayList<Integer> uniqelemets = new ArrayList<>();
		for(Integer num : numberList) {
			if(!uniqelemets.contains(num)) {
				uniqelemets.add(num);
			}
		}
		numberList = uniqelemets;
	}
	
	//Task 12  
	public List<Integer> getSublist(int start, int end){
		return numberList.subList(start, end);
	}
	
	
	//task 13
	public boolean isEmptyArrayList() {
		if(numberList.isEmpty()) {
		return  true;
	}else {
		return false;
	}
}
	//Task 14 
	public void replaceElement(int oldnum,int newnum) {
		Collections.replaceAll(numberList, oldnum, newnum);
	}
	
	//Task 15
	   public int countOccurrences(int value)
    {
    	int counter = 0;
    	for(Integer num : numberList)
    	{
    		if(num == value)
    		{
    			counter++;
    		}
    	}
    	return counter;
    }
	
	//Task16
	public void clearArrayList() {
		numberList.clear();
	}
	
    
    // Task 17
    public int getArrayListSize()
    {
    	return numberList.size();
    }
    
    // Task 18
    public ArrayList<Integer> copyArrayList()
    {
    	ArrayList<Integer> cloneArrList =(ArrayList<Integer>) numberList.clone();
        return cloneArrList;
    }
    
    // Task 19
    public double findAverage(){
    	int sum = findSum(numberList);
    	if(sum > 0){
    		double avg =(double)sum/numberList.size();
    		return avg;
    	}return 0;
    }
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayListAssignment example = new ArrayListAssignment();
			System.out.println(" ---------Task 2---------");
			example.displayArrayList(example.numberList);
			System.out.println("");
			System.out.println(" -------Task 3-----------");
			
			example.addElement(9);
			example.displayArrayList(example.numberList);
			System.out.println("");
			System.out.println("--------Task 4----------");
			
			example.removeElement(4);
			example.displayArrayList(example.numberList);
			System.out.println("");
			System.out.println(" -------Task 5-----------");
			
			example.reverseArrayList();
			example.displayArrayList(example.numberList);
			System.out.println("");
			System.out.println(" --------Task 6---------- ");
			
			int sum = example.findSum(example.numberList);
			System.out.println(sum);
			System.out.println("");
			System.out.println(" --------Task 7---------- ");
			
			int max = example.findMaximum(example.numberList);
			System.out.println(max);
			System.out.println("");
			System.out.println(" -------Task 7-----------");
			
			int min = example.findMinimum(example.numberList);
			System.out.println(min);
			System.out.println("");
			System.out.println(" -------Task 8-----------");
			
			example.sortArrayList();
			System.out.println("sorting arrays: " +example.numberList);
			System.out.println("");
			System.out.println(" --------Task 10----------");

			
		   System.out.println("Find  Element  : " + example.findElement(8) );
			System.out.println("");
			System.out.println(" -----Task 11-------------");
			
			example.removeDuplicates();
			System.out.println("Removing duplicates: " +example.numberList);
			System.out.println("");
			System.out.println(" ------Task 12------------");
			
			//example.getSublist(2, 5);
			System.out.println(" sublist are: "+example.numberList.subList(2, 5));
			System.out.println("");
			System.out.println(" ------Task 13------------");
			
			System.out.println(example.isEmptyArrayList());
			System.out.println("");
			System.out.println(" --------Task 14----------");
			
			example.replaceElement(1, 15);
			System.out.println(" replacing elements "+example.numberList);
			System.out.println("");
			System.out.println(" --------Task 15----------");
			
			
			System.out.println(" count occurance "+example.countOccurrences(15));
			System.out.println("");
			System.out.println(" ------Task 16------------");
			
//			example.clearArrayList();
//		    example.displayArrayList(example.numberList);
		    System.out.println("");
			System.out.println(" ------Task 17------------");
			
			System.out.println("Array size : " + example.getArrayListSize() );
			System.out.println("");
			System.out.println(" ------Task 18------------");
			
			System.out.println("Copy Array : " + example.copyArrayList());
			System.out.println("");
			System.out.println(" ------Task 19------------");
			
		    System.out.println("Average  : " + example.findAverage() );
		    
			
			

		}

	}