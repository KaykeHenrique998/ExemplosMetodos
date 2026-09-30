class Livro {
    String titulo;
    int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo= titulo;
        this.paginas = paginas;
    }

    public void exibir(){
      System.out.println(titulo + " (" + paginas + " páginas)");
    }

}

public class Main {
    public static void main(String[] args) {
        Livro livro01 = new Livro("Jurassic park", 528);
        Livro livro02 = new Livro("Arte da guerra", 112);
        livro01.exibir();
        livro02.exibir();
    }
}
