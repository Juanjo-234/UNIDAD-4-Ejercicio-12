public class BoletaLegisladores extends BoletaElectoral{
    private boolean votoPreferencialValido;
    public BoletaLegisladores(String nombreCandidato, String partidoPolitico, boolean votoPreferencialValido){
        super(nombreCandidato, partidoPolitico);
        this.votoPreferencialValido = votoPreferencialValido;
    }

    @Override
    public int contarVoto(int cantidadEmitida) {
        if (!votoPreferencialValido) {
            System.out.println("   [Alerta] Boleta de Legisladores de " + nombreCandidato + " tiene voto preferencial inválido. Descuento del 20%.");
            return (int) (cantidadEmitida * 0.80);
        }
        return cantidadEmitida;
    }
}
