/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text1;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class Text1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // System.out.println("Hello world");
        //TextChange gui = new TextChange();
        //gui.setVisible(true);
        //gui.setTitle("myApp");
        
        ArrayList<Integer>myNums=new ArrayList<Integer>();
        myNums.add(2);
        myNums.add(20); 
        for(int i=10;i<20;i++)
        {
            myNums.add(i);
        }
        System.out.println(myNums);
        for(int i:myNums)
        {
            System.out.println(i-1);
        }
    }
    
}
