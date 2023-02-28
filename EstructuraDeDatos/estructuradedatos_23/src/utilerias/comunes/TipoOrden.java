package utilerias.comunes;

public enum TipoOrden{
    INC(1),
    DEC(2);
    private int orden;
    private TipoOrden(int orden){
        this.orden=orden;
    }

    public int getOrden() {
        return orden;
    }


}
