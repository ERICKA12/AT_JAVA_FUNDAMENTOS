package com.ericka.appIndicadoresGestao.modelo.testes;

import com.ericka.appIndicadoresGestao.modelo.dominio.Cliente;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ericka", "Supervisora", "ericka.oliveira@fas-amazonas.org");
		System.out.println(c1);
	}

}
