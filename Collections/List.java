import java.util.*;

/*

	Serializable and clonable interfaces :-
	are implemented in all collection classes
	
	
	
	RandomAccess : - 
	interface is implemented only in arraylist and vector 
*/

class List
{
	public static void main(String ...ar)
	{

			ArrayList<Integer> al = new ArrayList<>();

			System.out.println("size = :" + al.size());

			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(40);
			al.add(40);
			al.add(40);
			al.add(40);

			al.add(2, 50);
			al.add(0, 100);
			System.out.println("size = :" + al.size());
			System.out.println("array = " + al);

			// method 1  to copy one arryalist in another array list
			ArrayList<Integer> al_new = new ArrayList<>(al);

			System.out.println("copied arraylist = " + al_new);
			al.add(80);
			System.out.println(al_new);

			// method  2 using add methiod
			ArrayList<Integer> alist = new ArrayList<>();
			alist.add(200);
			alist.addAll(al);
			System.out.println(alist.get(1)); // Value at particular index 
			System.out.println(alist.indexOf(100));
			//  alist.remove(0); // index is required 

			// to remove particular integer or object 
			alist.remove(alist.indexOf(100));
			System.out.println("ArrayList alist = " + alist);

			// iterators 
			Iterator<Integer> itr = alist.iterator();
		//        itr.next();
		//        System.out.println(itr.next());

		// hasNext()  returns true or false 
			while (itr.hasNext())
			{
			    System.out.println(itr.next());
			}

	}

	 int add(int a)
	  {
			a++;
			return a;
	  }	
	  
	  
	 public void linkedlist()
    	{	
    	
		 LinkedList<Integer> l = new LinkedList<>();
		// linked list acts as dequeue and queue and stack also 
		l.addFirst(2);
		l.addLast(3);
		l.removeFirst();
		l.removeLast();
		  l.addFirst(2);
		l.addLast(3);
		LinkedList<Integer> lc =  (LinkedList)l.clone();
		lc.remove(); // remove first element default 
	       System.out.println("++++++");
		for(Integer a:lc)
		{
		    System.out.println(a);
		}
    	}
		  
}
