public class twentythree {
public static void main (String args []){
pen p1 = new pen();
p1.setcolour("blue");
System.out.print(p1.colour);
}
}
class pen {
    String colour;
    int tip;
    
    void setcolour(String newcolour){
        colour = newcolour ;
    }
    void settip(int newtip){
        tip = newtip ; 
    }

}

