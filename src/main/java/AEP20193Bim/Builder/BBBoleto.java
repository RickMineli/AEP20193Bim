package AEP20193Bim.Builder;

public class BBBoleto implements Boleto {
    private String sacado;
    private String cedente;
    private double valor;

    public BBBoleto(String sacado, String cedente, double valor) {
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
    }

    public String getSacado() {
        return sacado;
    }

    public String getCedente() {
        return cedente;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "BBBoleto{" +
                "sacado='" + sacado + '\'' +
                ", cedente='" + cedente + '\'' +
                ", valor=" + valor +
                '}';
    }
}
