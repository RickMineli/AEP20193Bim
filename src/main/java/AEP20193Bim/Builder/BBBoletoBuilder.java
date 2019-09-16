package AEP20193Bim.Builder;

public class BBBoletoBuilder implements BoletoBuilder {

    private String sacado;
    private String cedente;
    private double valor;


    public void buildSacado(String sacado) {
        this.sacado = sacado;
    }

    public void buildCedente(String cedente) {
        this.cedente = cedente;
    }

    public void buildValor(double valor) {
        this.valor = valor;
    }

    public Boleto getBoleto () {
         return new BBBoleto ( sacado , cedente , valor) ;
    }
}
