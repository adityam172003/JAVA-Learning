


import java.util.*;




class Myclass implements Comparable<Myclass>
{
    public int p;
    
    
    
    
    public int compareTo(Myclass a)
    {
        
        return -1*(this.p-a.p);
    }
    
    public String toString()
    {
        return ""+p;
    }
    
}


public class Comparable_class
{
    
    public static void main(String[] args)
    {
            ArrayList<Myclass> m = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<4;i++)
            {
                Myclass m1 = new Myclass();
                m1.p=  sc.nextInt();
                
                m.add(m1);
             
            }
             
             // uses default inplementation of Comparable interface implementation 
             // compareTo(Object ob)
            Collections.sort(m);
            System.out.println(m);
            
           // uses the below functional interface ie Comparator implementation 
           // compare(Object o1 ,Object o2);
          m.sort((c1,c2) ->{ return c2.p-c1.p;});
          System.out.println(m);
            
        
    }
    
}

