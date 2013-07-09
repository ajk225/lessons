/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 7/9/13
 * Time: 10:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class CarnivorousPlant extends Plant {

    public void trap()
    {
        System.out.println("I caught a fly");

    }

    public String getDiet()                // override Plant getDiet and adds "and flies"
    {
        return super.getDiet() + " and flies";

    }

}
