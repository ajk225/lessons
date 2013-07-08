/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 7/8/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runjava {

    public static void main(String args[])
    {

        String name = "Adam";
        /*
        Person person = new Person();
        person.setName(name);

        //System.out.println(person.name);

        Friend f = new Friend(name);
        System.out.println(f.giveNickName());

        BadFriend bf = new BadFriend(f.getName());
        System.out.println(bf.giveNickName());
          */

        Person person = new BadFriend(name);
        BadFriend bf = (BadFriend) person;




    }
}
