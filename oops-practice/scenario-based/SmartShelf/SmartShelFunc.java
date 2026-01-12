import java.util.*;
public class SmartShelFunc {
    List<String> books = new ArrayList<>();

    void addBook(String name){
        books.add(name);
        sort();
    }

    void removeBook(String name){
        books.remove(name);
    }

    void updateBook(String oldname, String newname){
        int index = books.indexOf(oldname);
        if(index >-1){
            books.set(index,newname);
            sort();
        }
    }
    void displayBooks(){
        for(String book: books){
            System.out.println(book);
        }
        System.out.println("-----");
    }
    void sort(){
        for(int i=0; i<books.size();i++){
            int j=i-1;
            while(j>=0 && books.get(j).compareToIgnoreCase(books.get(j+1))>0){
                String temp = books.get(j);
                books.set(j, books.get(j+1));
                books.set(j+1, temp);
                j--;
            }
        }
    } 
}
