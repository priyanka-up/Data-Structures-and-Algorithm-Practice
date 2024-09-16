package ds;

// below are the two main problems in hash table
//hash collision 
//rehashing

/*
 Hashmap vs Hashtable
1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper 
synchronization code whereas Hashtable is synchronized.It is thread-safe and can be shared with many threads.

2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.

3. HashMap is generally preferred over HashTable if thread synchronization is not needed

Why HashTable doesn’t allow null and HashMap does?
To successfully store and retrieve objects from a HashTable, the objects used as keys must implement
 the hashCode method and the equals method. Since null is not an object, it can’t implement these 
 methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.
 */

public class BasicHashTable<X,Y> {
	
	private HashEntry[] data;
	private int capacity;
	private int size;
	
	public BasicHashTable(int tableSize) {
		this.capacity	= tableSize;
		this.data = new HashEntry[this.capacity];
		this.size = 0;
		
	}
	
	public int size() {
		return this.size;
	}
	
	public Y get(X key)
	{
		int hash = calculateHash(key);
		
		//if we could not find the value of that key we simple return null
		if(data[hash] == null)
		{
			return null;
		}
		else
		{
			return (Y)data[hash].getValue();
		}
	}
	
	public void put(X key, Y value)
	{
		int hash = calculateHash(key);
		data[hash] = new HashEntry<X, Y>(key, value);
		size++;
	}
	
	public Y delete(X key)
	{
		//first get the value for this key so, it can be returned
		Y value = get(key);
		
		//clear out the hash table slot for the key and removed the return value
		if(value!= null)
		{
			int hash = calculateHash(key);
			data[hash] = null;
			size--;
			//to avoid collision
			hash = (hash+1) % this.capacity;
			
			//if the next slot is not empty we should re add it so we can keep the hash algorithm clean
			while(data[hash] != null)
			{
				HashEntry he =data[hash];
				data[hash] = null;
				//System.out.println("Rehashing: " + he.getKey() + " - " + he.getValue());
				put((X)he.getKey(), (Y)he.getValue());
				//we repositioned the hash item and did not really add a new one so back off the size
				size--;
				hash = (hash + 1) % this.capacity;
			}
			
		}
		return value;
	}
	
	public boolean hasKey(X key)
	{
		int hash = calculateHash(key);
		
		//if we don't have anything for the given key, we can just return false;
		if(data[hash] == null)
		{
			return false;
		}
		else
		{
			if(data[hash].getKey().equals(key))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean hasValue(Y value)
	{
		//loop through all the hasEntry
		for(int i=0; i<this.capacity; i++)
		{
			HashEntry entry = data[i];
			
			//if this hash entry is not null and the value equals the one passed in, the hashTable has the value
			if((entry != null) && (entry.getValue().equals(value)))
			{
				return true;
			}
		}
		return false;
		
	}
	
	private int calculateHash(X key)
	{
		//find out the index or hash slot

	int hash = (key.hashCode() % this.capacity);
	//this is necessary to deal with collision
	while(data[hash]!= null && !data[hash].getKey().equals(key))
	{
		hash = (hash + 1) % this.capacity;
	}
	return hash;
	
	
	}
	
	private class HashEntry<X, Y>
	{				
		private X key;
		private Y value;
		
		public HashEntry(X key, Y value)
		{
			this.key = key;
			this.value = value;
		}
		
		public X getKey() {
			return key;
		}
		public void setKey(X key) {
			this.key = key;
		}
		public Y getValue() {
			return value;
		}
		public void setValue(Y value) {
			this.value = value;
		}

		
	}

}
