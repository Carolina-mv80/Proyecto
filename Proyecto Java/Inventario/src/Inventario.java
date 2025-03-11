public class Inventario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Se crea el objeto con el constructor sin parámetros
        Cliente objCliente=new Cliente();

        //usar los set para cargar los datos
        objCliente.setCodCliente("C1");
        objCliente.setNomCliente("Juan");
        objCliente.setApellidoCliente("Lozano");
        objCliente.setCedulaCliente("456789");
        objCliente.setDireccionCliente("Calle 130 bis");
        objCliente.setTelefonoCliente("31054213584");

        //Devolver la información almacenada en los atributos
        System.out.println("El código del cliente es: "+objCliente.getCodCliente());
        System.out.println("El Nombre del cliente es: "+objCliente.getNomCliente());
        System.out.println("El Apellido del cliente es: "+objCliente.getApellidoCliente());
        System.out.println("La cédula del cliente es: "+objCliente.getCedulaCliente());
        System.out.println("La dirección del cliente es: "+objCliente.getDireccionCliente());
        System.out.println("El teléfono del cliente es: "+objCliente.getTelefonoCliente());


        //Constructor con parámetros
        Cliente objCliente2=new Cliente("C2","Alejandro","Pérez","1234","Dig 23","2013654");
    
        //Devolver la información almacenada en los atributos
        System.out.println("El código del cliente es: "+objCliente2.getCodCliente());
        System.out.println("El Nombre del cliente es: "+objCliente2.getNomCliente());
        System.out.println("El Apellido del cliente es: "+objCliente2.getApellidoCliente());
        System.out.println("La cédula del cliente es: "+objCliente2.getCedulaCliente());
        System.out.println("La dirección del cliente es: "+objCliente2.getDireccionCliente());
        System.out.println("El teléfono del cliente es: "+objCliente2.getTelefonoCliente());
    }
}
