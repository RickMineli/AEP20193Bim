package AEP20193Bim.Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    void deveCriarUmBBBoleto(){

        BoletoBuilder boletoBuilder = new BBBoletoBuilder();
        boletoBuilder.buildCedente("Laranja a fruta");
        boletoBuilder.buildSacado("Laranja a cor");
        boletoBuilder.buildValor(2000d);
        Boleto boleto = boletoBuilder.getBoleto();
        assertEquals("BBBoleto{sacado='Laranja a cor', cedente='Laranja a fruta', valor=2000.0}",boleto.toString());
    }
}
