
import java.io.BufferedWriter;
import java.io.File;
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
   
    
}
