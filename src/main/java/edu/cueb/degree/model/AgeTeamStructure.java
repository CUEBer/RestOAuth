package edu.cueb.degree.model;




public class AgeTeamStructure {
    private int total;
    private int under35;
    private int btw36_45;
    private int btw46_55;
    private int btw56_60;
    private int above60;
    public AgeTeamStructure(int total, int under35, int btw36_45, int btw46_55, int btw56_60, int above60) {
        super();
        this.total = total;
        this.under35 = under35;
        this.btw36_45 = btw36_45;
        this.btw46_55 = btw46_55;
        this.btw56_60 = btw56_60;
        this.above60 = above60;
    }
    public int getTotal() {
        return total;
    }
    public int getUnder35() {
        return under35;
    }
    public int getBtw36_45() {
        return btw36_45;
    }
    public int getBtw46_55() {
        return btw46_55;
    }
    public int getBtw56_60() {
        return btw56_60;
    }
    public int getAbove60() {
        return above60;
    }
}

