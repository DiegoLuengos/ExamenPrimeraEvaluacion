
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
        System.out.println("Nombre : "+ nombrePersona);
        System.out.println("Gramos de proteínas ingeridos: "+ gramosProteinasIngeridos);
        System.out.println("Gramoos de carbohidratos ingeridos: "+ gramosCarbohidratosIngeridos);
        System.out.println("Gramos de grasas ingeridos: "+ gramosGrasasIngeridos);
        System.out.println("Calorías ingeridas: " + caloriasIngeridas);
    }
}
