import java.util.ArrayList;
import java.util.List;

public class CentroComputos {
    private List<BoletaElectoral> listaBoletas;

    public CentroComputos(){
        this.listaBoletas = new ArrayList<>();
    }
    public void agregarBoleta(BoletaElectoral boleta) {
        listaBoletas.add(boleta);
    }

    public void procesarReporteElectoral(int votosBasePorUrna){
        System.out.println("==================================================");
        System.out.println("       INFORME OFICIAL - CENTRO DE CÓMPUTOS       ");
        System.out.println("==================================================");
        int totalGeneralValidos = 0;

        for(BoletaElectoral boleta: listaBoletas){
            int votosValidos = boleta.contarVoto(votosBasePorUrna);
            totalGeneralValidos += votosValidos;

            System.out.println("• Candidato: " + boleta.getNombreCandidato() +
                    " | Partido: " + boleta.getPartidoPolitico() +
                    " | Categoría: " + boleta.getClass().getSimpleName() +
                    " | Válidos: " + votosValidos);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL GENERAL DE SUFRAGIOS VÁLIDOS: " + totalGeneralValidos);
        System.out.println("==================================================");
    }
}

