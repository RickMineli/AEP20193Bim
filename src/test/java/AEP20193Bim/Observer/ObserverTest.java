package AEP20193Bim.Observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTest {

    @Test
    void deveAvisarAsegurana(){
        DetectorDeMetal detectorDeMetal = new DetectorDeMetal(new DetectorDeMetalObserver());
        detectorDeMetal.detectar("metal");
        assertEquals(true,detectorDeMetal.getObserver().avisouASeguranca);
    }
}
