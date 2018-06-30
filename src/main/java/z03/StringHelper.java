package z03;

public class StringHelper {


    private static int insert (char[]t, char letter, int i, int n){
        for(int k =0; k<n;k++) {
            t[i++] = letter;
        }
        return i;
    }

   public static void sortChars(char []t){

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

        for(char letter:t){
            switch (letter){
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                case 'd':
                    d++;
                    break;
                case 'e':
                    e++;
                    break;
                 case 'f':
                    f++;
                    break;

            }
        }
        int i = insert(t,'a',0,a);
        i = insert(t,'b', i, b);
        i = insert(t,'c', i, c);
        i = insert(t,'d', i, d);
        i = insert(t,'e', i, e);
        i = insert(t,'f', i, f);
    }








    }


