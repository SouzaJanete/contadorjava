public class Contador {
    private int valor;

    public Contador() {
        valor = 0;
    }

    public void aumentar() {
        valor++;
    }

    public void diminuir() {
        valor--;
    }

    public void redefinir() {
        valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.println("Valor Inicial: " + contador.getValor());

        contador.aumentar();
        System.out.println("Valor após aumentar: " + contador.getValor());

        contador.diminuir();
        System.out.println("Valor após diminuir: " + contador.getValor());

        contador.redefinir();
        System.out.println("Valor após redefinir: " + contador.getValor());
    }
}
