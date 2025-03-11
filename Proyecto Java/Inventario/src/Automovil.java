public class Automovil {
    private String Matricula;
    private int Modelo;
    private String Marca;
    private String Color;

    // Constructor sin parámetros
    public Automovil()
    {

    }

    //Constructor con parámetros
    public Automovil(String Matricula, int Modelo,String Marca, String Color)
    {
        this.Matricula=Matricula;
        this.Modelo=Modelo;
        this.Marca=Marca;
        this.Color=Color;

    }
}
