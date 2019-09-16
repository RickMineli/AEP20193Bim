package AEP20193Bim.Observer;

public class DetectorDeMetal {
    private DetectorDeMetalObserver observer;

    public void detectar(String algo){

        if (algo == "metal") {
            System.out.println("É metal.");
            observer.avisarSeguranca();
        }else
            System.out.println("Não é metal");
    }

    public DetectorDeMetal(DetectorDeMetalObserver observer) {
        this.observer = observer;
    }

    public DetectorDeMetalObserver getObserver() {
        return observer;
    }
}
