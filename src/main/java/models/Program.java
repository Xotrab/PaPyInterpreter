package models;

import java.util.ArrayList;
import java.util.List;

public class Program {

    private List<Section> sections;

    public Program(){
        sections = new ArrayList<Section>();
    }

    public void addSection(Section s) {
        sections.add(s);
    }

}
