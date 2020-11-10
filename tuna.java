public class tuna {
    private String name;

    public tuna(String n) {
        name = n;
    }

    public void set_name(String n) {
        name = n;
    }

    public String get_name() {
        return name;
    }

    public void saying() {
        System.out.println("Your sister is " + get_name());
    }

}
