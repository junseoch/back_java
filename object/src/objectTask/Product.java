package objectTask;

import java.util.Objects;

public class Product {
	
	private String name;
	private int price;
	private int stock;
	private String mou;
	private int id;
	
	public Product() {;}

	public Product(String name, int price, int stock, String mou, int id) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.mou = mou;
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getMou() {
		return mou;
	}

	public void setMou(String mou) {
		this.mou = mou;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + ", mou=" + mou + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// 재정의 할 때 id로만 비교하기 때문에 id만 체크해서 재정의 함
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

	
}
