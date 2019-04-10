package pl.edu.ur.oopl5.stack;
import java.util.EmptyStackException;   

/**
 */
public class Stack extends AbstractStack {
    
        int index ;
        int [] tab;
    public Stack(int a){
          tab = new int [a];
          index=0;
    }
    
    @Override
    public void push(int i) {
        
        if(index<tab.length){
            tab[index]=i;
            System.out.println("Wprowadzona zmienna: "+i);
            System.out.println("Liczba w tabeli na pozycji: "+index+": "+tab[index]);
            System.out.println("Index przed zmian¹: "+index);
            index++;
            System.out.println("Index po zmianie: "+index);
        }
        else{
            throw new StackOverflowError();
        }
    }

    @Override
    public int pop() {
        
        if(index<=0){
            throw new EmptyStackException();
        }
            int troll = tab[index-1];
            System.out.println("Liczba w tabeli na pozycji: "+index+": "+tab[index]);
            System.out.println("Index przed zmian¹: "+index);
            index--;
            System.out.println("Index po zmianie: "+index);
        return troll;
    }

    @Override
    public boolean isEmpty() {
        
        if(index==0){
            return true;
        }
        else{
            return false;
        }
    }
 }
