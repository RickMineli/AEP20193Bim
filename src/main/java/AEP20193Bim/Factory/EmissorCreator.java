package AEP20193Bim.Factory;

public class EmissorCreator {
    public static final int SMS = 0;
    public static final int EMAIL = 1;

    public Emissor create(int tipoDeEmissor) {
        if (tipoDeEmissor == EmissorCreator.SMS)
            return new EmissorSMS();
        else if (tipoDeEmissor == EmissorCreator.EMAIL)
            return new EmissorEmail();
        return null;
    }
}
