public class BoletaIntendente extends BoletaElectoral{
    public BoletaIntendente(String nombreCandidato, String partidoPolitico){
        super(nombreCandidato, partidoPolitico);
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        return cantidadEmitida;
    }
}
