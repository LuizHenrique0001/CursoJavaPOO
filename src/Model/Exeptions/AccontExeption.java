package Model.Exeptions;

public class AccontExeption extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public AccontExeption(String msg){
        super(msg);
    }
}
