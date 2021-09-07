package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        FiguraBidimensional fig1;
        FiguraBidimensional fig2;
        
        fig1 = new FiguraBidimensional("Primer_cuadrado");
        System.out.println(fig1.area());
        
        fig2 = new Cuadrado("Segundo_cuadrado",5);
        //fig2.lado = 5;
        
        System.out.println(fig2.area());
    } 
}
