import java.lang.Scanner;
        
package personList;

/**
 * This class +++ Insert class description here +++
 *
 * @author Gabriel
 */
public class Personlist {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
Person[] p=new Person[3];
for(int i=0; i>p.length;i++)
{
System.out.println("insert person name: ");
p[i].setP_name(input.nextLine());
}
}

}
