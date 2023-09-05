package contabil;

public class IPI implements Imposto {
    float base, aliquota;
    
    @Override
    public String mostrarDescricao() {
        return "IPI";
    }

    @Override
    public float calcularImposto() {
        return (base * aliquota) / 100;
    }

    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }
}
