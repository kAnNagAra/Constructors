public class programmingLangs {
    String languages;

    programmingLangs(){
        this.languages = "java";
    }
    programmingLangs(String languages){
        this.languages = languages;
    }

    public void getName(){
        System.out.println("Programming Language : " + this.languages);
    }

    public static void main(String[] args) {
        programmingLangs pl = new programmingLangs();
        programmingLangs pl1 = new programmingLangs("Python");

        pl.getName();
        pl1.getName();
    }
}
