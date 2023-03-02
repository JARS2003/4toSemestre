package utilerias.comunes;

public enum TipoLogaritmo {
    BASE10(1),
    NATURAL(2);
    private int logaritmo;
    private TipoLogaritmo(int logaritmo){
        this.logaritmo = logaritmo;
    }

    public int getLogaritmo() {
        return logaritmo;
    }
}