/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilita;

import eccezioni.FileException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Studente
 * Rappresenta un file di testo.
 * Consente di scrivere sul file di testo e di
 * leggere dal file di testo
 */
public class TextFile 
{
    private char mode;
    private BufferedReader reader;
    private BufferedWriter writer;
    
    /**
     * Costruttore 
     * @param fileName pathname del file fisico da aprire 
     * @param mode indica la modalità di apertura del file.
     * può assumere due valori, W(Apertura in Scrittura),
     * R(apertura il lettura). Qualsiasi altro valore
     * assegnato a questo paramentro fa si che il file  venga aperto in
     * lettura.
     * @append Specifica se il file, quando è aperto in lettura
     * è aperto in append o no. Valore True = aperto in append, valore
     * Vlase = Aperto non in append
     * @throws FileNotFoundException sollevata quando il file non viene trovato
     * @throws IOException solllevatta quando non è possibile accedere al file
     */
    public TextFile(String fileName, char mode) throws FileNotFoundException, IOException
    {
        this.mode='R';
        if(mode=='W' || mode=='w')
            this.mode='W';
        
        if(this.mode=='R')
        {
            reader=new BufferedReader(new FileReader(fileName));
        }
            
        
        else
        {
            writer=new BufferedWriter(new FileWriter(fileName));
        }
    
    }
 
    public TextFile(String fileName, char mode, boolean append) throws FileNotFoundException, IOException
    {
        
        this.mode='R';
        if(mode=='W' || mode=='w')
            this.mode='W';
        
        if(this.mode=='R')
        {
            reader=new BufferedReader(new FileReader(fileName));
        }
            
        
        else
        {
            writer=new BufferedWriter(new FileWriter(fileName, append));
        }
    
    }
    
    /**
     * Scrive una stringa sul file aperto in lettura in scrittura
     * @param line la stringa da scrivere 
     * @throws FileException Quando il file è aperto in lettura anziche in scrittura
     * @throws IOException Sollevata qquando non è possibile accedere al file
     */
    public void toFile(String line) throws FileException, IOException
    {
        if (mode=='R')
        {
            throw new FileException("il file è aperto in lettura!!!");
        }
        else
            writer.write(line);
            writer.newLine();
    }
    
    /**
     * Legge una stringa da un file aperto in lettura
     * @return
     * @throws FileException viene sollevata quando il file è aperto in scrittura 
     * anzinche in lettura
     * viiene sollevata anche quando sono state lette tutte le righe del file
     * Quindi il  file è terminato
     * @throws IOException 
     */
    public String fromFile() throws FileException, IOException
    {
        String line;
        if (mode=='W')
        {
            throw new FileException("il file è aperto in scrittura");
        }
        else
            line=reader.readLine();
        
        if(line==null)
            throw new FileException("fine del file");
        return line;
    }
    
    /**
     * Chiude il file.
     * @throws IOException Sollevata qquando non è possibile accedere al file
     */
    public void close() throws IOException
    {
        if(mode=='R')
        {
            reader.close();
        }
        else
            writer.close();
    }
    
    
    
    
}
