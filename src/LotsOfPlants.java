/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 7/9/13
 * Time: 10:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class LotsOfPlants {

    public static void  main(String args[])
    {

        Plant flower = new Plant();
        flower.setDiet("Sunlight and Water");
        System.out.println(flower.getDiet());

        //makes use of overriding and inheritance
        CarnivorousPlant venus = new CarnivorousPlant();
        venus.setDiet("Sunlight and Water");
        System.out.println(venus.getDiet());

        //makes use of polymorphism
        Plant plant = new CarnivorousPlant();
        plant.setDiet("Sunlight and water");
        System.out.println(plant.getDiet());


    }
}
