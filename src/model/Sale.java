package model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sale {
	private String client;
	private Product[] products;
	private Amount amount;
    private LocalDateTime dateTime; // Nuevo campo para la fecha y hora de la venta
	
	public Sale(String client, Product[] products, Amount amount) {
		super();
		this.client = client;
		this.products = products;
		this.amount = amount;
        this.dateTime = LocalDateTime.now(); // Obtiene la fecha y hora actual
	}
	
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

    // Método para obtener la fecha y hora de la venta en formato dd-MM-yyyy HH:mm:ss
    // Getter para obtener la fecha y hora en formato deseado
    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }
    
    // Getter y setter para la fecha y hora de la venta
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
	
	@Override
	public String toString() {
		return "Sale [client=" + client + ", products=" + Arrays.toString(products) + ", amount=" + amount + "]";
	}

	
	
	

}
