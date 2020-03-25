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
import java.util.*;

public class Stock {
	
	public Map<Product, Integer> produsList = new HashMap<Product, Integer>();
	
public Stock() {}


public void Printare() {
	System.out.println("Pe stock \Dupa stergere:");
	for (Product key : produsList.keySet()) {
		System.out.println(key.name + " : " + produsList.get(key)+" bucati");
	}
}
}
