package te.app.ossman_elmonkz.utils.PopUp;

public class PopUp {
    private String name;
    private int id;

    public PopUp() {
    }

    public PopUp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
