package AEP20193Bim.Observer;

public class DetectorDeMetalObserver {
    Boolean avisouASeguranca = false;


    public void avisarSeguranca(){
        this.avisouASeguranca = true;
        System.out.println("Segurança Avisada.");
    }

}
