package com.gpn;

public class App {
	public static void main(String[] args) {

		Empresa ep = new Empresa("99999999999");

		System.out.println("Qual � o cnpj: " + ep.getCnpj());

	}
}