package AEP20193Bim.Factory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmissorCreatorTest {

    Emissor emissor1;
    Emissor emissor2;
    Emissor emissor3;
    EmissorCreator creator;

    @BeforeEach
    void init() {
        creator = new EmissorCreator();
        emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia("emissor1 SMS ");

        emissor2 = creator.create(EmissorCreator.EMAIL);
        emissor2.envia("emissor2 Email ");

    }

    @Test
    void deveCriarEmissorPorSMS() {
        assertEquals("AEP20193Bim.Factory.EmissorSMS", emissor1.getClass().getName());
    }

    @Test
    void deveCriarEmissorPorEmail() {

        assertEquals("AEP20193Bim.Factory.EmissorEmail", emissor2.getClass().getName());

    }



}
