package AEP20193Bim.Builder;

public interface BoletoBuilder {
    void buildSacado(String sacado);

    void buildCedente(String cedente);

    void buildValor(double valor);

    Boleto getBoleto ();
}
