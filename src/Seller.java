public class Seller {

    public String modify(String manufacture) {
        manufacture = manufacture.replace('o', 'a');
        manufacture = manufacture.replace('O', 'A');

        if(manufacture.charAt(0) != 'n' && manufacture.charAt(0) != 'N') {
            manufacture = manufacture.toLowerCase();
        }
        return manufacture;
    }
}
