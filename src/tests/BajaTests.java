package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tarjeta.TarjetaBaja;

public class BajaTests {

	@Test
	public void TarjetaTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.25);
		assertEquals(100.25, b1.obtenerSaldo(),0);
	}
	
	@Test
	public void cargaTarjetaTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.25);
		b1.cargar(0.25);
		assertEquals(100.50, b1.obtenerSaldo(),0);
	}
	
	@Test
	public void viajeColectivoTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.00);
		b1.pagarViajeEnColectivo();
		assertEquals(78.5, b1.obtenerSaldo(),0);
	}
	
	@Test
	public void viajeSubteTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.00);
		b1.pagarViajeEnSubte();
		assertEquals(80.5, b1.obtenerSaldo(),0);
	}
	
	@Test
	public void restaSaldoTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.00);
		b1.pagarViajeEnSubte();
		assertEquals(80.5, b1.obtenerSaldo(),0);
		b1.pagarViajeEnColectivo();
		assertEquals(59, b1.obtenerSaldo(),0);
	}
	
	@Test
	public void contadorViajesColectivoTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.00);
		b1.pagarViajeEnColectivo();
		assertEquals(1, b1.contarViajesEnColectivo());
		b1.pagarViajeEnColectivo();
		assertEquals(2, b1.contarViajesEnColectivo());
	}
	
	@Test
	public void contadorViajesSubteTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.00);
		b1.pagarViajeEnSubte();
		assertEquals(1, b1.contarViajesEnSubte());
		b1.pagarViajeEnSubte();
		assertEquals(2, b1.contarViajesEnSubte());
	}
	
	@Test
	public void contadorViajesTotalesTest() {
		TarjetaBaja b1 = new TarjetaBaja(100.00);
		b1.pagarViajeEnSubte();
		b1.pagarViajeEnColectivo();
		assertEquals(2, b1.contarViajes());
		b1.pagarViajeEnSubte();
		assertEquals(3, b1.contarViajes());
		b1.pagarViajeEnColectivo();
		System.out.println(b1.contarViajes());
	}
}
