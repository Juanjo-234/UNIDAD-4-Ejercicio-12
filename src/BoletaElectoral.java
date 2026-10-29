public abstract class BoletaElectoral {
    protected String nombreCandidato;
    protected String partidoPolitico;

    public BoletaElectoral(String nombreCandidato, String partidoPolitico){
        this.nombreCandidato = nombreCandidato;
        this.partidoPolitico = partidoPolitico;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public abstract int contarVoto(int cantidadEmitida);
}
