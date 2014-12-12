
/**
 * Representa a una persona que puede comer alimentos.
 */
public class Usuario
{
    // Almacena el nombre de la persona.
    private String nombrePersona;
    // Almacena los gramos de proteínas ingeridos.
    private float gramosProteinasIngeridos;
    // Almacena los gramos de carbohidratos ingeridos.
    private float gramosCarbohidratosIngeridos;
    // Almacena los gramos de grasas ingeridos.
    private float gramosGrasasIngeridos;
    // Almacena los gramos de calorías ingeridos.
    private float caloriasIngeridas;

    /**
     * Constructor de objetos de la clase Usuario.
     */
    public Usuario(String nombrePersona)
    {
        this.nombrePersona = nombrePersona;
    }

    /**
     * Hace que la persona coma algún/os alimento/s.
     */
    public void comer(Alimento comida)
    {
        gramosProteinasIngeridos = gramosProteinasIngeridos + comida.getGramosProteinas();
        gramosCarbohidratosIngeridos = gramosCarbohidratosIngeridos + comida.getGramosCarbohidratos();
        gramosGrasasIngeridos = gramosGrasasIngeridos + comida.getGramosGrasas();
        caloriasIngeridas = caloriasIngeridas + comida.getCalorias();
    }
    
    /**
     *  Muestra el estado actual de la persona.
     */
    public void muestraEstado()
    {
        float gramosTotales = gramosProteinasIngeridos + gramosCarbohidratosIngeridos +
        gramosGrasasIngeridos;
        if (gramosTotales != 0) {
           System.out.println("Nombre : "+ nombrePersona);
           System.out.println("Gramos de proteínas ingeridos: "+ gramosProteinasIngeridos + 
           "("+(gramosProteinasIngeridos*100)/gramosTotales +"%)");
           System.out.println("Gramoos de carbohidratos ingeridos: "+ gramosCarbohidratosIngeridos + 
           "("+(gramosCarbohidratosIngeridos*100)/gramosTotales +"%)");
           System.out.println("Gramos de grasas ingeridos: "+ gramosGrasasIngeridos + 
           "("+(gramosGrasasIngeridos*100)/gramosTotales +"%)");
           System.out.println("Calorías ingeridas: " + caloriasIngeridas);
       }
       else {
           System.out.println("Nombre : "+ nombrePersona);
           System.out.println("Gramos de proteínas ingeridos: "+ gramosProteinasIngeridos);
           System.out.println("Gramoos de carbohidratos ingeridos: "+ gramosCarbohidratosIngeridos);
           System.out.println("Gramos de grasas ingeridos: "+ gramosGrasasIngeridos);
           System.out.println("Calorías ingeridas: " + caloriasIngeridas);
        }
    }
    
    /**
     *  Devuelve las calorías ingeridas por la persona.
     */
    public float getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }
    
    /**
     *  Devuelve el nombre de la persona.
     */
    public String getNombrePersona()
    {
        return nombrePersona;
    }
    
    /**
     * Compara usuarios para ver cuál ha ingerido más calorías.
     */
    public void compararUsuarios(Usuario persona)
    {
        if (caloriasIngeridas > persona.getCaloriasIngeridas()) {
            System.out.println(nombrePersona +" ha consumido más calorías que "+ persona.getNombrePersona());
        }
        else {
            System.out.println(nombrePersona +" ha consumido menos calorías que "+ persona.getNombrePersona());
        }
    }
    
    /**
     * Muestra cuál es el alimento más calórico ingerido por el usuario.
     */
    public void alimentoMasCalorico(Alimento comida)
    {
        System.out.println("Alimento más calórico ingerido por el usuario: " + comida.getCalorias());
    }
    
    /**
     *  Muestra los datos del alimento ingerido por el usuario.
     */
    public void datosAlimentoIngerido(Alimento comida)
    {
        comida.muestraDatos();
    }
}
