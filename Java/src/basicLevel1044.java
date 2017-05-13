import java.util.Scanner;

public class basicLevel1044 {

	public static void main(String[] args) {

		String num[] = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
		String high[] = {"0", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String number[] = new String[n];
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			if (str.charAt(0) <= '9' && str.charAt(0) >= '0') {
				Integer integer = new Integer(str);
				if (integer)
			}
		}
}

	/*
				Integer cast = new Integer(str);
				if(cast/13>0)ans[i]=gao[cast/13];
				if(cast==0){ans[i]="tret"; continue;}
				if(cast%13==0)continue;
				if(ans[i] != null)ans[i]=ans[i]+" "+num[cast%13];
				else ans[i]=num[cast%13];
			}else{
				Integer f=0;
				for(int k=1;k<13;k++){
					if(str.indexOf(gao[k])!=-1){

						f=k*13;
						break;
					}
				}
				for(int k=0;k<13;k++){
					if(str.indexOf(num[k])!=-1){
						f=f+k;
						break;
					}
				}
				ans[i]=f.toString();
			}
		}
		for(String s:ans)System.out.println(s);
	}
}
	*/