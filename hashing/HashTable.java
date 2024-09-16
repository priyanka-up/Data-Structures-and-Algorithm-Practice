package hashing;
//resizing the array -avoid collision

import java.util.ArrayList;

public class HashTable {
	private int slots;
	private ArrayList <HashEntry> bucket;
	private int size;
	
	public HashTable()
	{
		bucket = new ArrayList <HashEntry>();
		slots =10;
		size = 0;
		
		//initialize bucket
		for(int i=0; i<slots; i++)
		{
			bucket.add(null);
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size() == 0;
	}
	
	//hash function
	private int getIndex(String key)
	{
		//hashCode is a build in function of string
		//hashcode is a function in java that return a hashcode value of an object on calling
		
		int hashCode = key.hashCode();
		int index = hashCode % slots;
		
		//check if index is negetive
		if(index <0)
		{
			index = (index + slots) % slots;
		}
		return index;		
	}
	
	//insert a key value pair into the table
	public void insert(String key, int value)
	{
		//find head of the chain
		int b_index = getIndex(key);
		HashEntry head = bucket.get(b_index);
		
		//checks if key is already exists
		while(head != null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		//insert key in the chain
		size++;
		head = bucket.get(b_index);
		HashEntry new_slot = new HashEntry(key, value);
		new_slot.next = head;
		bucket.set(b_index, new_slot);
		
		//checks if array>60% of array gets filled
		if((1.0*size)/slots > 0.6)
		{
			ArrayList<HashEntry> temp = bucket;
			bucket = new ArrayList();
			slots = 2* slots;
			size =0;
			
			for(int i=0; i<slots; i++)
			{
				bucket.add(null);
			}
			
			for(HashEntry head_node : temp)
			{
				while(head_node != null)
				{
					insert(head_node.key,head_node.value);
					head_node = head_node.next;
				}
			}
		}
	}
	
	//search a value already present in the key
	//return a value for a given key
	
	public int getValue(String key)
	{
		//find a head of chain
		int b_index = getIndex(key);
		HashEntry head = bucket.get(b_index);
		
		while(head != null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head = head.next;
		}
		return -1;
	}
	
	public int delete(String key)
	{
		//find index
		int b_index = getIndex(key);
		
		//get head of the chain for that index
		HashEntry head = bucket.get(b_index);
		
		//find if key is exists
		HashEntry prev = null;
		while(head != null)
		{
			if(head.key.equals(key))
				break;
			else
				//keep moving
				prev = head;
			    head = head.next;		
		}
		
		//if key does not exist
		if(head == null)
			return -1;
		
		//decrease size by 1
		size--;
		
		//remove key
		if(prev != null)
			prev.next = head.next;
		else
			bucket.set(b_index, prev.next);
			
		return head.value;
	}
	
}
