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
public class HomeActivity2_Runner {
    public static void main(String[] args){
    Book b1 = new Book();
    b1.setauthor("J.R.R Tolkien");
    b1.setchapterNames(new String[]{"A long expected party","The shadow of the past","Three is company","A shortcut to mushrooms","A conspiracy unmasked","The old forest","In the house of Tom bombadil","Strider"});
    Book b2 = new Book("William Shakespeare",new String[]{"Act 1","Act 2","Act 3","Act 4","Act 5"});
    b1.Compare(b1, b2);
    b1.compareChapternames(b1, b2);
        System.out.println("Are the Authors of both books same? "+b1.Compare(b1, b2));
        System.out.println("The author of the book with greater chapters: "+b1.compareChapternames(b1, b2));
    }
    
}
