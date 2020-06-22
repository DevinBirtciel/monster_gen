package unorganized;

public enum Race {
  ANY_RACE("any race"), HUMAN("human");

  private String description;
  Race(String description){
    this.description = description;
  }

  public String getDescription(){
    return description;
  }
}
