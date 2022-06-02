public class CombustivelAdapter extends GasNatural {

    private ICombustivel combustivel;

    public CombustivelAdapter(ICombustivel gasolina) {
        this.combustivel = gasolina;
    }

    public float recuperarTanque() {

        float tanque = this.getTanque() * 1000;
        combustivel.setTanque(tanque);

        return combustivel.getTanque();
    }

    public void salvarTanque() {
        float tanque = combustivel.getTanque() / 1000;
        this.setTanque(tanque);
    }
}