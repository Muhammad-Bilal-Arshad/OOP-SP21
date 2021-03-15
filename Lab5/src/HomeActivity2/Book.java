/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeActivity2;

/**
 *
 * @author B1LITE
 */
public class Book {
    private String author;
    private String[] chapterNames;
    public Book(){
        author = "Shakespeare";
        chapterNames = new String[]{"Act 1","Act 2","Act3","Act 4","Act 5"};
    }
    public Book(String a, String[] b){
    author = a;
    chapterNames = b;
    }
    public void setauthor(String a){
    author = a;
    }
    public void setchapterNames(String[] b){
    chapterNames = b;
    }
    public String getauthor(){
    return author;
    } 
    public String[] getchapterNames(){
    return chapterNames;
    }
    public boolean Compare(Book b1, Book b2){
    return b1.author.equals(b2.author);
    }
    public String compareChapternames(Book b1, Book b2){
    int d = b1.chapterNames.length;
    int e = b2.chapterNames.length;
    if(d>e)
        return b1.author;
    else
        return b2.author;
    }
    
}
