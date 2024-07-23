package homeworks.homework05;

import java.util.Objects;

public class Program {
    private String name;
    private int rating;
    private int viewer;

    public Program() {
    }

    public Program(String name, int rating, int viewer) {
        this.name = name;
        this.rating = rating;
        this.viewer = viewer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getViewer() {
        return viewer;
    }

    public void setViewer(int viewer) {
        this.viewer = viewer;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", viewer=" + viewer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return rating == program.rating && viewer == program.viewer && Objects.equals(name, program.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, viewer);
    }
}
