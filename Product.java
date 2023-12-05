package com.hyp;

public class Product {
	private int product_id;
    private String product_name;
    private double product_cost;
    private String made_in;
    private String company;

    public Product(int product_id, String product_name, double product_cost, String made_in, String company) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.made_in = made_in;
        this.company = company;
    }
    public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(double product_cost) {
		this.product_cost = product_cost;
	}

	public String getMade_in() {
		return made_in;
	}

	public void setMade_in(String made_in) {
		this.made_in = made_in;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	

    // Getters and setters (generated or manually implemented)
}
