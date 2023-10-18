


/*

	Serializable and clonable interfaces :-
	are implemented in all collection classes
	: To hold and carry the  object from one place to another 
	
	
	
	RandomAccess : - 
	It is a marker interface 
	does not contain any method 
	interface is implemented only in arraylist and vector 
	
	
	
	List Interface :
	
	ArrayList : 
		frequent operation is retrival we can go with arraylist
		insertion in middle arraylist is worst coice 
		no method is synchronized 
		but we can synchronize it using 
		:- Collection.synchronizedList(List l); 
		method 
		
		
	Similarly we can get synchornized version of Set and Map 
	
	synchronizedSet(Set s);
	synchronizedMap(Map m);
	
		
	LInkedList :
	 frequent operation is insertion and deletion 
	 uses doubley linked list as underlying datastructure 
	 if frequent operation is retrival then Linkedlist is worst choice 
	 
	 
				
		
*/

