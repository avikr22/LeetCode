package com.problems;

public class MultiplyString43 {

	public static void main(String[] args) {
		System.out.println(multiply("2","450"));
	}
	
	
	public static String multiply(String num1, String num2) {

       int n = num1.length();
       int m = num2.length();
       int p[] = new int[n+m];
       for(int i = n-1; i>=0 ; i--) {
    	   for(int j=m - 1; j>=0; j--) {
    		   int d1 = num1.charAt(i) - '0';
    		   int d2 = num2.charAt(j) - '0';
    		   p[i+j+1] += d1*d2;
    	   }
       }
       int carry = 0 ;
       for(int i = n+ m - 1; i>=0 ;i--) {
    	   int temp = (p[i]+carry)%10;
    	   carry = (p[i]+carry)/10;  
    	   p[i] = temp;
       }
       
       StringBuilder sb = new StringBuilder();
       for (int num : p) sb.append(num);
       while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
       return sb.length() == 0 ? "0" : sb.toString();

    }

}
