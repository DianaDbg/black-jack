public enum Value {
    AS(1,"AS"),
    TWO(2,"TWO"),
    THREE(3,"THREE"),
    FOUR(4,"FOUR"),
    FIVE(5,"FIVE"),
    SIX(6,"SIX"),
    SEVEN(7,"SEVEN"),
    EIGHT(8,"EIGHT"),
    NINE(9,"NINE"),
    TEN(10,"TEN"),
    JACK(10,"JACK"),
    QUEEN(10,"QUEEN"),
    KING(10,"KING");
    
    private String symbole;
    
    private int points;
    
    private Value (int points, String symbole) {
        this.symbole = symbole;
        this.points = points;
    }
    
    public String getSymbole() {
        return this.symbole;
    }
    
    public int getPoints() {
        return this.points;
    }
}