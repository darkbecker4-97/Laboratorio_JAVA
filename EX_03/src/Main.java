public class Main {
    public static void main(String[] args) {
       Quadrado quadrado1 = new Quadrado();
        quadrado1.lado = 4;
        double resultadoQua = quadrado1.calcularArea();
        System.out.println(resultadoQua);

        Quadrado quadrado2 = new Quadrado();
         quadrado2.lado = 4;
         double resultadoQuadr = quadrado2.calcularArea();
         System.out.println(resultadoQuadr);

        Triangulo triangulo1 = new Triangulo();
        triangulo1.altura = 4;
        triangulo1.base = 3;
        double resultadoTri = triangulo1.calcularArea();
        System.out.println(resultadoTri);

        Circunferencia c = new Circunferencia(2);
        System.out.println("Área da circunferência: " + c.calcularArea());

        Trapezio tr = new Trapezio(2, 4, 3);
        System.out.println("Área do trapézio: " + tr.calcularArea());

        Relogio relogio = new Relogio();
        relogio.acertarRelogio(3, 25, 50);

        System.out.println("Hora: " + relogio.lerHora());
        System.out.println("Minuto: " + relogio.lerMinuto());
        System.out.println("Segundo: " + relogio.lerSegundo());

     Fracao f1 = new Fracao(2, 3);
     Fracao f2 = new Fracao(3, 5);
     Fracao resultado = f1.multiplicar(f2);
     System.out.println(f1.getNumerador() + "/" + f1.getDenominador() + " * "
             + f2.getNumerador() + "/" + f2.getDenominador()
             + " = " + resultado.getNumerador()
             + "/" + resultado.getDenominador());
    }
}

