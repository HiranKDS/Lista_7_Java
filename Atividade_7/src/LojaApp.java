public class LojaApp {
    public static void main(String[] args) throws Exception {
        Produto[] produtos = new Produto[5];
        produtos[0] = new CD("CD: Que país é este", 14.9, 9);
        produtos[1] = new DVD("DVD: Matrix", 24.9, 90);
        produtos[2] = new Livro("Livro: O Senhor dos Anéis", 50.0, "Tolkien");
        produtos[3] = new Livro("Livro: Harry Potter", 39.9, "J. K. Rowling");
        produtos[4] = new DVD("DVD: Inception", 29.9, 100);
        for (Produto p : produtos)
          System.out.println(p);
      }
    }
