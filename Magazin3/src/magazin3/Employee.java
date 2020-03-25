
package magazin3;

    
public class Employee {
	public String name;
	private int id;
	public Stock Stock = new Stock();
	

public Employee() {}
public String getName()
	{
		return name;
	}
	
public Employee(String Name,int _id) {
		name = Name;
                id=_id
	} 

public int getid() {
		return id;
	}
public Stock VerificareStock()
	{
		return Stock;
	}
	

public void AddProdus(Product Produs,int cantitate) {
	Stock.produsList.put(Produs, cantitate);
	
}
public void DellProdus(Product Produs) {
	Stock.produsList.remove(Produs);
}
public boolean CheckStock(Product _product, int _quantity)
	{
		for (Product key : Stock.productList.keySet())
		{
			if ((_product.getName().equalsIgnoreCase(key.getName())) && (Stock.productList.get(key) >= _quantity))
			{
				return true;
			}
		}
		return false;
	}

    void CheckStock(Product lapte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
