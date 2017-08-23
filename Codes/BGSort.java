import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Test implements Comparator<String>{
	@Override
	public int compare(String a, String b){
		if(a==null){
			return 0;
		}
		if(b==null){
			return 0;
		}
		BigDecimal one = new BigDecimal(a);
		BigDecimal two = new BigDecimal(b);
		//System.out.println(one+" "+two);
		int result = two.compareTo(one);
		return result;
	}
}

public class BGSort {

	public static void main(String[] args) {
		 BigDecimal t1 = new BigDecimal(.12);
			BigDecimal t2 = new BigDecimal(0.12);
			//System.out.println("Compare "+t1.compareTo(t2));
		        Scanner sc= new Scanner(System.in);
		        int n=sc.nextInt();
		        String []s=new String[n+2];
		        
		        for(int i=0;i<n;i++){
		            s[i]=sc.next();
		            
		        }
		        
		        sc.close();
		       
		        //Arrays.sort(s,new Test());
		        Arrays.sort(s,(a,b)->{
		        	if(a==null){
		    			return 0;
		    		}
		    		if(b==null){
		    			return 0;
		    		}
		    		BigDecimal one = new BigDecimal(a);
		    		BigDecimal two = new BigDecimal(b);
		    		//System.out.println(one+" "+two);
		    		int result = two.compareTo(one);
		    		return result;
		        });
		        
		        
		        
		        
		        
		        
		       // ArrayList<BigDecimal> bList = new ArrayList<>();
		        //BigDecimal bg= null;
		       /* for(int i = 0 ; i<n-1; i++){
		        		for(int j = i + 1; j<n; j++){
		        			BigDecimal one = new BigDecimal(s[i]);
		        			BigDecimal two = new BigDecimal(s[j]);
		        			int result = one.compareTo(two);
		        			//System.out.println("Result is "+result);
		        			if(result==0){
		        				continue;
		        			}
		        			else
		        			if(result<=-1){
		        				String temp = s[i];
		        				s[i] = s[j];
		        				s[j]  = temp;
		        			}
		        		}
		        }*/
		        for(int i = 0 ; i<n ; i++){
		        	System.out.println(s[i]);
		        }
		        /*for(int i=0;i<n;i++){
		        	bg = new BigDecimal(s[i]);
		        	
		        	bList.add(bg);
		        }*/
		        //Collections.sort(bList);
		        //Collections.reverse(bList);
		        //System.out.println(bList);
		        /*for(BigDecimal b : bList){
		        	System.out.println(b);
		        }*/

	}

}
