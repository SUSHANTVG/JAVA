import java.util.Scanner;

class SpeedDial {
    static StringBuffer returnDigits(String name) {
        StringBuffer sb = new StringBuffer();

        char c;
        int digit;

        name = name.toLowerCase();

        for(int i=0;i<name.length();i++) {
            c = name.charAt(i);
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    digit = 2;
                    sb.append(digit);
                    break;
                
                case 'd':
                case 'e':
                case 'f':
                    digit = 3;
                    sb.append(digit);
                    break;

                case 'g':
                case 'h':
                case 'i':
                    digit = 4;
                    sb.append(digit);
                    break;

                case 'j':
                case 'k':
                case 'l':
                    digit = 5;
                    sb.append(digit);
                    break;

                case 'm':
                case 'n':
                case 'o':
                    digit = 6;
                    sb.append(digit);
                    break;

                case 'p':
                case 'q':
                case 'r':
                case 's':
                    digit = 7;
                    sb.append(digit);
                    break;

                case 't':
                case 'u':
                case 'v':
                    digit = 8;
                    sb.append(digit);
                    break;
            
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    digit = 9;
                    sb.append(digit);
                    break;

                default:
                    System.out.println("No numbers and special characters allowed.");
                    break;
            }
        }

        return sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.next();

        System.out.println( returnDigits(name) );
        
        if(sc!=null)
            sc.close();
    }
}
