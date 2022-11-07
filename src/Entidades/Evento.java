package Entidades;
import java.time.LocalDateTime;

public class Evento {
    public int id;
    public int responsavelId;
    public Categoria categoriaId;
    public String nome;
    public LocalDateTime data; 
    public String endereco;
    public String descricao;
    public int capacidade;
}
