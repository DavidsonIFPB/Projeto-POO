
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Relatorios {
    private ArquivoTxt a = new ArquivoTxt();
    private File arquivo = new File("arquivo.txt");
    
    public String porNome(String b){
        String texto ="";
        String linha = "";
        String frase = linha;
        String array[] = new String[100];
        a.lerArquivosTxt(1);
        try{
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {                 
                frase = br.readLine()+"\n";
                array = frase.split(" ");
            
            }
            br.close();
            fr.close();
            
        
        } catch (IOException ex) {            
        }    
    
        return "";   
    }
    
}
