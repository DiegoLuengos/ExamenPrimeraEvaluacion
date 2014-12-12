
/**
 * Representa a los diferentes alimentos que se pueden comer.
 */
public class Alimento
{
    // Almacena el nombre del alimento.
    private String nombre;
    // Almacena los gramos de proteínas por cada 100 gramos de alimento.
    private float gramosProteinas;
    // Almacena los gramos de carbohidratos por cada 100 gramos de alimento.
    private float gramosCarbohidratos;
    // Almacena los gramos de grasas por cada 100 gramos de alimento.
    private float gramosGrasas;
    // Almacena las calorías que tiene el alimento por cada 100 gramos.
    private float calorias;

    /**
     * Constructor de objetos de la clase Alimento.
     */
    public Alimento(String nombre, float gramosProteinas, float gramosCarbohidratos, float gramosGrasas)
    {
        this.nombre = nombre;
        this.gramosProteinas = gramosProteinas;
        this.gramosCarbohidratos = gramosCarbohidratos;
        this.gramosGrasas = gramosGrasas;
        this.calorias = (gramosProteinas*4) + (gramosCarbohidratos*4) + (gramosGrasas*9);
    }
    
    /**
     *  Devuelve el nombre, gramos de proteinas, de carbohidratos, de grasas, de calorías de cada
     *  100 gramos de ese alimento y también devuelve el macronutriente mayoritario.
     */
    public void muestraDatos()
    {
        System.out.println("Nombre: "+ nombre);
        System.out.println("Gramos de proteinas por cada 100 gramos de alimento: "+ gramosProteinas);
        System.out.println("Gramos de proteinas por cada 100 gramos de alimento: "+ gramosCarbohidratos);
        System.out.println("Gramos de proteinas por cada 100 gramos de alimento: "+ gramosGrasas);
        System.out.println("Calorías por cada 100 gramos de alimento: "+ calorias);
    }
    
    /**
     * Devuelve los gramos de proteínas que tiene el alimento.
     */
    public float getGramosProteinas()
    {
        return gramosProteinas;
    }
    
     /**
     * Devuelve los gramos de carbohidratos que tiene el alimento.
     */
    public float getGramosCarbohidratos()
    {
        return gramosCarbohidratos;
    }
    
     /**
     * Devuelve los gramos de grasas que tiene el alimento.
     */
    public float getGramosGrasas()
    {
        return gramosGrasas;
    }
    
     /**
     * Devuelve las calorias que tiene el alimento.
     */
    public float getCalorias()
    {
        return calorias;
    }

}
