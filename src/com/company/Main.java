package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Stack<Integer> stk= new Stack<Integer>();

        System.out.println("Enter the expression:");
        String exp= scanner.next();
        for(int i=0;i<exp.length();i++)
        {
            char ch = exp.charAt(i);
            if(ch=='('){
                stk.push(i);
            }
            else if(ch==')'){
                int p = stk.pop() + 1;
                System.out.println("')' at index" + (i+1) + " matches with '(' at index" + p);
            }
        }
        while (!stk.isEmpty()){
            System.out.println("'(' at index" + (stk.pop()+1) + " is unmatched");
        }
    }
}
