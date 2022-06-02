public class Gasolina implements ICombustivel {

    private float litro;

    @Override
    public float getTanque() {
        return this.litro;
    }

    @Override
    public void setTanque(float litro) {
        this.litro = litro;
    }
}