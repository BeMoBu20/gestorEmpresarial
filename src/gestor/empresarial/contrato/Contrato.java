package gestor.empresarial.contrato;

final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    public Contrato(int id){

    }

    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }

    public int getNoContrato() {
        return noContrato;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getAnnio() {
        return annio;
    }
}
