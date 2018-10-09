package test.resources;


import java.util.Scanner;

public class WeirdNumber{
    int Number;
	
    public String IsItWeird(){
        if(Number%2 == 1 || 6<=Number && Number<=20 || Number < 0){
            String result = "Weird";
            return result;
        }
        else
        {
            String result = "Not Weird";
            return result;
        }
    }
    
    public void setNumber(int i) {
    	Number = i;
    }
    
    public int getNumber() {
    	return Number;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        WeirdNumber wn = new WeirdNumber();
        while(true){
        int i = sc.nextInt();
        wn.setNumber(i);
        System.out.println(wn.getNumber());
        System.out.println(wn.IsItWeird());
        }
       }
}
