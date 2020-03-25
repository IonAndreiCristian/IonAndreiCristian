/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazin3;

/**
 *
 * @author A&A
 */
public class Product {
    public String name;
	public double price;
	public String exp_date;
		private int code;

	
	
	
public int getcode() {
		return code;
	}
public Product() {}
	
public Product(String Nume, double Pret, int Code, String Exp_date) {
		name = Nume;
		price = Pret;
		code = Code;
		exp_date = Exp_date;
		
	}
}
