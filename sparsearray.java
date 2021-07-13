import java.util.*;

public class sparsearray
{
    static int[] match(String[] s,String[] q)
    {
        Map<String,Integer> map = new HashMap<>();
        int[] result = new int[q.length];
        for(int i=0;i<s.length;i++)
        {
            String input = s[i];
            if(map.containsKey(input))
                map.put(input,map.get(input)+1);
            else
                map.put(input,1);
        }
        for (int i=0;i<q.length;i++)
        {
            String input_q = q[i];
            if(map.containsKey(input_q))
                result[i]= map.get(input_q);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements : ");
        int n = sc.nextInt();
        String s[] = new String[n];
        System.out.println("Enter the elements in array : ");
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        System.out.println("Enter the number of elements in queries : ");
        int m = sc.nextInt();
        String q[] = new String[m];
        System.out.println("Enter the elements in queries : ");
        for(int i=0;i<m;i++)
        {
            q[i]=sc.next();
        }
        System.out.println("Results : ");
        int[] counter = match(s, q);
		for(int i=0;i< counter.length;i++)
            System.out.println(counter[i]);
		sc.close();
    }
}