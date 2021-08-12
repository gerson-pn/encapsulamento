package com.gpn;

public class App {
	public static void main(String[] args) {

		Empresa ep = new Empresa("99999999999","ABC LTDA","Seara");
		
		ep.setRazaoSocial("gpn ltda");

		System.out.println("Qual é o cnpj: " + ep.getRazaoSocial());

	}
}