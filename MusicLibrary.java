public class MusicLibrary{
  private Album[] library;

  public MusicLibrary(){
    library = new Album[10];
  }

  public void add(Album album){
    for(int i = 0; i < library.length; i++){
      if(library[i] == null){
        library[i] = album;
      }
    }
  }

  public String toString(){
    String result = "";
    for (Album a : library){
      result += a.toString() + ".\n";
    }
    return result;
  }

  public Album getAlbum(int index){
    return library[index];
  }

  public void sortByTitle(){
    Album temp;
    int min;
    for (int i = 0; i < library.length-1; i++){
      min = i;
      for(int scan = i+1; scan < library.length; scan++){
        if(library[scan].getTitle().compareTo(library[min].getTitle())<0){
          min = scan;
        }
      }
      temp = library[min];
      library[min]=library[i];
      library[i]=temp;
    }
  }
  public void doubleSize(){
    Album[] newlibrary = new Album[20];
    for(int i = 0; i < library.length; i++){
      newlibrary[i] = library[i];
    }
  }
  public void remove(int amount){
    Album[] extralibrary = new Album[10-amount];
    for(int i = 0; i < extralibrary.length; i++){
      extralibrary[i] = library[i];
    }
  }
}
