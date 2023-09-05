package contabil;

public class PIS implements Imposto {
    float debito, credito,
    aliquota = 1.65f;
    
    @Override
    public String mostrarDescricao() {
        return "PIS";
    }

    @Override
    public float calcularImposto() {
         return ((debito - credito) * aliquota) / 100;
    }
    
    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(int aliquota) {
        this.aliquota = aliquota;
    }
}
