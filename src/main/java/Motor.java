public class Motor {

    private ICombustivel combustivel;
    private CombustivelAdapter persistencia;

    public Motor() {
        combustivel = new Gasolina();
        persistencia = new CombustivelAdapter(combustivel);
    }

    public void setCombustivel(float tanque) {
        combustivel.setTanque(tanque);
        persistencia.salvarTanque();
    }

    public float getCombustivel() {
        return persistencia.recuperarTanque();
    }

    public float getTanque() {
        return persistencia.getTanque();
    }

}
