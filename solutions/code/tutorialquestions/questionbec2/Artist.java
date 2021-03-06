package tutorialquestions.questionbec2;

import java.util.ArrayList;
import java.util.List;

public class Artist {

  private String name;

  private List<Record> cataloue;

  private Genre mainGenre;

  /**
   * Create an artist given a name and main genre.
   */
  public Artist(String name, Genre mainGenre) {
    this.name = name;
    this.cataloue = new ArrayList<Record>();
    this.mainGenre = mainGenre;
  }

  public void addRecord(String name) {
    addRecord(name, mainGenre);
  }

  /**
   * Add a record to the catalogue with the given name and genre.
   */
  public void addRecord(String name, Genre genre) {
    cataloue.add(new Record(name, genre));
  }

  /**
   * Show details of the catalogue, to standard output.
   */
  public void showCatalogue() {
    for (Record r : cataloue) {
      System.out.println(r);
    }
  }

  /**
   * Show details of all records in the catalogue matching the given genre.
   */
  public void showGenre(Genre genre) {
    for (Record r : cataloue) {
      if (r.getGenre() == genre) {
        System.out.println(r);
      }
    }

  }

  public String getName() {
    return name;
  }

}
