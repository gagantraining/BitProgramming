/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcollections;

import java.io.*;
class NationalityData{
    String nationality;
    int age;
}

public class EligibityChecking extends RuntimeException {

	EligibityChecking(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		int age = 0;
                
                NationalityData data[] = new NationalityData[3]; 
	
		for(int i=0;i<3;i++){
                    data[i] = new NationalityData();
                    System.out.println("Enter your nationality and age:");
                    try {
			data[i].nationality = br.readLine();
			data[i].age = Integer.parseInt(br.readLine());
                    } catch (IOException ioe) {
			System.out.println(ioe);
                    }
                }
		System.out.println("Eligibility is checking");
		for(int i=0;i<3;i++){
                    try {
                            CheckEligibilty(i,data[i].age, data[i].nationality);
                    } catch (EligibityChecking e) {
                            System.out.println(e);
                    }
                }
	}

	static void CheckEligibilty(int index,int studentage, String studentnationality) throws EligibityChecking

	{

		if (studentage >= 18 && studentnationality.equalsIgnoreCase("indian")) {
			System.out.println("Candidate "+(index+1)+" is eligible");
		} else {
			throw new EligibityChecking("Candidate "+(index+1)+" is not eligible");
		}
	}
}