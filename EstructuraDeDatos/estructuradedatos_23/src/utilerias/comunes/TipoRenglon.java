package utilerias.comunes;

public enum TipoRenglon {
    ARR(1),
    ABA(2);
    private int renglon;
    private TipoRenglon(int renglon){
        this.renglon = renglon;
    }

    public int getRenglon() {
        return renglon;
    }
}
