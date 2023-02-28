package utilerias.comunes;

public enum TipoColumna {
    DER(1),
    IZQ(2);
    private int columna;
    private TipoColumna(int columna){
        this.columna = columna;
    }

    public int getColumna() {
        return columna;
    }
}
