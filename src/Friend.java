/**
 * Created with IntelliJ IDEA.
 * User: andrew
 * Date: 7/8/13
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Friend extends Person {

    public Friend(String name) {
        super.setName(name);
    }

    public String giveNickName() {
        return this.getName() + " Teddy Bear";

    }


}
