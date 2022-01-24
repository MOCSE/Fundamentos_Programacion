package ColasDePrioridad;

public enum Gravity {
    
    MINOR("Minor",1),
    MODERATE("Moderate",2),
    SEVERE("Severe",3),
    VERY_SEVERE("Very Severe",4);
    
    private String descripction;
    private Integer level;

    private Gravity(String descripction, Integer level) {
        this.descripction = descripction;
        this.level = level;
    }

    public String getDescripction() {
        return descripction;
    }

    public void setDescripction(String descripction) {
        this.descripction = descripction;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    
    
}

