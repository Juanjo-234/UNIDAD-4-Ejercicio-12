public class BoletaConcejales extends BoletaElectoral{
    private int cantidadTachas;

    public BoletaConcejales(String nombreCandidato, String partidoPolitico, int cantidadTachas){
        super(nombreCandidato, partidoPolitico);
        this.cantidadTachas = cantidadTachas;
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        if (cantidadTachas > 3) {
            System.out.println("   [Alerta] Boleta de Concejales de " + nombreCandidato + " excede tachas permitidas (" + cantidadTachas + "). Reducción aplicada.");
            return cantidadEmitida / 2;
        }
        return cantidadEmitida;
    }
}
