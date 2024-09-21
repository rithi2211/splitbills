import java.util.*;
public class SplitBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x,y,i,j;
        System.out.println("Enter no. of players:");
        x=sc.nextInt();
        System.out.println("Enter their names:");
        Player arr[]= new Player[x];
        int gpaid[] = new int[x];
        for(i=0;i<x;i++){
            arr[i] = new Player(sc.next(),x);
        }
        System.out.println("\n\n\t\t\t******\n\n");
        for(i=0;i<x;i++){
            System.out.println(arr[i].n+":"+(i+1));
        }
        System.out.println("\n\n");
        int k,d=0,t;
        j=1;
        while(1==1){
            System.out.println("\n\n\t\t\t******\n\n");
            System.out.println("EVENT-"+j);
            System.out.println("Who is paying?");
            y=sc.nextInt();
            System.out.println("Enter Amount:");
            k = (sc.nextInt());
            arr[y-1].eval=arr[y-1].eval-k;
            System.out.println("Who all are getting paid?\n(-1:exit,0:all)");
            while((t=sc.nextInt())!=-1){
                if(t==0){
                    for(i=0;i<x;i++)
                    arr[i].eval=arr[i].eval+ (k/x);
                    break;
                }
                else{
                    gpaid[t]=1;
                    d++;
                }
            }
            if(t!=0){
                for(i=0;i<x;i++)
                    if(gpaid[i]==1) arr[i].eval=arr[i].eval + (k/d);
            }
            for(i=0;i<x;i++)
                    gpaid[i]=0;
            d=0;
            System.out.println("Enter 0 to exit, any other to continue:");
            if (sc.nextInt()!=0){
                j++;
            }
            else{
                break;
            }
        }
        for(i=0;i<x;i++){
            if(arr[i].eval==0)
                continue;
            else if(arr[i].eval>0){
                for(j=i+1;j<x;j++){
                    if(arr[j].eval<0){
                        if(arr[i].eval>(-arr[j].eval)){
                            arr[i].eval=arr[i].eval+arr[j].eval;
                            arr[i].a[j]=-(arr[j].eval);
                            arr[j].a[i]=(arr[j].eval);
                            arr[j].eval=0;
                        }
                        else{
                        	arr[i].a[j]=(arr[i].eval);
                            arr[j].a[i]=-(arr[i].eval);
                            arr[j].eval=arr[j].eval+arr[i].eval;
                            arr[i].eval=0;
                        }
                        if(arr[i].eval==0)
                        	break;
                    }
                }
            }
            else{
                for(j=i+1;j<x;j++){
                    if(arr[j].eval>0){
                        if(arr[i].eval>(-arr[j].eval)){
                            arr[j].eval=arr[j].eval+arr[i].eval;
                            arr[j].a[i]=-(arr[i].eval);
                            arr[i].a[j]=(arr[i].eval);
                            arr[j].eval=0;
                        }
                        else{
                        	arr[j].a[i]=(arr[j].eval);
                            arr[i].a[j]=-(arr[j].eval);
                            arr[i].eval=arr[i].eval+arr[j].eval;
                            arr[j].eval=0;
                        }
                        if(arr[i].eval==0)
                        	break;
                    }
                }
            }
        }
        for(i=0;i<x;i++) {
        	System.out.println(arr[i].n+":-");
        	for(j=0;j<x;j++) {
        		if(arr[i].a[j]!=0) {
        			if(arr[i].a[j]<0) System.out.println(arr[j].n+" has to pay "+-(arr[i].a[j])+" to "+arr[i].n);
        			else if(arr[i].a[j]>0) System.out.println(arr[j].n+" will receive "+(arr[i].a[j])+" from "+arr[i].n);
        		}
        	}
        }
	}
}

