
package word.count;
import java.io.File;
import java.util.*;
public class WordCount {

    public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner (System.in);
       
        System.out.print("Enter file's name : ");
        String filename = in.nextLine();
        //System.out.println("");
        File file = new File (filename+".txt");int words = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNext())
        {
            String line = sc.nextLine();
        words+= line.split(" ").length;
        }
        System.out.println(words+" : words ");
    }
    
}
