class house{
    protected Double surface;
    protected Door door;
    public void maison(){
        System.out.println("je suis maison ma surface est"+surface);
    }
    public int gets(){
        return surface;
    }
    public void sets(int s){
        surface=s;
    }
}
class Door{ 
    protected String color;
    public Door(){
        color="blue";
    }
    public Door(String color){
        this.color=color;
    }
        
    }
    public String getc(){
        return color;
    }
    public void sets(String c){
        color=c;
    }
    public void display(){
        System.out.println("je suis une porte, ma couleur est " +color);
    }
}
class appartement extends house{
    public appartement(){
    surface=50;
    }
    public void displaya(){
        System.out.println("je suis un appartement, ma surface est" +surface+"m2");

    }

}
class person{
    String nom;
    public void display(){
        System.out.println("mon nom"+nom+"ma maison est de surface"+gets()+"couleur du port"+getc());

    }
     public String getp(){
        return nom;
    }
    public void setp(String n){
        nom=n;
    }
}
class main{
    public static void main(String[] args){
        appartement app=new appartement();
        person p=new person();
        Scanner sc=new Scanner(System.in);
        System.out.println("surface?");
        int s=sc.nextDouble();
        app.sets(s);
        System.out.println("dor color?");
        String c=sc.nextString();
        app.setc(c);
        System.out.println("nom?");
        String n=sc.nextString();
        p.setp(n);
        p.display();



    }
}