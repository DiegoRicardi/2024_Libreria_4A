/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Rappresenta un dispositivo per acquisire dati di input
 * di ciascun tipo nativo e dati di tipo string
 * dalla console input, ossia dalla tastiera.
 * 
 * Ad esempio:
 * ConsolemInput tastiera = new ConsoleInput():
 * tastiera.readString --> restituisce una stringa inserita con la tastiera
 * tastiera.readint --> restituisce un  numero intero inserito con la tastiera
 * @author Studente
 */
public class ConsoleInput 
{
    private InputStreamReader reader;
    private BufferedReader tastiera;
    
    /**
     * Costruttore
     */
    public ConsoleInput()
    {
        reader=new InputStreamReader(System.in);
        tastiera=new BufferedReader(reader);
        
    }
    
    /**
     * Legge una stringa
     * @return la stringa letta da tastiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * 
     */
    public String readString() throws IOException, NumberFormatException
    {
        return tastiera.readLine();
    }
    
    /**
     * Legge un intero
     * @return il numero letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente
     * se viene inserito un vaolore che non è un numero intero,
     * ad esepio "Ciao" o "10,2"
     */
    public int readInt() throws IOException, NumberFormatException
    {
        String s=tastiera.readLine();
        int x=Integer.parseInt(s);
        return x;
    }
    
    /**
     * Legge un intero short
     * @return il numero letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente
     * se viene inserito un vaolore che non è un numero intero,
     * ad esepio "Ciao" o un numero troppo grande
     */
    public short readShort() throws IOException, NumberFormatException
    {
        return Short.parseShort(tastiera.readLine());
    }
    
    /**
     * Legge un carattere
     * @return il carattere letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente
     * 
     */
    public char readChar() throws IOException, NumberFormatException
    {
        return tastiera.readLine().charAt(0);
    }
    
    /**
     * Legge un intero long
     * Se vengono inseriti più caratteri, restituisce
     * solo il primo dei caratteri letti.
     * @return il numero letto da stiera
     * @throws IOException errore di input
     */
    public Long readLong() throws IOException, NumberFormatException
    {
        return Long.parseLong(tastiera.readLine());
    }
    
    /**
     * Legge un float
     * @return il numero letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente
     * se viene inserito un vaolore che non è un numero float,
     * ad esepio "Ciao" o un numero troppo grande
     */
    public float readFloat() throws IOException, NumberFormatException
    {
        return Float.parseFloat(tastiera.readLine());
    }
    
    /**
     * Legge un numero double
     * @return il numero letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente
     * se viene inserito un vaolore che non è un numero double,
     * ad esepio "Ciao" o "10,2"
     */
    public double readDouble() throws IOException, NumberFormatException
    {
        return Double.parseDouble(tastiera.readLine());
    }
    
    /**
     * Legge una variabile booleana
     * @return il numero letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException errore di input 
     * Qualunque valore inserito diverso da "True" restituisce "false"
     */
    public Boolean readBoolean() throws IOException, NumberFormatException
    {
        return Boolean.parseBoolean(tastiera.readLine());
    }
    
    /**
     * Legge un numero byte
     * @return il numero letto da stiera
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente
     * se viene inserito un vaolore che non è un numero byte,
     * ad esepio "Ciao" o "-129" o "128", poichè sono fuori dal erange dei numery byte
     */
    public byte readByte() throws IOException, NumberFormatException
    {
        return Byte.parseByte(tastiera.readLine());
    }
    
    
}
