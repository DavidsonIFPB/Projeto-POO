
public class Professor extends Pessoa{
    static private int qtdEspecialidade;
    private String especialidade[];
    private String datadeRecebimento;    
    private boolean empregado;
    private Pessoa a;
    
    public Professor(){
        this.especialidade= new String [5];
        this.empregado = true;
    }
    
    @Override
    public void cadastraPessoa(String nome,String CPF,
            String datadeNascimento,String dataDePagamento,double Peso) {
        super.CPF= CPF;
        super.nome = nome;
        super.dataDeNascimento = dataDeNascimento;
        this.datadeRecebimento = dataDePagamento;
        super.pesoAtual = Peso;
        
    }
    
    @Override
    public String Relatorio(){
        String texto;
        if(this.empregado)
            texto = "Matriculado | ";
        else
            texto = "Nao matriculado |";    
        texto += "Nome:"+this.nome+ "|";
        texto +="Data de Recibimento:"+this.datadeRecebimento;
        
        return texto;
    
    }
    
    @Override
    public String getDatadePagamento(){
        return this.datadeRecebimento;
    }
    
    
}
