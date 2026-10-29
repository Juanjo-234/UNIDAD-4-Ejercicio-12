//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CentroComputos centro = new CentroComputos();


    BoletaElectoral b1 = new BoletaIntendente("Carlos Gómez", "Frente Cívico");
    BoletaElectoral b2 = new BoletaConcejales("María Pérez", "Unidad Ciudadana", 5);
    BoletaElectoral b3 = new BoletaConcejales("Lucía Fernández", "Alianza Verde", 1);

    centro.agregarBoleta(b1);
    centro.agregarBoleta(b2);
    centro.agregarBoleta(b3);

    centro.procesarReporteElectoral(1000);
}
