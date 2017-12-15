package ss_laba;
import java.util.Scanner;
public class main_sslaba {
			    public static void main(String[] args){
			        Scanner sc = new Scanner(System.in);
			        int n;
			        System.out.println("число: ");
			        do {
			            n = sc.nextInt();
			        }while(!(n > 0) || !(n <= 1000) );

			        String[] groups = new String[n];
			        for (int i = 0; i < n; i++) {
			            groups[i] = "";
			            System.out.print("Группа " + (i+1) + ": ");
			            for (int j = 0; j < 7 ; j++) {
			                groups[i] = groups[i].concat(String.valueOf(Math.round(Math.random())));
			            }
			            System.out.println(groups[i]);
			        }
			        System.out.println();
			        int minAud = 1;
			        for (int i = 0; i < 7; i++) {
			            int temp = 0;
			            for (int j = 0; j < n; j++) {
			                if (groups[j].charAt(i) == '1')
			                    temp++;
			            }
			            if( temp > minAud) minAud = temp;
			        }
			        System.out.println("Минимальное кол-во аудиторий " + minAud);
			    }
			}

