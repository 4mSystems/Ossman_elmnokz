package te.app.ossman_elmonkz.pages.buying.models;


public class DataFromSearchRequest {
    private String category_id;
    private String sub_category_id;
    private String partion_id;
    private String modell_id;
    private String brand_id;

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getSub_category_id() {
        return sub_category_id;
    }

    public void setSub_category_id(String sub_category_id) {
        this.sub_category_id = sub_category_id;
    }

    public String getPartion_id() {
        return partion_id;
    }

    public void setPartion_id(String partion_id) {
        this.partion_id = partion_id;
    }

    public String getModell_id() {
        return modell_id;
    }

    public void setModell_id(String modell_id) {
        this.modell_id = modell_id;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }
}
