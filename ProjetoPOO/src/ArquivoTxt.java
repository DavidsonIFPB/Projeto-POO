
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
    public String lerArquivoTxt(){
        String linha = "";
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            //enquanto houver mais linhas
            while (br.ready()) {
                //lê a proxima linha
                linha += br.readLine()+"\n";
            }
            br.close();
            fr.close();
        
        } catch (IOException ex) {            
        }            
        
        return linha;
    }      
        
    
        
    }
   
    

