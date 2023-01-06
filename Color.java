public enum Color {
    HEART("\u2661"),
    SPADE("\u2660"),
    CLUB("\u2663"),
    DIAMOND("\u2662");
    
    private String symbole;
    
    private Color(String symbole) {
        this.symbole = symbole;
    }
    
    public String getSymbole() {
        return this.symbole;
    }
}
