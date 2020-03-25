/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazin3;

public class MainClass {

public static void main(String[] args) {
		 
	Employee Angazat = new Employee("Vanzator1",3);
	
	Product meat = new Product("Meat", 19.9, 843248, "21.05.2021");
        Product lapte = new Product("Lapte", 29.9, 843248, "24.05.2021");
	
	Angazat.AddProdus(meat,10);
        Angazat.AddProdus(lapte,10);
        Angazat.VerificareStock().Printare();
        Angazat.DellProdus(meat);
        Angazat.VerificareStock().Printare();
	
}
}
