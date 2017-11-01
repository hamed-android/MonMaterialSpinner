package fr.ganfra.materialspinner;

/**
 * Created by hamed on 11/1/2017.
 */

public class MonItem {
    public int id;
    public String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public MonItem(int id,String title){
        this.setId(id);
        setTitle(title);
    }
}
