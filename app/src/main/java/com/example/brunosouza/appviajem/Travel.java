package com.example.brunosouza.appviajem;

public class Travel {

    private String titulo;
    private String informacao;
    private String valor;
    private EstadoAtual estado;
    private Categoria categoria;

    public Travel(String titulo, String informacao, EstadoAtual estado, Categoria categoria) {
        this.titulo = titulo;
        this.informacao = informacao;
        this.estado = estado;
        this.categoria = categoria;
    }
    public String getTitulo() {
        return titulo;
    }

    public EstadoAtual getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtual estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String toString() {
        return "Curso: " + titulo + " Descrição: " +
                informacao + " Estado: " + estado;
    }
}
