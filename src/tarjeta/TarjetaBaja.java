package tarjeta;

public class TarjetaBaja {
	private double saldo;
	private int viajeEnSubte = 0;
	private int viajeEnColectivo = 0;

	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public double obtenerSaldo() {
		return saldo;
	}

	private void esValido(double monto) {
		if (monto <= 0) {
			throw new Error("Monto inválido");
		}
	}

	public void cargar(double monto) {
		esValido(monto);
		this.saldo += monto;
	}

	public void pagarViajeEnColectivo() {
		double viajeCole = 21.50;
		if (viajeCole > this.saldo) {
			throw new Error("Saldo insuficiente");
		} else {
			this.saldo -= viajeCole;
			viajeEnColectivo++;
		}

	}

	public void pagarViajeEnSubte() {
		double viajeSubte = 19.50;
		if (viajeSubte > this.saldo) {
			throw new Error("Saldo insuficiente");
		} else {
			this.saldo -= viajeSubte;
			viajeEnSubte++;
		}

	}

	public int contarViajes() {
		return viajeEnSubte + viajeEnColectivo;
	}

	public int contarViajesEnColectivo() {
		return viajeEnColectivo;
	}

	public int contarViajesEnSubte() {
		return viajeEnSubte;
	}

}
