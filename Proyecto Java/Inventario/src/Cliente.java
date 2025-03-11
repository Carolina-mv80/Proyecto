public class Cliente {
    private String CodCliente;
    //public  String CodCliente;
    private String NomCliente;
    private String ApellidoCliente;
    private String CedulaCliente;
    private String DireccionCliente;
    private String TelefonoCliente;

    
    //Creacion del costrucctor - público - sin parámetros
    public Cliente()
    {

    }

    //Creacion del constructor con parámetros - publico


    public Cliente(String CodCliente, String NomCliente, String ApellidoCliente, String CedulaCliente, String DireccionCliente, String TelefonoCliente)
        {
            this.CodCliente=CodCliente;
            this.NomCliente=NomCliente;
            this.ApellidoCliente=ApellidoCliente;
            this.CedulaCliente=CedulaCliente;
            this.DireccionCliente=DireccionCliente;
            this.TelefonoCliente=TelefonoCliente;
    }
    

    // Método getter: Muestra el codigo cliente 
    public String getCodCliente() {
        return CodCliente;
    }
    //Método setter Se carga el código cliente
    public void setCodCliente(String codCliente) {
        CodCliente = codCliente;
    }

    public String getNomCliente() {
        return NomCliente;
    }

    public void setNomCliente(String nomCliente) {
        NomCliente = nomCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        ApellidoCliente = apellidoCliente;
    }

    public String getCedulaCliente() {
        return CedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        CedulaCliente = cedulaCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        DireccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        TelefonoCliente = telefonoCliente;
    }
    
    
    

}
