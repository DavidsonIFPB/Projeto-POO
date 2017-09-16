import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoTxt {
    File arquivo = new File("arquivo.txt");
    
    public void criaArquivoTxt(String texto) {
        try{
            if(!arquivo.exists()){
                arquivo.createNewFile();
            }
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);            
            bw.write(texto);
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch (IOException ex){
        
        }
    
    }
    public String lerArquivosTxt(int a){
        String linha = "";
        String frase = linha;
        String array[] = new String[100];
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            //enquanto houver mais linhas
            while (br.ready()) {                
                frase = br.readLine()+"\n";
                array = frase.split(" ");
                if(a==1)
                    //retorna nomes
                    linha+=array[0]+"\n";
                else
                    if(a==2)
                        //retorna CPF                        
                       linha+=array[1];
                else
                    if(a==3)
                        //retorna dataDenascimento
                       linha+=array[2]+"\n"; 
                else
                    if(a==4)
                        //retorna dataDePagamento
                       linha+=array[3]+"\n"; 
                else
                    if(a==5)
                       //retorna Peso
                       linha+=array[4]+"\n"; 
            }
            br.close();
            fr.close();
        
        } catch (IOException ex) {            
        }            
                
        return linha;
    } 
    
        
    
        
    }
   
    

