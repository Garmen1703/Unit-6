public class Album{
  private String title,artist;
  private int tracks;
  private double time;

  public Album(String name, String artist, int songs, double total){
    title = name;
    this.artist = artist;
    tracks = songs;
    time = total;
  }

  public String toString(){
    String result = "";
    result += title + " by " + artist + " | " + tracks + " tracks, ";
    result += "Play Time: " + time + " minutes";
    return result;
  }

  public String getTitle(){
    return title;
  }
}
