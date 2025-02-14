package Models;

public class Livro {
    
    
        private String Titulo;
        private String Autor;
        private int NumeroDePaginas;
        private Double Preco;
       
        public Livro(String Titulo,String Autor, int NumeroDePaginas, Double Preco){
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.NumeroDePaginas = NumeroDePaginas;
        this.Preco = Preco;



}       
       
        public String getTitulo() {
            return Titulo;
        }
        public void setTitulo(String titulo) {
            Titulo = titulo;
        }
        public String getAutor() {
            return Autor;
        }
        public void setAutor(String autor) {
            Autor = autor;
        }
        public int getNumeroDePaginas() {
            return NumeroDePaginas;
        }
        public void setNumeroDePaginas(int numeroDePaginas) {
            NumeroDePaginas = numeroDePaginas;
        }
        public Double getPreco() {
            return Preco;
        }
        public void setPreco(Double preco) {
            Preco = preco;
        }
        
       
        
         

}
