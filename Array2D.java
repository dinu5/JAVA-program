package com.dinu;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> ar=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<3;i++) {
			ar.add(new ArrayList<>());
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			ar.get(i).add(in.nextInt());
			}
		}
		
		System.out.println(ar);
	}

}
