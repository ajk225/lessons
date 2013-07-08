/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 7/8/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class BadFriend extends Friend {

    public BadFriend(String name)
    {
        super(name);
    }

    public String giveBadNickName()
    {
        String nameFromFriend = super.giveNickName();

        return  nameFromFriend + " Pooh";

    }
}
